package com.example.practise.springboottraining.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@SequenceGenerator(name = "SEQ_VEHICLE",sequenceName = "SEQ_VEHICLE",
        allocationSize = 1)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CD_VEHICLE", nullable = false)
    private Long id;

    @Column(name = "TP_VEHICLE", nullable = false)
    private String typeVehicle;

    @ManyToOne
    @JoinColumn(name = "CD_PERSON", nullable = false)
    private Person owner;

}
