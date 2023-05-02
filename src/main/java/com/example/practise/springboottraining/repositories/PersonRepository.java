package com.example.practise.springboottraining.repositories;

import com.example.practise.springboottraining.entities.Person;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class PersonRepository {

    private Map<Long, Person> map = new HashMap<>();

    public List<Person> findAll(){
        List<Person> people = map.values().stream().collect(Collectors.toList());
        return people;
    }

    public Person findById(Long id){
        Person obj = map.get(id);
        return obj;
    }

    public Person find(Long id){
        Person obj = map.get(id);
        return obj;
    }


    public void create(Long id,Person person){
        map.put(id,person);
        person.setId(id);
    }

    public void delete(Long id){
        map.remove(id);
    }

}
