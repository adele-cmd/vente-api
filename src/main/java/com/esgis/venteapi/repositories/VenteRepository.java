/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.venteapi.repositories;

import com.esgis.venteapi.models.Vente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author 22890
 */
import org.springframework.data.mongodb.repository.MongoRepository;

import com.esgis.venteapi.models.Vente;

public interface VenteRepository extends MongoRepository<Vente, String> {

}
