package com.kodality.travellog.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Data;

import java.sql.Date;

@Data
@MappedEntity(value = "travel_logs")
public class TravelLog {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private Integer travelLogId;
    private Integer vehicleId;
    private String routeFrom;
    private String routeTo;
    private Integer odometerAtTheEnd;
    private Date travelDate;
    private String description;
}
