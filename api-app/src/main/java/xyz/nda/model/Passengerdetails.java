package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Objects;

@Data
@Entity
public class Passengerdetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "passenger_id")
    private int passengerId;
    @Basic
    @Column(name = "birthdate")
    private Date birthdate;
    @Basic
    @Column(name = "sex")
    private String sex;
    @Basic
    @Column(name = "street")
    private String street;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "zip")
    private short zip;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "emailaddress")
    private String emailaddress;
    @Basic
    @Column(name = "telephoneno")
    private String telephoneno;

}
