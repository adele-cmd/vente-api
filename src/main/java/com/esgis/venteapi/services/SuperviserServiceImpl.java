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

import com.esgis.venteapi.models.Superviser;
import com.esgis.venteapi.repositories.SuperviserRepository;

@Service
public class SuperviserServiceImpl extends SuperviserService {

  @Autowired
  private SuperviserRepository repository;

  public Superviser create(Superviser data) {
    return repository.save(data);
  }

  public Superviser update(Superviser data) {
    return repository.save(data);
  }

  public List<Superviser> findAll() {
    return repository.findAll();
  }

  public Optional<Superviser> findById(String id) {
    return repository.findById(id);
  }

  public void delete(String id) {
    repository.deleteById(id);
  }
}
