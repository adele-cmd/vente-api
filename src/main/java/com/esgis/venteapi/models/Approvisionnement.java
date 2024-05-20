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
public class Approvisionnement {
     private int stock_id;
    private int quantite_stock;
    private Date date_stock;

    // Getters et setters
    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    public int getQuantite_stock() {
        return quantite_stock;
    }

    public void setQuantite_stock(int quantite_stock) {
        this.quantite_stock = quantite_stock;
    }

    public Date getDate_stock() {
        return date_stock;
    }

    public void setDate_stock(Date date_stock) {
        this.date_stock = date_stock;
    }

    public void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
