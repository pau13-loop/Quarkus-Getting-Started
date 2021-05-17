package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    // Movemos el mensaje dentro del recurso creado
    // @ConfigProperty(name = "greetings.message")
    // String msg;

    // Para utilizar la clase GreetingsService 
    @Inject 
    GreetingsService service; 

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return service.toUpperCase();
    }
}