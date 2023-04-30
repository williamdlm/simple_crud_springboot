package org.example.repositories;

import org.example.entities.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PersonRepository {

   private static Logger logger = LoggerFactory.getLogger(PersonRepository.class);


    private Map<Long, Person>map = new HashMap<>();

    public void save(Person obj){
        //logger.error(String.valueOf(map.size()));
        map.put(obj.getId(), obj);
    }

    public Person findById(Long id){
        Person obj = map.get(id);
        return obj;

    }
    public List<Person> findAll(){
       // logger.error(people.toString());
        List<Person> list = map.values().stream().collect(Collectors.toList());
        return list;
    }

    public void delete(Long id){
        map.remove(id);
    }
}
