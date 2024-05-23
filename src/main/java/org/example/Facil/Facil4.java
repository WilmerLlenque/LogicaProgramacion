package org.example.Facil;

public class Facil4 {

    //CONTANDO PALABRAS
    /*
     * Crea un programa se encargue de transformar un número
     * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
     */
    public static void decimalABinario(int numero){
        String numBinario="";
        int decimal=numero;
        while (numero!=0){
            numBinario= String.format("%s%s", (numero % 2), numBinario);
            numero=numero/2;
        }
        System.out.println(decimal+" (dec) = "+numBinario+" (bin) ");
    }

    public static void main(String[] args) {
        decimalABinario(34);
        decimalABinario(589);
        decimalABinario(78);
    }

}
