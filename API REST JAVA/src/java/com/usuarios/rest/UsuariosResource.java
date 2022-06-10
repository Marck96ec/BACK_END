/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author clavi
 */
@Path("usuarios")
public class UsuariosResource {

    @Context
    private UriInfo context;

  
    public UsuariosResource() {
    }


    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<h1>HOLA Usuario</h1>";
    }

    
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
