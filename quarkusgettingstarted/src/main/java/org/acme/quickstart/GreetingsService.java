package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * Ciclo de vida, como Singleton, por cada ejecución de la app hay solo una instancia 
 * Estamos generando una sola instancia para toda la aplicación 
 * 
 * Ejemplos: 
 * 
 * RequestScoped --> crea un objeto en memória por cada request 
 * SessionScoped --> permite tener un objeto por sesión, se inicia sesión se crea el obj
 * 
 * En el 60% de los casos será AplicationScoped ya que nos interesa solamente tener una instancia de un servicio que haga cosas y qeu todo el mundo ataque a la misma instancia
 */
@ApplicationScoped
public class GreetingsService {
    
    @ConfigProperty(name = "greetings.message")
    String msg;

    public String toUpperCase() {
        return msg.toLowerCase();
    }
}
