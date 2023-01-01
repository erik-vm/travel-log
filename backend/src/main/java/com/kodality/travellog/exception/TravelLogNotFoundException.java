package com.kodality.travellog.exception;

import java.sql.Date;

public class TravelLogNotFoundException extends RuntimeException {

    TravelLogNotFoundException() {
        super("No travel logs where found.");
    }

    public TravelLogNotFoundException(Integer travelLogId) {
        super(String.format("Travel log with id: %s was not found!", travelLogId));
    }

    public TravelLogNotFoundException(String regNumber) {
        super(String.format("Travel logs with vehicle registration number: %s where not found!", regNumber));
    }

    public TravelLogNotFoundException(String firstName, String lastName) {
        super(String.format("Travel logs with owner name: %s %s where not found!", firstName, lastName));
    }

    public TravelLogNotFoundException(Date dateFrom, Date dateTo) {
        super(String.format("Travel logs between dates from %s to %s where not found!", dateFrom, dateTo));
    }
}
