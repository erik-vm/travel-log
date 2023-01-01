package com.kodality.travellog.exception;

public class VehicleInvalidOdometerException extends RuntimeException {

    public VehicleInvalidOdometerException() {
        super("Vehicles odometer cant remain the same or decrease.");
    }

}
