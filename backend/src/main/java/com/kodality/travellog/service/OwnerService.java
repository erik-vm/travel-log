package com.kodality.travellog.service;


import com.kodality.travellog.model.Owner;

import java.util.List;
import java.util.UUID;

public interface OwnerService {

    public Owner saveNewOwner(Owner owner);
    public Owner findOwnerById(Integer ownerId);
    public Owner findOwnerByFirstNameAndLastName(String firstName, String lastName);
    public Iterable<Owner> findAllOwners();


}
