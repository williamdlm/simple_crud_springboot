package org.example;

import org.example.entities.Person;
import org.example.entities.Vehicle;
import org.example.repositories.PersonRepository;
import org.example.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PractiseApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private VehicleRepository vehicleRepository;


    public static void main(String[] args) {
        SpringApplication.run(PractiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person(null,"John B. Tellmaner",null);
        Person p2 = new Person(null,"Tadashi R. Kyorin",null);
        Person p3 = new Person(null, "Anita Von Dellus",null);

        Vehicle v1 = new Vehicle(null,"Bike",p1);
        Vehicle v2 = new Vehicle(null,"MotorCycle", p2);
        Vehicle v3 = new Vehicle(null, "Car", p2);

        p1.setVehicle(Arrays.asList(v1));
        p2.setVehicle(Arrays.asList(v2,v3));

        personRepository.save(p1);
        personRepository.save(p2);
        personRepository.save(p3);

        vehicleRepository.save(v1);
        vehicleRepository.save(v2);
        vehicleRepository.save(v3);






    }
}