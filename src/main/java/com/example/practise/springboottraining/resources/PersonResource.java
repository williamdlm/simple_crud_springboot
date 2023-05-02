package com.example.practise.springboottraining.resources;

import com.example.practise.springboottraining.entities.Person;
import com.example.practise.springboottraining.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/people")
public class PersonResource {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Person> findById(@PathVariable Long id) {
        Person obj = personRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Usuário não encontrado com o ID: " + id));
        return ResponseEntity.ok(obj);
    }

    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        List<Person> list = personRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Person person) {
        personRepository.save(person);
        URI location = URI.create("/people/" + person.getId());
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        personRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
