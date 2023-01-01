package com.kodality.travellog.repository;

import com.kodality.travellog.model.Owner;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.UUID;

import static io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES;

@Repository
@JdbcRepository(dialect = POSTGRES)
public interface OwnerRepository extends CrudRepository<Owner, Integer> {

    Owner findByFirstNameAndLastName(String firstName, String lastName);

}
