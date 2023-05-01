package org.example.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TB_VEHICLE")
@SequenceGenerator(name = "SEQ_VEHICLE",sequenceName = "SEQ_VEHICLE",allocationSize = 1)
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_VEHICLE")
    @Column(name = "CD_VEHICLE",nullable = false)
    private Long id;

    @Column(name = "TP_VEHICLE",nullable = false)
    private String typeVehicle;

    @ManyToOne
    @JoinColumn(name = "CD_PERSON")
    private Person owner;

}
