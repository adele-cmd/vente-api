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
public class Suivi {
     private Date debut_suivi;
    private Date fin_suivi;

    // Getters et setters
    public Date getDebut_suivi() {
        return debut_suivi;
    }

    public void setDebut_suivi(Date debut_suivi) {
        this.debut_suivi = debut_suivi;
    }

    public Date getFin_suivi() {
        return fin_suivi;
    }

    public void setFin_suivi(Date fin_suivi) {
        this.fin_suivi = fin_suivi;
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
