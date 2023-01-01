package com.kodality.travellog.configuration;

import com.github.javafaker.Faker;
import com.kodality.travellog.repository.OwnerRepository;
import com.kodality.travellog.repository.TravelLogRepository;
import com.kodality.travellog.repository.VehicleRepository;

//@Singleton
//@Requires(notEnv = Environment.TEST)
public class DataInit {

    private final OwnerRepository ownerRepository;
    private final VehicleRepository vehicleRepository;
    private final TravelLogRepository travelLogRepository;
    private Faker faker;

    public DataInit(OwnerRepository ownerRepository, VehicleRepository vehicleRepository, TravelLogRepository travelLogRepository) {
        this.ownerRepository = ownerRepository;
        this.vehicleRepository = vehicleRepository;
        this.travelLogRepository = travelLogRepository;
    }


//    @EventListener
//    public void init() {
//        Owner owner1 = new Owner(faker.name().firstName(), faker.name().lastName(), faker.phoneNumber().toString(), faker.internet().emailAddress());
//        Owner owner2 = new Owner(faker.name().firstName(), faker.name().lastName(), faker.phoneNumber().toString(), faker.internet().emailAddress());
//        Owner owner3 = new Owner(faker.name().firstName(), faker.name().lastName(), faker.phoneNumber().toString(), faker.internet().emailAddress());
//        ownerRepository.saveAll(List.of(owner1, owner2, owner3));
//    }

}
