package org.example.Facil;

public class Facil11 {

    /*
     * Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno).
     * ¿De cuántas maneras eres capaz de hacerlo?
     * Crea el código para cada una de ellas.
     */

    public static void imprimirOneToOneHundrend(){
        System.out.println("Implementado con FOR");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("Implementado con WHILE");
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
        System.out.println("Implementado con DO - WHILE");
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while (a<=100);

    }

    public static void main(String[] args) {
        imprimirOneToOneHundrend();
    }

}
