package org.example.Facil;

public class Facil5 {
    //EXPRESIONES EQUILIBRADAS
    /*
     * Crea una función que reciba dos cadenas como parámetro (str1, str2)
     * e imprima otras dos cadenas como salida (out1, out2).
     * - out1 contendrá todos los caracteres presentes en la str1 pero NO
     *   estén presentes en str2.
     * - out2 contendrá todos los caracteres presentes en la str2 pero NO
     *   estén presentes en str1.
     */
    public static String out(String str1, String str2){
        String out="";

        for (int i = 0; i < str1.length(); i++) {
            String c= String.valueOf(str1.charAt(i));
            if(!str2.contains(c)){
                out+=c;
            }
        }

        return out;
    }
    public static void cadenas(String str1, String str2){
        System.out.println(String.format("Cadena inicial: %-22s Cadena final: %-2s",str1,out(str1,str2)));
        System.out.println(String.format("Cadena inicial: %-22s Cadena final: %-2s",str2,out(str2,str1)));
        System.out.println();
    }

    public static void main(String[] args) {
        cadenas("estefany","mercedes");
        cadenas("maria","mariana");
        cadenas("wilmer","antonio");
    }
}
