package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
public class Flight {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "flight_id")
    private int flightId;
    @Basic
    @Column(name = "flightno")
    private String flightno;
    @Basic
    @Column(name = "from")
    private short from;
    @Basic
    @Column(name = "to")
    private short to;
    @Basic
    @Column(name = "departure")
    private Timestamp departure;
    @Basic
    @Column(name = "arrival")
    private Timestamp arrival;
    @Basic
    @Column(name = "airline_id")
    private short airlineId;
    @Basic
    @Column(name = "airplane_id")
    private int airplaneId;

}
