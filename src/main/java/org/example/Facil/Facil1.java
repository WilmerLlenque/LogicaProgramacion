package org.example.Facil;

public class Facil1 {
    //EL FAMOSO "FIZZ BUZZ"
    /*
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */

    public static void numerosOneToOneHundred(){
        String res="";
        for (int i = 1; i <= 100; i++) {
            if (i%3==0){
                res+="fizz";
            }
            if (i%5==0){
                res+="buzz";
            }
            System.out.println(res.isEmpty() ? i : res);
            res="";
        }
    }

    public static void main(String[] args) {
        numerosOneToOneHundred();
    }

}
