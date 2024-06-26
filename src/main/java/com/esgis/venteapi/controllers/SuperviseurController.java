/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.venteapi.controllers;

/**
 *
 * @author 22890
 */
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgis.venteapi.models.Superviseur;
import com.esgis.venteapi.services.SuperviseurService;

@RestController
@RequestMapping("/api/v1/supervisors")
public class SuperviseurController {

    @Autowired
    private SuperviseurService service;

    //POST http://localhost:8080/api/supervisors/new
    @PostMapping("/new")
    public Superviseur create(@RequestBody Superviseur superviseur) {
        return service.create(superviseur);
    }

    @GetMapping
    public List<Superviseur> findAllSuperviseurs() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Superviseur findOneSuperviseurs(@PathVariable String id) {
        Optional<Superviseur> superviseur = service.findById(id);
        if (superviseur.isPresent()) {
            return superviseur.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public Superviseur updateSuperviseur(@PathVariable String id, @RequestBody Superviseur superviseur) {
        superviseur.setId(id);
        return service.update(superviseur);
    }

    //DELETE http://localhost:8080/api/supervisors/12
    @DeleteMapping("/{id}")
    public void deleteSuperviseur(@PathVariable String id) {
        service.delete(id);
    }
}