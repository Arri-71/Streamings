package co.edu.unisabana.streamings.controller;

import java.io.Serializable;

public class movie implements Serializable {

    private String NombrePelicula;
    private String Fecha;
    private String Empresa;


    public movie(String NombrePelicula, String Fecha, String Empresa) {
        this.NombrePelicula = NombrePelicula;
        this.Fecha = Fecha;
        this.Empresa = Empresa;
    }

    public String getNombrePelicula() {
        return NombrePelicula;
    }

    public void setNombrePelicula(String NombrePelicula) {
        this.NombrePelicula = NombrePelicula;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
}
