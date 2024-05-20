/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.venteapi.models;

/**
 *
 * @author 22890
 */
public class Superviseur {
     private int supervis_id;
    private String nom_supervis;
    private String prenom_supervis;

    // Getters et setters
    public int getSupervis_id() {
        return supervis_id;
    }

    public void setSupervis_id(int supervis_id) {
        this.supervis_id = supervis_id;
    }

    public String getNom_supervis() {
        return nom_supervis;
    }

    public void setNom_supervis(String nom_supervis) {
        this.nom_supervis = nom_supervis;
    }

    public String getPrenom_supervis() {
        return prenom_supervis;
    }

    public void setPrenom_supervis(String prenom_supervis) {
        this.prenom_supervis = prenom_supervis;
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
