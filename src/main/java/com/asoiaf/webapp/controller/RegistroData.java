package com.asoiaf.webapp.controller;


public class RegistroData {
    private String eMail;
    private String password;
    private String nombre;
    private String casaElegida;

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasaElegida() {
        return casaElegida;
    }

    public void setCasaElegida(String casaElegida) {
        this.casaElegida = casaElegida;
    }

}
