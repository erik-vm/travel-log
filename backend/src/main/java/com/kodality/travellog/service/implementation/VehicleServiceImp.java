package com.kodality.travellog.service.implementation;

import com.kodality.travellog.model.Vehicle;
import com.kodality.travellog.repository.VehicleRepository;
import com.kodality.travellog.service.VehicleService;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class VehicleServiceImp implements VehicleService {

    private final VehicleRepository repository;

    public VehicleServiceImp(VehicleRepository repository) {
        this.repository = repository;
    }


    @Override
    public Vehicle saveNewVehicle(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    @Override
    public Vehicle findVehicleById(Integer vehicleId) {
        return repository.findById(vehicleId).get();
    }

    @Override
    public Vehicle findVehicleByRegNumber(String regNumber) {
        return repository.findByRegNumber(regNumber);
    }

    @Override
    public List<Vehicle> findAllVehicles() {
        return (List<Vehicle>) repository.findAll();
    }

    @Override
    public Vehicle findVehicleByOwnerId(Integer ownerId) {
        return repository.findByOwnerId(ownerId);
    }


    @Override
    public List<Vehicle> findAllVehiclesByOwnerId(Integer ownerId) {
        return repository.findByOwnerIdOrderByVehicleId(ownerId);
    }


}
