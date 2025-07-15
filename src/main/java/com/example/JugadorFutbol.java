package com.example;

public class JugadorFutbol {
    public String nombre;
    public int edad;
    public String posicion;

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y juego como " + posicion + ".");
    }

    public void cambiarPosicion(String nuevaPosicion) {
        posicion = nuevaPosicion;
        System.out.println(nombre + " ahora juega como " + nuevaPosicion);
    }
}
