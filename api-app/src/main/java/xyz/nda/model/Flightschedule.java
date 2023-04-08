package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.Objects;

@Data
@Entity
public class Flightschedule {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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
    private Time departure;
    @Basic
    @Column(name = "arrival")
    private Time arrival;
    @Basic
    @Column(name = "airline_id")
    private short airlineId;
    @Basic
    @Column(name = "monday")
    private Byte monday;
    @Basic
    @Column(name = "tuesday")
    private Byte tuesday;
    @Basic
    @Column(name = "wednesday")
    private Byte wednesday;
    @Basic
    @Column(name = "thursday")
    private Byte thursday;
    @Basic
    @Column(name = "friday")
    private Byte friday;
    @Basic
    @Column(name = "saturday")
    private Byte saturday;
    @Basic
    @Column(name = "sunday")
    private Byte sunday;

}
