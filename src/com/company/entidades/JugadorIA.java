package com.company.entidades;

public  class JugadorIA {
    private String name = "Maquina";
    private  int puntajeIA = 0;
    private  String manoJugadorIA = "";

    public JugadorIA(String name, int puntajeIA, String manoJugadorIA) {
        this.name = name;
        this.puntajeIA = puntajeIA;
        this.manoJugadorIA = manoJugadorIA;
    }

    public JugadorIA() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntajeIA() {
        return puntajeIA;
    }

    public void setPuntajeIA(int puntajeIA) {
        this.puntajeIA = puntajeIA;
    }

    public String getManoJugadorIA() {
        return manoJugadorIA;
    }

    public void setManoJugadorIA(String manoJugadorIA) {
        this.manoJugadorIA = manoJugadorIA;
    }
}
