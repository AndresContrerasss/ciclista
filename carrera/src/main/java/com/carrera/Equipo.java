package com.carrera;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
   

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo; // suma de tiempos de sus ciclistas (min)
    private List<Ciclista> ciclistas;

     public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }
    
}

