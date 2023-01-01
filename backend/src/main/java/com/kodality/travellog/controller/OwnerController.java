package com.kodality.travellog.controller;

import com.kodality.travellog.model.Owner;
import com.kodality.travellog.service.OwnerService;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/api/v1/owner")
public class OwnerController {
  private final OwnerService service;

  public OwnerController(OwnerService service) {
    this.service = service;
  }

  @Post("/save")
  public Owner saveNewOwner(@Body Owner owner){
    return service.saveNewOwner(owner);
  }

  @Get("/all")
  public Iterable<Owner> getAllOwners(){
    return service.findAllOwners();
  }

  @Get("/id={ownerId}")
  public Owner findById(@PathVariable Integer ownerId){
    return service.findOwnerById(ownerId);
  }

  @Get("/name={firstName}&{lastName}")
  public Owner findByFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName){
    return service.findOwnerByFirstNameAndLastName(firstName, lastName);
  }
}
