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

import com.esgis.venteapi.models.Boutique;
import com.esgis.venteapi.repositories.BoutiqueRepository;

@Service
public class BoutiqueServiceImpl extends BoutiqueService {

  @Autowired
  private BoutiqueRepository repository;

  public Boutique create(Boutique data) {
    return repository.save(data);
  }

  public Boutique update(Boutique data) {
    return repository.save(data);
  }

  public List<Boutique> findAll() {
    return repository.findAll();
  }

  public Optional<Boutique> findById(String id) {
    return repository.findById(id);
  }

  public void delete(String id) {
    repository.deleteById(id);
  }
}
