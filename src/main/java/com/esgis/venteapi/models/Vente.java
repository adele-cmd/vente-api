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
public class Vente {
    private Date date_vente;
    private int qte_vendue;

    // Getters et setters
    public Date getDate_vente() {
        return date_vente;
    }

    public void setDate_vente(Date date_vente) {
        this.date_vente = date_vente;
    }

    public int getQte_vendue() {
        return qte_vendue;
    }

    public void setQte_vendue(int qte_vendue) {
        this.qte_vendue = qte_vendue;
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
