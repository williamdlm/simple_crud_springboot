package org.example.resources;

import org.example.entities.Vehicle;
import org.example.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleResources {
    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Vehicle> findById(@PathVariable Long id){
        Vehicle obj = vehicleRepository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> findAll(){
        List<Vehicle> vehicles = vehicleRepository.findAll();
        return ResponseEntity.ok(vehicles);
    }

    @PostMapping
    public ResponseEntity<Vehicle> create(@RequestBody Vehicle vehicle){
        Vehicle obj = vehicleRepository.save(vehicle);
        return ResponseEntity.noContent().build();
    }

}
