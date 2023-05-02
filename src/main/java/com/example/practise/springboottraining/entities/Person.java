package com.example.practise.springboottraining.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@SequenceGenerator(name = "SEQ_PERSON" ,sequenceName = "SEQ_PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERSON")
    @Column(name = "CD_PERSON")
    private Long id;

    @Column(name = "NM_PERSON")
    private String name;
}
