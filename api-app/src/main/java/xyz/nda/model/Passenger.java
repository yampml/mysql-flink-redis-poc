package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
public class Passenger {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "passenger_id")
    private int passengerId;
    @Basic
    @Column(name = "passportno")
    private String passportno;
    @Basic
    @Column(name = "firstname")
    private String firstname;
    @Basic
    @Column(name = "lastname")
    private String lastname;

}
