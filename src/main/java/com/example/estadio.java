package com.example;

public class Estadio {
    public String nombre;
    public String ciudad;
    public int capacidad;

    public void mostrarInformacion() {
        System.out.println("Estadio: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Capacidad: " + capacidad);
        System.out.println();
    }
}
