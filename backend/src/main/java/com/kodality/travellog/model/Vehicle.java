package com.kodality.travellog.model;


import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Data;

@Data
@MappedEntity(value = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private Integer vehicleId;
    private Integer ownerId;
    private String regNumber;
    private Integer currentOdometer;


}
