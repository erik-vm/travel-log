package com.kodality.travellog.service.implementation;

import com.kodality.travellog.model.Owner;
import com.kodality.travellog.repository.OwnerRepository;
import com.kodality.travellog.repository.VehicleRepository;
import com.kodality.travellog.service.OwnerService;
import com.kodality.travellog.service.VehicleService;

import javax.inject.Singleton;
import java.util.List;
import java.util.UUID;

@Singleton
public class OwnerServiceImp implements OwnerService {

    private final OwnerRepository repository;

    public OwnerServiceImp(OwnerRepository repository) {
        this.repository = repository;
    }


    @Override
    public Owner saveNewOwner(Owner owner) {
        return repository.save(owner);
    }

    @Override
    public Owner findOwnerById(Integer ownerId) {
        return repository.findById(ownerId).get();
    }

    @Override
    public Owner findOwnerByFirstNameAndLastName(String firstName, String lastName) {
        return repository.findByFirstNameAndLastName(firstName, lastName);
    }
    @Override
    public Iterable<Owner> findAllOwners() {
        return  repository.findAll();
    }
}
