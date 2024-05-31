/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.venteapi.endpoints;

import com.esgis.venteapi.services.ProduitService;
import com.esgis.venteapi.models.Produit;
import com.esgis.venteapi.endpoints.GetProduitRequest;
import com.esgis.venteapi.endpoints.GetProduitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProduitEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/produits";
    
    @Autowired
    private ProduitService produitService;
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProduitRequest")
    @ResponsePayload
    public GetProduitResponse getProduit(@RequestPayload GetProduitRequest request) {
        GetProduitResponse response = new GetProduitResponse();
        
        return response;
    }
    
    // autres opérations CRUD
}
