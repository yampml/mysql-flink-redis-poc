package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
public class Airport {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "airport_id")
    private short airportId;
    @Basic
    @Column(name = "iata")
    private String iata;
    @Basic
    @Column(name = "icao")
    private String icao;
    @Basic
    @Column(name = "name")
    private String name;

}
