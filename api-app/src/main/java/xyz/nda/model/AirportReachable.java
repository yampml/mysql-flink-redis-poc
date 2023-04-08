package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "airport_reachable", schema = "airportdb", catalog = "")
public class AirportReachable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "airport_id")
    private short airportId;
    @Basic
    @Column(name = "hops")
    private Integer hops;

}
