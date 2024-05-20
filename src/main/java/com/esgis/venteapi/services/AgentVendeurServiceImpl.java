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

import com.esgis.venteapi.models.AgentVendeur;
import com.esgis.venteapi.repositories.AgentVendeurRepository;

@Service
public class AgentVendeurServiceImpl implements AgentVendeurService {

  @Autowired
  private AgentVendeurRepository repository;

  public AgentVendeur create(AgentVendeur data) {
    return repository.save(data);
  }

  public AgentVendeur update(AgentVendeur data) {
    return repository.save(data);
  }

  public List<AgentVendeur> findAll() {
    return repository.findAll();
  }

  public Optional<AgentVendeur> findById(String id) {
    return repository.findById(id);
  }

  public void delete(String id) {
    repository.deleteById(id);
  }
}
