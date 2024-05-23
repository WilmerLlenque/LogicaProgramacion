package org.example.Facil;

public class Facil12 {

    /*
     * Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
     * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
     * - EXTRA: ¿Eres capaz de dibujar más figuras?
     */

    public static void dibujarCuadrado(int tamanio){
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void dibujarTriangulo(int tamanio){
        for (int i = 0; i < tamanio; i++) {
            for (int j = tamanio-i; j >1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void dibujar(int tamanio,String figura){
        if (figura.toLowerCase().equals("cuadrado")){
            dibujarCuadrado(tamanio);
        }
        if(figura.toLowerCase().equals("triangulo")){
            dibujarTriangulo(tamanio);
        }
    }

    public static void main(String[] args) {
        dibujar(6,"cuadrado");
        dibujar(6,"triangulo");

    }

}
