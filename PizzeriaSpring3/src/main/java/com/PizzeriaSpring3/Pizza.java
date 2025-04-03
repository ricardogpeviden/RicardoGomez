package com.PizzeriaSpring3;

//Creamos un objeto llamado pizza con constructor y metodos

public class Pizza {
    private String nombre;
    private String ingredientes;

    public Pizza(String nombre, String ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    // Getters setters de las pizzas
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza: " + nombre + " - Ingredientes: " + ingredientes;
    }
}