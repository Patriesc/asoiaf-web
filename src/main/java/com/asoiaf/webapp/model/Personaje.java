package com.asoiaf.webapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "personajes")
public class Personaje implements Serializable {

    private enum Casa{stark, targaryen, baratheon, lannister}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Casa casa;
    private String nombre;

    // Asociamos a cada personaje una columna con sus stats
    @OneToOne
    @JoinColumn(name = "stats_id", nullable = false)
    private Stats stats;

    public Personaje() {
    }

    public Personaje(Casa casa, String nombre, Stats stats) {
        this.casa = casa;
        this.nombre = nombre;
        this.stats = stats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }


}
