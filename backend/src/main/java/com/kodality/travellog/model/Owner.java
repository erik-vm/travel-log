package com.kodality.travellog.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Data;

import static io.micronaut.data.annotation.GeneratedValue.Type;

@Data
@MappedEntity(value = "owners")
public class Owner {

    @Id
    @GeneratedValue(Type.AUTO)
    private Integer ownerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Owner(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
