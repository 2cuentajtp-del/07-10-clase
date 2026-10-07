package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrera")
public class carrera {

    @Id
    private Long id;

    private String nombre;
    private Integer creditos;
}