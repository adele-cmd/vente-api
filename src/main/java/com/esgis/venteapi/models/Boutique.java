/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.venteapi.models;
import java.util.Date;

/**
 *
 * @author 22890
 */
public class Boutique {
    
    private int boutiqueId;
    private String nomBoutique;
    private String telBoutique;
    private String adresseBoutique;

    public Boutique(int boutiqueId, String nomBoutique, String telBoutique, String adresseBoutique) {
        this.boutiqueId = boutiqueId;
        this.nomBoutique = nomBoutique;
        this.telBoutique = telBoutique;
        this.adresseBoutique = adresseBoutique;
    }

    public int getBoutiqueId() {
        return boutiqueId;
    }

    public String getNomBoutique() {
        return nomBoutique;
    }

    public String getTelBoutique() {
        return telBoutique;
    }

    public String getAdresseBoutique() {
        return adresseBoutique;
    }

    public void setBoutiqueId(int boutiqueId) {
        this.boutiqueId = boutiqueId;
    }

    public void setNomBoutique(String nomBoutique) {
        this.nomBoutique = nomBoutique;
    }

    public void setTelBoutique(String telBoutique) {
        this.telBoutique = telBoutique;
    }

    public void setAdresseBoutique(String adresseBoutique) {
        this.adresseBoutique = adresseBoutique;
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
