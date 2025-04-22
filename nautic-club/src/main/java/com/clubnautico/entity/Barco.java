package com.clubnautico.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "barcos")
public class Barco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "La matrícula es obligatoria")
    private String matricula;

    @NotBlank(message = "El nombre del barco es obligatorio")
    private String nombre;

    @NotNull(message = "El número de amarre es obligatorio")
    private Integer numeroAmarre;

    @NotNull(message = "La cuota es obligatoria")
    @DecimalMin(value = "0.0", inclusive = false, message = "La cuota debe ser mayor que 0")
    private BigDecimal cuota;

    // Relación es uno a uno, cada barco pertenece a un socio
    @ManyToOne
    @JoinColumn(name = "socio_id")
    private Socio socio;

    // Relación es de uno a muchos, un barco puede tener varias salidas
    @OneToMany(mappedBy = "barco", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Salida> salidas = new ArrayList<>();

    // Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNumeroAmarre() {
        return numeroAmarre;
    }
    public void setNumeroAmarre(Integer numeroAmarre) {
        this.numeroAmarre = numeroAmarre;
    }
    public BigDecimal getCuota() {
        return cuota;
    }
    public void setCuota(BigDecimal cuota) {
        this.cuota = cuota;
    }
    public Socio getSocio() {
        return socio;
    }
    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    public List<Salida> getSalidas() {
        return salidas;
    }
    public void setSalidas(List<Salida> salidas) {
        this.salidas = salidas;
    }
    
    @Override
    public String toString() {
        return "Barco [id=" + id + ", matricula=" + matricula + ", nombre=" + nombre + "]";
    }
}
