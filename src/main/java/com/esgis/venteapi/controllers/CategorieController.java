package com.esgis.venteapi.controllers;

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

import com.esgis.venteapi.models.Categorie;
import com.esgis.venteapi.services.CategorieService;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    //POST http://localhost:8080/api/categories/new
    @PostMapping("/new")
    public Categorie create(@RequestBody Categorie categorie) {
        return categorieService.create(categorie);
    }

    @GetMapping
    public List<Categorie> findAllCategories() {
        return categorieService.findAll();
    }

    @GetMapping("/{id}")
    public Categorie findOneCategories(@PathVariable String id) {
        Optional<Categorie> categorie = categorieService.findById(id);
        if (categorie.isPresent()) {
            return categorie.get();
        }
        return null;
    }

    @PutMapping("/{id}")
    public Categorie updateCategorie(@PathVariable String id, @RequestBody Categorie categorie) {
        categorie.setId(id);
        return categorieService.update(categorie);
    }

    //DELETE http://localhost:8080/api/categories/12
    @DeleteMapping("/{id}")
    public void deleteCategorie(@PathVariable String id) {
        categorieService.delete(id);
    }

}
