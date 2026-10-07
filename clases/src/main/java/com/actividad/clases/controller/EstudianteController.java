package com.actividad.clases.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad.clases.models.Estudiante;
import com.actividad.clases.repositories.EstudianteRepository;

@RestController
@RequestMapping("/api/v1/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteRepository repo;

    public EstudianteController(EstudianteRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Estudiante> getEstudiantes() {
        return repo.findAll();
    }
    @PostMapping
public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
    return repo.save(estudiante);
}
}