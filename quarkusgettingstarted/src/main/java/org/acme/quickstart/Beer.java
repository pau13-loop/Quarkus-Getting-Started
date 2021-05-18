package org.acme.quickstart;

import java.time.LocalDate;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.acme.quickstart.validation.NotExpired;

import io.smallrye.common.constraint.NotNull;

// IMPORTANTE 
/**
 * Para serializar o deserializar los JSON recuerda instalar la libreria necesaria llamada:
 * 
 * RESTEasy - JSON-B
 */

public class Beer {

    // Validation fields
    @NotNull
    @NotBlank
    private String name; 
    
    @Min(100) 
    private int capacity;

    // Specify this field can be expired
    @NotExpired
    // Fecha de caducidad con formato fecha prestablecido
    @JsonbDateFormat("yyyy-MM-dd") 
    private LocalDate expired;

    public Beer(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Beer() {}

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getExpired() {
        return expired;
    }

    public void setExpired(LocalDate expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "Beer [capacity=" + capacity + ", name=" + name + "]";
    }
}
