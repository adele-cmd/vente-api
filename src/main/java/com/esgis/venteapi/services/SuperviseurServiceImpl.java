/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.venteapi.services;

/**
 *
 * @author 22890
 */
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esgis.venteapi.models.Superviseur;
import com.esgis.venteapi.repositories.SuperviseurRepository;

@Service
public class SuperviseurServiceImpl extends SuperviseurService {

    @Autowired
    private SuperviseurRepository repository;

    public Superviseur create(Superviseur data) {
        return repository.save(data);
    }

    public Superviseur update(Superviseur data) {
        return repository.save(data);
    }

    public List<Superviseur> findAll() {
        return repository.findAll();
    }

    public Optional<Superviseur> findById(String id) {
        return repository.findById(id);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
