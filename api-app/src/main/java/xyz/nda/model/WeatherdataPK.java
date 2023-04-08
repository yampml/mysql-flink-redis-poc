package xyz.nda.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Data
public class WeatherdataPK implements Serializable {
    @Column(name = "log_date")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date logDate;
    @Column(name = "time")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Time time;
    @Column(name = "station")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int station;

}
