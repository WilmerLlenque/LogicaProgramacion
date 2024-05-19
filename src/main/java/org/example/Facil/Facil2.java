package org.example.Facil;

public class Facil2 {
    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void area(Poligono tipoPoligono){
        tipoPoligono.printArea();
    }

    public static void main(String[] args) {
        area(new Cuadrado(9));
        area(new Rectangulo(20,15));
        area(new Tiangulo(22,18));
    }
}
class Cuadrado implements Poligono {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public void printArea() {
        System.out.println("El area del cuadrado es: "+area());
    }
}
class Tiangulo implements Poligono {

    private double base;
    private double altura;

    public Tiangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public void printArea() {
        System.out.println("El area del triangulo es: "+area());
    }
}
class Rectangulo implements Poligono {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public void printArea() {
        System.out.println("El area del rectangulo es: "+area());
    }
}