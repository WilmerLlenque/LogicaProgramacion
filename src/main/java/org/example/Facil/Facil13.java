package org.example.Facil;

public class Facil13 {
    /*
     * Crea un programa que determine si dos vectores son ortogonales.
     * - Los dos array deben tener la misma longitud.
     * - Cada vector se podría representar como un array. Ejemplo: [1, -2]
     */

    public static void vectoresOrtogonales(int [] array1, int [] array2){
        boolean isOrtogonal=false;

        int rs=array1[0]*array2[0]+ array1[1]*array2[1];
        if(rs == 0) isOrtogonal=true;

        System.out.println(isOrtogonal?"Los vectores SI son ortogonales":"Los vectores NO son ortogonales");
    }

    public static void main(String[] args) {
        int [] array1={1,2};
        int [] array2={-2,1};
        vectoresOrtogonales(array1,array2);
    }
}
