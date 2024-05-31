/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.venteapi.models;

import java.util.logging.Logger;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;







/**
 *
 * @author 22890
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitDTO {
    private Long id;
    private String nomProduit;
    private String codeProduit;
   
   
    
}
