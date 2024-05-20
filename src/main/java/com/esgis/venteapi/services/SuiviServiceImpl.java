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

import com.esgis.venteapi.models.Suivi;
import com.esgis.venteapi.repositories.SuiviRepository;

@Service
public class SuiviServiceImpl extends SuiviService {

  @Autowired
  private SuiviRepository repository;

  public Suivi create(Suivi data) {
    return repository.save(data);
  }

  public Suivi update(Suivi data) {
    return repository.save(data);
  }

  public List<Suivi> findAll() {
    return repository.findAll();
  }

  public Optional<Suivi> findById(String id) {
    return repository.findById(id);
  }

  public void delete(String id) {
    repository.deleteById(id);
  }
}
