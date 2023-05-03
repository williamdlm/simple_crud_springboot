package com.example.practise.springboottraining.resources;

import com.example.practise.springboottraining.entities.Vehicle;
import com.example.practise.springboottraining.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleResource {

    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Vehicle> findById(@PathVariable Long id){
        Vehicle vehicle = vehicleRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        return ResponseEntity.ok(vehicle);

    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> findAll(){
        List<Vehicle> list = vehicleRepository.findAll();
        return  ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
       return ResponseEntity.noContent().build();
    }

}
