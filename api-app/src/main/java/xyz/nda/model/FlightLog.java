package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "flight_log", schema = "airportdb", catalog = "")
public class FlightLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "flight_log_id")
    private int flightLogId;
    @Basic
    @Column(name = "log_date")
    private Timestamp logDate;
    @Basic
    @Column(name = "user")
    private String user;
    @Basic
    @Column(name = "flight_id")
    private int flightId;
    @Basic
    @Column(name = "flightno_old")
    private String flightnoOld;
    @Basic
    @Column(name = "flightno_new")
    private String flightnoNew;
    @Basic
    @Column(name = "from_old")
    private short fromOld;
    @Basic
    @Column(name = "to_old")
    private short toOld;
    @Basic
    @Column(name = "from_new")
    private short fromNew;
    @Basic
    @Column(name = "to_new")
    private short toNew;
    @Basic
    @Column(name = "departure_old")
    private Timestamp departureOld;
    @Basic
    @Column(name = "arrival_old")
    private Timestamp arrivalOld;
    @Basic
    @Column(name = "departure_new")
    private Timestamp departureNew;
    @Basic
    @Column(name = "arrival_new")
    private Timestamp arrivalNew;
    @Basic
    @Column(name = "airplane_id_old")
    private int airplaneIdOld;
    @Basic
    @Column(name = "airplane_id_new")
    private int airplaneIdNew;
    @Basic
    @Column(name = "airline_id_old")
    private short airlineIdOld;
    @Basic
    @Column(name = "airline_id_new")
    private short airlineIdNew;
    @Basic
    @Column(name = "comment")
    private String comment;

}
