package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
public class Booking {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "booking_id")
    private int bookingId;
    @Basic
    @Column(name = "flight_id")
    private int flightId;
    @Basic
    @Column(name = "seat")
    private String seat;
    @Basic
    @Column(name = "passenger_id")
    private int passengerId;
    @Basic
    @Column(name = "price")
    private BigDecimal price;

}
