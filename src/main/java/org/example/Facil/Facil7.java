package org.example.Facil;

public class Facil7 {
    //ES UN NUMERO DE ARMSTRONG
    /*
     * Escribe una función que calcule si un número dado es un número de Armstrong
     * (o también llamado narcisista).
     * Si no conoces qué es un número de Armstrong, debes buscar información
     * al respecto.
     */
    public static void numeroDeArmstrong(int num){
        int armstrong=0;
        int numInicial=num;

        while(num!=0){
            armstrong+= (int) Math.pow(num%10,String.valueOf(numInicial).length());
            num/=10;
        }
        if(numInicial == armstrong && numInicial>0) {
            System.out.println(numInicial+" SI es un numero de armstrong");
        }else {
            System.out.println(numInicial+" No es un numero de armstrong");
        }
    }
    public static void main(String[] args) {
        numeroDeArmstrong(-153);
        numeroDeArmstrong(153);
        numeroDeArmstrong(370);
        numeroDeArmstrong(128);
        numeroDeArmstrong(371);
        numeroDeArmstrong(407);
        numeroDeArmstrong(156);
        numeroDeArmstrong(1634);
        numeroDeArmstrong(8208);
        numeroDeArmstrong(89);
        numeroDeArmstrong(9474);
    }
}
