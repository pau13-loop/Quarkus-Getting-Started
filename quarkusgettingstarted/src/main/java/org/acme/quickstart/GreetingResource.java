package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    // Movemos el mensaje dentro del recurso creado
    // @ConfigProperty(name = "greetings.message")
    // String msg;

    // Para utilizar la clase GreetingsService 
    // @Inject 
    // GreetingsService service; 

    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String hello() {
    //     return service.toUpperCase();
    // }

    // RETURN JSON 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Beer getBear() {
        return new Beer("Alhambra", 300);
    }

    // CONSUMIR/DESEREALIZAR JSON
    // curl -H "Content-Type:application/json" -X POST http://localhost:8080/hello -d "{\"name\":\"Heiniken\", \"capacity\":250}"
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeer(Beer beer) {
        System.out.println(beer);
        return Response.ok().build();
    }
}