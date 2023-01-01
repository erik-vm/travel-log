package com.kodality.travellog.repository;

import com.kodality.travellog.model.TravelLog;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

import static io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES;

@Repository
@JdbcRepository(dialect = POSTGRES)
public interface TravelLogRepository extends CrudRepository<TravelLog, Integer> {

    List<TravelLog> findByVehicleId(Integer vehicleId);
    List<TravelLog> findByTravelDateBetween(Date dateFrom, Date dateTo);
}
