package org.example.Facil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Facil10 {

    /*
     * Crea una función que reciba dos array, un booleano y retorne un array.
     * - Si el booleano es verdadero buscará y retornará los elementos comunes
     *   de los dos array.
     * - Si el booleano es falso buscará y retornará los elementos no comunes
     *   de los dos array.
     * - No se pueden utilizar operaciones del lenguaje que
     *   lo resuelvan directamente.
    */

    public static List<Integer> array(List<Integer> array1, List<Integer> array2, boolean isBuscar){
        List<Integer> elementosComunes=new ArrayList<>();
        List<Integer> elementosNoComunes=new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if(array2.contains(array1.get(i)) && !elementosComunes.contains(array1.get(i))){
                    elementosComunes.add(array1.get(i));
                }
            }
        }
        elementosNoComunes.addAll(array1);
        elementosNoComunes.addAll(array2);
        elementosNoComunes.removeAll(elementosComunes);
        return isBuscar?elementosComunes:elementosNoComunes;
    }
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(2,3,5,7,9,13,19);
        List<Integer> b= Arrays.asList(2,9,19,14,23);

        List<Integer> ra=array(a,b,true);
        for (int i = 0; i < ra.size(); i++) {
            System.out.print(ra.get(i));
            if (i<ra.size()-1) System.out.print(", ");
        }
    }
}
