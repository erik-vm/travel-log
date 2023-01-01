package com.kodality.travellog.controller;

import com.kodality.travellog.model.TravelLog;
import com.kodality.travellog.service.TravelLogService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

import java.sql.Date;
import java.util.List;

@Controller("/api/v1/travel-logs")
public class TravelLogController {
  private final TravelLogService service;

  public TravelLogController(TravelLogService service) {
    this.service = service;
  }

  @Post("/save")
  public TravelLog saveTravelLog(TravelLog travelLog){
    return service.saveNewTravelLog(travelLog);
  }

  @Get("/id={travelLogId}")
  public TravelLog findTravelLogById(@PathVariable Integer travelLogId){
    return service.findTravelLogById(travelLogId);
  }

  @Get("/all")
  public List<TravelLog> findAllTravelLogs() {
    return service.findAllTravelLogs();
  }

  @Get("/vehicle={vehicleId}")
  public List<TravelLog> findAllTravelLogsByVehicleId(@PathVariable Integer vehicleId) {
    return service.findAllTravelLogsByVehicleId(vehicleId);
  }

  @Get("/reg={regNumber}")
  public List<TravelLog> findAllTravelLogsByVehicleRegNumber(@PathVariable String regNumber) {
    return service.findAllTravelLogsByVehicleRegNumber(regNumber);
  }

  @Get("/date={dateFrom}to{dateTo}")
  public List<TravelLog> findAllTravelLogsBetweenDates(@PathVariable Date dateFrom, @PathVariable Date dateTo) {
    return service.findAllTravelLogsBetweenDates(dateFrom,dateTo);
  }

  @Get("/owner={firstName}&{lastName}")
  public List<TravelLog> findAllTravelLogsByVehicleOwnerName(@PathVariable String firstName, @PathVariable String lastName) {
    return service.findAllTravelLogsByVehicleOwnerName(firstName, lastName);
  }


}
