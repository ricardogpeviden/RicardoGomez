package com.clubnautico.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "salidas")
public class Salida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La fecha y hora de salida es obligatoria")
    private LocalDateTime fechaHoraSalida;

    @NotBlank(message = "El destino es obligatorio")
    private String destino;

    // info del patrón 
    @NotBlank(message = "El nombre del patrón es obligatorio")
    private String nombrePatron;
    
    @NotBlank(message = "El apellido del patrón es obligatorio")
    private String apellidoPatron;

    // Relación es uno a uno, cada salida está asociada a un barco
    @ManyToOne
    @JoinColumn(name = "barco_id")
    private Barco barco;

    // Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }
    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getNombrePatron() {
        return nombrePatron;
    }
    public void setNombrePatron(String nombrePatron) {
        this.nombrePatron = nombrePatron;
    }
    public String getApellidoPatron() {
        return apellidoPatron;
    }
    public void setApellidoPatron(String apellidoPatron) {
        this.apellidoPatron = apellidoPatron;
    }
    public Barco getBarco() {
        return barco;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    @Override
    public String toString() {
        return "Salida [id=" + id + ", fechaHoraSalida=" + fechaHoraSalida + ", destino=" + destino + "]";
    }
}
