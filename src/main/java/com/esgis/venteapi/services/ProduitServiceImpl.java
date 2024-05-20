package com.esgis.venteapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esgis.venteapi.models.Produit;
import com.esgis.venteapi.repositories.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
    
    @Autowired
    private ProduitRepository produitRepository;

    public Produit create(Produit data){
        return produitRepository.save(data);
    }
    public Produit update(Produit data) {
        return produitRepository.save(data);
    }

    public List<Produit> findAll(){
        return produitRepository.findAll();
    }
    public Optional<Produit> findById(String id){
        return produitRepository.findById(id);
    }
    public void delete(String id){

        produitRepository.deleteById(id);
    }
}
