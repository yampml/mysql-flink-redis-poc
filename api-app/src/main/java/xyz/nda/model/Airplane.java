package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
public class Airplane {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "airplane_id")
    private int airplaneId;
    @Basic
    @Column(name = "capacity")
    private Object capacity;
    @Basic
    @Column(name = "type_id")
    private int typeId;
    @Basic
    @Column(name = "airline_id")
    private int airlineId;

}
