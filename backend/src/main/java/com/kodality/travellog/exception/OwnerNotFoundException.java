package com.kodality.travellog.exception;

public class OwnerNotFoundException extends RuntimeException {

    public OwnerNotFoundException() {
        super("No owners where found.");
    }

    public OwnerNotFoundException(Integer ownerId) {
        super(String.format("Owner with id: %s was not found!", ownerId));
    }

    public OwnerNotFoundException(String firstName, String lastName) {
        super(String.format("Vehicle with name: %s %s was not found!", firstName, lastName));
    }
}
