package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
public class Airline {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "airline_id")
    private short airlineId;
    @Basic
    @Column(name = "iata")
    private String iata;
    @Basic
    @Column(name = "airlinename")
    private String airlinename;
    @Basic
    @Column(name = "base_airport")
    private short baseAirport;

}
