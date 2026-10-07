package com.actividad.clases.repositories;

import com.actividad.clases.models.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long>{
    
}