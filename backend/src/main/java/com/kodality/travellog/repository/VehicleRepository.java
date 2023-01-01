package com.kodality.travellog.repository;

import com.kodality.travellog.model.Vehicle;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

import static io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES;

@Repository
@JdbcRepository(dialect = POSTGRES)
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

    Vehicle findByRegNumber(String regNumber);
    Vehicle findByOwnerId(Integer ownerId);

    List<Vehicle> findByOwnerIdOrderByVehicleId(Integer ownerId);

}
