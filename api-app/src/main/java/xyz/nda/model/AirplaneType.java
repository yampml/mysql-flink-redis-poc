package xyz.nda.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@Table(name = "airplane_type", schema = "airportdb", catalog = "")
public class AirplaneType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "type_id")
    private int typeId;
    @Basic
    @Column(name = "identifier")
    private String identifier;
    @Basic
    @Column(name = "description")
    private String description;

}
