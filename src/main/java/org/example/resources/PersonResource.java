package org.example.resources;

import org.example.entities.Person;
import org.example.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/peoples")
public class PersonResource {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> findById(@PathVariable Long id){
        Person obj = personRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping
    public ResponseEntity<List<Person>> findAll(){
        List<Person> people = personRepository.findAll();
        return ResponseEntity.ok(people);
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person){
        personRepository.save(person);
        return ResponseEntity.created(URI.create("/people/" + person.getId())).body(person);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Person> delete(@PathVariable Long id){
        personRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
