package com.carrera;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
   

    private String nombreEquipo;
    private String pais;
    private int tiempoTotalEquipo; // suma de tiempos de sus ciclistas (min)
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
     public void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        this.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    // Añade un ciclista y suma su tiempo acumulado al tiempo total del equipo. 
    public void añadirCiclista(Ciclista ciclista) {
        if (ciclista == null) {
            throw new IllegalArgumentException("El ciclista no puede ser nulo");
        }
    ciclistas.add(ciclista);
        tiempoTotalEquipo += ciclista.getTiempoAcumulado();
    
    }
    
     public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo total del equipo (min): " + tiempoTotalEquipo);
        System.out.println("Cantidad de ciclistas: " + ciclistas.size());
    }

    public void listarNombresCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }
    
    public void imprimirDatosCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("No se encontró un ciclista con identificador " + id);
    }
    

    


}

