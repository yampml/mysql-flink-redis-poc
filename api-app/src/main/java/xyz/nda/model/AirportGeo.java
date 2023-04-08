package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "airport_geo", schema = "airportdb", catalog = "")
public class AirportGeo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "airport_id")
    private short airportId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "latitude")
    private BigDecimal latitude;
    @Basic
    @Column(name = "longitude")
    private BigDecimal longitude;
    @Basic
    @Column(name = "geolocation")
    private Object geolocation;

}
