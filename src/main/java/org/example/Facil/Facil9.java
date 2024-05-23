package org.example.Facil;

public class Facil9 {

    /*
     * Crea una función que reciba días, horas, minutos y segundos (como enteros)
     * y retorne su resultado en milisegundos.
     */

    public static void milisegundos(int dias, int horas,int minutos, int segundos){
        final int DIA_SEGUNDOS=86400;
        final int HORA_SEGUNDOS=3600;
        final int MINUTOS_SEGUNDOS=60;
        int total_segundos=0,total_milisegundos=0;

        total_segundos=dias*DIA_SEGUNDOS+horas*HORA_SEGUNDOS+minutos*MINUTOS_SEGUNDOS+segundos;
        total_milisegundos=total_segundos*1000;
        System.out.println(total_milisegundos);

    }

    public static void main(String[] args) {
        milisegundos(0, 0, 0, 10);
        milisegundos(2, 5, -45, 10);
        milisegundos(2000000000, 5, 45, 10);
    }

}
