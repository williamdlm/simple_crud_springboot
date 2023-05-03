package com.example.practise.springboottraining.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@SequenceGenerator(name = "SEQ_PERSON" ,sequenceName = "SEQ_PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERSON")
    @Column(name = "CD_PERSON", nullable = false)
    private Long id;

    @Column(name = "NM_PERSON", nullable = false)
    private String name;

    //@Column(name = "CD_VEHICLE")
    @OneToMany(mappedBy = "owner")
    @JsonIgnore
    private List<Vehicle> vehicles;
}
