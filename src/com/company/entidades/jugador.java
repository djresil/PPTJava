package com.company.entidades;

public class jugador {
    private int puntaje = 0;
    private String nombre = "";
    private String manoJugador = "";



    public jugador() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getManoJugador() {
        return manoJugador;
    }

    public void setMano(String manoJugador) {
        this.manoJugador = manoJugador;

    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}

    