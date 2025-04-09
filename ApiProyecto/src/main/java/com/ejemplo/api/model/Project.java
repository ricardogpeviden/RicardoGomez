package com.ejemplo.api.model;

public class Project {
    
    private Long id;
    private String description;
    private String language;
    private boolean open;
    
    /*Constructor con sus valores*/
    
    public Project(Long id, String description, String language, boolean open) {
        this.id = id;
        this.description = description;
        this.language = language;
        this.open = open;
    }
    
    // Constructor vacío 
    public Project() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public boolean isOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }
}
