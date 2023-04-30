package org.example;

import org.example.entities.Person;
import org.example.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PractiseApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(PractiseApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person p1 = new Person(1L,"Will");
        Person p2 = new Person(2L,"Lari");

        personRepository.save(p1);
        personRepository.save(p2);

    }
}