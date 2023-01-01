package com.kodality.travellog.controller;

import com.kodality.travellog.model.Vehicle;
import com.kodality.travellog.service.VehicleService;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/api/v1/vehicle")
public class VehicleController {
    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @Post("/save")
    public Vehicle saveNewVehicle(@Body Vehicle vehicle){
        return service.saveNewVehicle(vehicle);
    }

    @Get("/all")
    public List<Vehicle> findAllVehicles(){
        return service.findAllVehicles();
    }

    @Get("/owner/{ownerId}/all")
    public List<Vehicle> findAllVehiclesByOwnersId(@PathVariable Integer ownerId){
        return service.findAllVehiclesByOwnerId(ownerId);
    }
    @Get("/owner{ownerId}")
    public Vehicle findVehicleByOwnersId(@PathVariable Integer ownerId){
        return service.findVehicleByOwnerId(ownerId);
    }

    @Get("/id={vehicleId}")
    public Vehicle findVehicleById(@PathVariable Integer vehicleId){
        return service.findVehicleById(vehicleId);
    }

    @Get("/reg={regNumber}")
    public Vehicle findVehicleByReqNumber(@PathVariable String regNumber){
        return service.findVehicleByRegNumber(regNumber);
    }
}
