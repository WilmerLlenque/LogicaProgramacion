package org.example.Facil;

public class Facil6 {

    //FACTORIAL RECURSIVO
    /*
     * Escribe una función que calcule y retorne el factorial de un número dado
     * de forma recursiva.
     */
    public static int factorialRecursivo(int numero){
        int resultado=1;
        if (numero<0) resultado=0;
        if (numero==0) resultado=1;
        if (numero>0) resultado=numero * factorialRecursivo(numero-1);

        return resultado;
    }
    public static void factorial(int num){
        int factorial=factorialRecursivo(num);
        System.out.println("El factorial de "+num+" es: "+factorial);
    }
    public static void main(String[] args) {
        factorial(5);
        factorial(8);
        factorial(9);
    }
}
