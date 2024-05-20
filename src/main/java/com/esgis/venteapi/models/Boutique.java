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
    
    private int boutique_id;
    private String nom_boutique;
    private String tel_boutique;
    private String adresse_boutique;

    // Getters et setters
    public int getBoutique_id() {
        return boutique_id;
    }

    public void setBoutique_id(int boutique_id) {
        this.boutique_id = boutique_id;
    }

    public String getNom_boutique() {
        return nom_boutique;
    }

    public void setNom_boutique(String nom_boutique) {
        this.nom_boutique = nom_boutique;
    }

    public String getTel_boutique() {
        return tel_boutique;
    }

    public void setTel_boutique(String tel_boutique) {
        this.tel_boutique = tel_boutique;
    }

    public String getAdresse_boutique() {
        return adresse_boutique;
    }

    public void setAdresse_boutique(String adresse_boutique) {
        this.adresse_boutique = adresse_boutique;
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
