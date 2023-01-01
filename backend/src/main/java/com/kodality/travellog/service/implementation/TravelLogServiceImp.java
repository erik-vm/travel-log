package com.kodality.travellog.service.implementation;

import com.kodality.travellog.exception.TravelLogNotFoundException;
import com.kodality.travellog.exception.VehicleInvalidOdometerException;
import com.kodality.travellog.model.Owner;
import com.kodality.travellog.model.TravelLog;
import com.kodality.travellog.model.Vehicle;
import com.kodality.travellog.repository.TravelLogRepository;
import com.kodality.travellog.service.OwnerService;
import com.kodality.travellog.service.TravelLogService;
import com.kodality.travellog.service.VehicleService;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Singleton
public class TravelLogServiceImp implements TravelLogService {

    private final TravelLogRepository repository;

    private final OwnerService ownerService;

    private final VehicleService vehicleService;

    public TravelLogServiceImp(TravelLogRepository repository, OwnerService ownerService, VehicleService vehicleService) {
        this.repository = repository;
        this.ownerService = ownerService;
        this.vehicleService = vehicleService;
    }

    @Override
    public TravelLog saveNewTravelLog(TravelLog travelLog) {
        Vehicle vehicle = vehicleService.findVehicleById(travelLog.getVehicleId());
        checkAndSetVehiclesNewOdometer(travelLog, vehicle);
        return repository.save(travelLog);
    }

    @Override
    public TravelLog findTravelLogById(Integer travelLogId) {
        Optional<TravelLog> travelLogOptional = repository.findById(travelLogId);
        if (travelLogOptional.isEmpty()){
            throw new TravelLogNotFoundException(travelLogId);
        }
        return travelLogOptional.get();
    }

    @Override
    public List<TravelLog> findAllTravelLogs() {
        return (List<TravelLog>) repository.findAll();
    }

    @Override
    public List<TravelLog> findAllTravelLogsByVehicleId(Integer vehicleId) {
        return repository.findByVehicleId(vehicleId);
    }

    @Override
    public List<TravelLog> findAllTravelLogsByVehicleRegNumber(String regNumber) {
        Vehicle vehicle = vehicleService.findVehicleByRegNumber(regNumber);
        return findAllTravelLogsByVehicleId(vehicle.getVehicleId());
    }

    @Override
    public List<TravelLog> findAllTravelLogsBetweenDates(Date dateFrom, Date dateTo) {
        return repository.findByTravelDateBetween(dateFrom, dateTo);
    }

    @Override
    public List<TravelLog> findAllTravelLogsByVehicleOwnerName(String firstName, String lastName) {
        Owner owner = ownerService.findOwnerByFirstNameAndLastName(firstName, lastName);
        Vehicle vehicle = vehicleService.findVehicleById(owner.getOwnerId());
        return findAllTravelLogsByVehicleId(vehicle.getVehicleId());
    }


    private void checkAndSetVehiclesNewOdometer(TravelLog travelLog, Vehicle vehicle) {
        if (travelLog.getOdometerAtTheEnd() <= vehicle.getCurrentOdometer()){
            throw new VehicleInvalidOdometerException();
        }
        vehicle.setCurrentOdometer(travelLog.getOdometerAtTheEnd());
        vehicleService.saveNewVehicle(vehicle);
    }


}
