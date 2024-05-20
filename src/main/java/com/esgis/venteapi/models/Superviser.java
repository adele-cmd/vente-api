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
public class Superviser {
     private Date debut_supervis;
    private Date fin_supervis;

    // Getters et setters
    public Date getDebut_supervis() {
        return debut_supervis;
    }

    public void setDebut_supervis(Date debut_supervis) {
        this.debut_supervis = debut_supervis;
    }

    public Date getFin_supervis() {
        return fin_supervis;
    }

    public void setFin_supervis(Date fin_supervis) {
        this.fin_supervis = fin_supervis;
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
