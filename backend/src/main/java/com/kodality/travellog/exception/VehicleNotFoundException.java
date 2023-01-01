package com.kodality.travellog.exception;

public class VehicleNotFoundException extends RuntimeException{

    public VehicleNotFoundException(){
        super("No vehicles where found.");
    }

    public VehicleNotFoundException(Integer vehicleId){
        super(String.format("Vehicle with id: %s was not found!", vehicleId));
    }

    public VehicleNotFoundException(String regNumber){
        super(String.format("Vehicle with registration number: %s was not found!", regNumber));
    }
}
