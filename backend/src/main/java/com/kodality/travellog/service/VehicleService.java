package com.kodality.travellog.service;


import com.kodality.travellog.model.Vehicle;

import java.util.List;

public interface VehicleService {

    public Vehicle saveNewVehicle(Vehicle vehicle);
    public Vehicle findVehicleById(Integer vehicleId);
    public Vehicle findVehicleByRegNumber(String regNumber);
    public List<Vehicle> findAllVehicles();
    public Vehicle findVehicleByOwnerId(Integer ownerId);
    public List<Vehicle> findAllVehiclesByOwnerId(Integer ownerId);


}
