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

import com.esgis.venteapi.models.Vente;
import com.esgis.venteapi.repositories.VenteRepository;

@Service
public class VenteServiceImpl extends VenteService {

  @Autowired
  private VenteRepository venteRepository;

  public Vente create(Vente data) {
    return venteRepository.save(data);
  }

  public Vente update(Vente data) {
    return venteRepository.save(data);
  }

  public List<Vente> findAll() {
    return venteRepository.findAll();
  }

  public Optional<Vente> findById(String id) {
    return venteRepository.findById(id);
  }

  public void delete(String id) {
    venteRepository.deleteById(id);
  }
}
