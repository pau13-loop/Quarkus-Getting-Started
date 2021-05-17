package org.acme.quickstart;

// IMPORTANTE 
/**
 * Para serializar o deserializar los JSON recuerda instalar la libreria necesaria llamada:
 * 
 * RESTEasy - JSON-B
 */

public class Beer {

    private String name; 
    private int capacity;

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

    @Override
    public String toString() {
        return "Beer [capacity=" + capacity + ", name=" + name + "]";
    }
}
