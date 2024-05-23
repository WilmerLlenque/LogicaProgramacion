package org.example.Facil;

public class Facil8 {

    /*
     * Crea una función que reciba un String de cualquier tipo y se encargue de
     * poner en mayúscula la primera letra de cada palabra.
     * - No se pueden utilizar operaciones del lenguaje que
     *   lo resuelvan directamente.
     */
    public static void cadenaMayusula(String str){
        String palabra="",respuesta="";
        String [] res=str.replaceAll("[^A-zÀ-ú]"," ").split(" ");

        for (int i = 0; i < res.length; i++) {
            if(res[i].length()>0){
                palabra=res[i].substring(0,1).toUpperCase()+res[i].substring(1);
                respuesta+=palabra+" ";
            }
        }
        System.out.println(respuesta);
    }

    public static void main(String[] args) {
        cadenaMayusula("hola mundo! cómo estás?");
        cadenaMayusula("El niño ñoño");
        cadenaMayusula("¿hola      qué tal estás?");

    }

}
