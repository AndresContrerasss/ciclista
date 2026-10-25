package com.carrera;

/**
 * 
 * 
 */
public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoAcumulado; // minutos, valor inicial 0

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
     // sirve para modificar o actualizar el tiempo ejem despues de terminar la etapa
    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    //Método abstracto: cada especialidad devuelve su tipo. 
    public abstract String imprimirTipo();

    public void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado (min): " + tiempoAcumulado);
        System.out.println("Tipo: " + imprimirTipo());
    }
}