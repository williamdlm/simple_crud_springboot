package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_PERSON")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@SequenceGenerator(name = "SEQ_PERSON",sequenceName = "SEQ_PERSON",allocationSize = 1)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PERSON")
    @Column(name = "CD_PERSON",nullable = false)
    private Long id;

    @Column(name = "NM_PERSON",nullable = false)
    private String name;

    @OneToMany(mappedBy = "owner")
    @JsonIgnore
    private List<Vehicle> vehicle;


}
