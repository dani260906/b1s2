package com.example;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Estadio estadio1 = new Estadio();
        Estadio estadio2 = new Estadio();

        estadio1.nombre = "Metropolitano";
        estadio1.ciudad = "Barranquilla";
        estadio1.capacidad = 47000;

        estadio2.nombre = "El Campín";
        estadio2.ciudad = "Bogotá";
        estadio2.capacidad = 36000;

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();

        // Ejercicio 3
        JugadorFutbol jugador1 = new JugadorFutbol();
        JugadorFutbol jugador2 = new JugadorFutbol();
        JugadorFutbol jugador3 = new JugadorFutbol();

        jugador1.nombre = "Luis Díaz";
        jugador1.edad = 27;
        jugador1.posicion = "Delantero";

        jugador2.nombre = "James Rodríguez";
        jugador2.edad = 32;
        jugador2.posicion = "Centrocampista";

        jugador3.nombre = "David Ospina";
        jugador3.edad = 35;
        jugador3.posicion = "Portero";

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        // Ejercicio 2
        jugador2.cambiarPosicion("Extremo");
    }
}