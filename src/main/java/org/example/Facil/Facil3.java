package org.example.Facil;

public class Facil3 {
    //INVIRTIENDO CADENAS
    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     */
    public static void invirtiendoCadena(String cadena){
        String cadenaInvertida="";
        for (int i = cadena.length()-1; i >= 0; i--) {
            cadenaInvertida+=cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);
    }

    public static void main(String[] args) {
        invirtiendoCadena("Hola programadores");
    }
}
