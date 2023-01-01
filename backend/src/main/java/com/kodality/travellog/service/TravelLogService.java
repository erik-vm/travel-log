package com.kodality.travellog.service;

import com.kodality.travellog.model.TravelLog;

import java.sql.Date;
import java.util.List;
import javax.inject.Singleton;


public interface TravelLogService {

    public TravelLog saveNewTravelLog(TravelLog travelLog);
    public TravelLog findTravelLogById(Integer travelLogId);
    public List<TravelLog> findAllTravelLogs();
    public List<TravelLog> findAllTravelLogsByVehicleId(Integer vehicleId);
    public List<TravelLog> findAllTravelLogsByVehicleRegNumber(String regNumber);
    public List<TravelLog> findAllTravelLogsBetweenDates(Date dateFrom, Date dateTo);
    public List<TravelLog> findAllTravelLogsByVehicleOwnerName(String firstName, String lastName);

}
