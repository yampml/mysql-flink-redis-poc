package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Data
@Entity
@IdClass(WeatherdataPK.class)
public class Weatherdata {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "log_date")
    private Date logDate;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "time")
    private Time time;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "station")
    private int station;
    @Basic
    @Column(name = "temp")
    private BigDecimal temp;
    @Basic
    @Column(name = "humidity")
    private BigDecimal humidity;
    @Basic
    @Column(name = "airpressure")
    private BigDecimal airpressure;
    @Basic
    @Column(name = "wind")
    private BigDecimal wind;
    @Basic
    @Column(name = "weather")
    private Object weather;
    @Basic
    @Column(name = "winddirection")
    private short winddirection;

}
