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

import com.esgis.venteapi.models.AgentVendeur;

public interface AgentVendeurService {
  public AgentVendeur create(AgentVendeur data);

  public AgentVendeur update(AgentVendeur data);

  public List<AgentVendeur> findAll();

  public Optional<AgentVendeur> findById(String id);

  public void delete(String id);
}
