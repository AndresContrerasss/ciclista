package com.carrera;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String imprimirTipo(){
        return "Es un Contrarrelojista";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }



}
