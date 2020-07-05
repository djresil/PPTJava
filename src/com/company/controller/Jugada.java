package com.company.controller;


import com.company.entidades.JugadorIA;
import com.company.entidades.jugador;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Jugada {

    public  Jugada() {

        jugador j = new jugador();
        JugadorIA jIa = new JugadorIA();
        int contador = 0;
        int contadorIA = 0;
        int opcion = 0;
        int confirm = 0;
        boolean confirmar = false;

        System.out.println("ingrese su nombre");
        Scanner sc = new Scanner(System.in);
        j.setNombre(sc.nextLine());
        do {
            do {
                System.out.println("Hola " + j.getNombre() + " , elige una opcion ");
                do {
                    try {
                        System.out.println("1. Piedra");
                        System.out.println("2. Papel");
                        System.out.println("3. Tijera");

                        Scanner op = new Scanner(System.in);
                        opcion = op.nextInt();

                        if (opcion == 1) {
                            confirmar = true;
                            j.setMano("Piedra");
                        } else if (opcion == 2) {
                            confirmar = true;
                            j.setMano("Papel");
                        } else if (opcion == 3) {
                            confirmar = true;
                            j.setMano("Tijera");
                        } else {
                            System.out.println("opcion invalida vuelva a elegir");
                            confirmar = false;
                        }
                    } catch (InputMismatchException err) {
                        System.out.println("Solo se permiten ingresar los valores de la consola");
                    }
                } while (!confirmar);
                System.out.println("ha elegido jugar con " + j.getManoJugador());
                do {
                    try {
                        System.out.println("Elija 1 para confirmar o 2 para elegir nuevamente");
                        Scanner conf = new Scanner(System.in);
                        confirm = conf.nextInt();
                        if (confirm == 1) {
                            confirmar = true;
                        } else if (confirm == 2) {
                            confirmar = false;
                        } else {
                            System.out.println("opcion invalida");
                        }
                    } catch (InputMismatchException err) {
                        System.out.println("Solo se permiten ingresar los valores mostrados en consola");
                    }
                } while (confirm > 2);
            } while (!confirmar);

            // termina el menu para el jugador
            //inicia la logica de la maquina




            Random rd = new Random();
            int num = rd.nextInt(2) + 1;

            switch (num) {
                case 1:
                    jIa.setManoJugadorIA("Piedra");
                    break;
                case 2:
                    jIa.setManoJugadorIA("Papel");
                    break;
                case 3:
                    jIa.setManoJugadorIA("Tijera");
                    break;
                default:
                    break;
            }
            System.out.println("Has Elegido jugar con  " + j.getManoJugador() + " la maquina a elegido jugar con " +
                    jIa.getManoJugadorIA());
            if (((j.getManoJugador() == "Piedra") && (jIa.getManoJugadorIA() == "Tijera"))
                    || ((j.getManoJugador() == "Papel") && (jIa.getManoJugadorIA() == "Piedra"))
                    || j.getManoJugador() == "Tijera" && jIa.getManoJugadorIA() == "Papel") {
                System.out.println("");
                System.out.println("Has Ganado!");
                j.setPuntaje(++contador);
            } else if (j.getManoJugador() == jIa.getManoJugadorIA()) {
                System.out.println("");
                System.out.println("Es un empate");
            } else {
                System.out.println("");
                System.out.println("Has perdido");
               jIa.setPuntajeIA(++contadorIA);
            }
            do {
              try {
                    System.out.println("desea continuar");
                  System.out.println("1. Si");
                  System.out.println("2. No");
                    Scanner conf = new Scanner(System.in);
                    confirm = conf.nextInt();

                    if (confirm == 1) {
                        confirmar = true;
                    } else if (confirm == 2) {
                        confirmar = false;
                    } else {
                        System.out.println("opcion invalida");
                    }
                } catch (InputMismatchException err) {
                    System.out.println("Solo se permiten ingresar los valores mostrados en consola");
                }
            } while (confirm > 2);
        } while (confirmar);
        if ((j.getPuntaje() > 1 && jIa.getPuntajeIA() >1)|| j.getPuntaje() == 0 && jIa.getPuntajeIA() == 0) {
            System.out.println("fin del juego, has ganado " + j.getPuntaje() + " veces y la maquina " + jIa.getPuntajeIA() + " veces");
                 }else if(j.getPuntaje() ==1 && jIa.getPuntajeIA() !=1){
            System.out.println("fin del juego, has ganado " + j.getPuntaje() + " vez y la maquina " + jIa.getPuntajeIA() + " veces");
             }else  if( j.getPuntaje() == 1 && jIa.getPuntajeIA() == 1){
            System.out.println("fin del juego, has ganado " + j.getPuntaje() + " vez y la maquina " + jIa.getPuntajeIA() + "vez");
            }else if (j.getPuntaje() !=1 && jIa.getPuntajeIA() == 1){
            System.out.println("fin del juego, has ganado " + j.getPuntaje() + " veces y la maquina " + jIa.getPuntajeIA() + "vez");
            }
        }
    }

