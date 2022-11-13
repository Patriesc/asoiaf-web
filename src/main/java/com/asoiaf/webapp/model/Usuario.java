package com.asoiaf.webapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String email;
    private String nombre;
    private String role;
    private String contraseña;
    private String casaElegida;

    public Usuario() {
    }

    public Usuario(String email) {
        this.email = email;
    }

    public boolean checkPassword(String password){
        return contraseña.equals(password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCasaElegida() {
        return casaElegida;
    }

    public void setCasaElegida(String casaElegida) {
        this.casaElegida = casaElegida;
    }
}
