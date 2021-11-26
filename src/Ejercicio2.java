import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
/*
2. Diseñar un programa que leídas por teclado las coordenadas de dos vectores, calcule e
imprima según opción: El módulo de los vectores, las coordenadas del vector suma, el
producto escalar de dos vectores, y las coordenadas del vector producto vectorial de dos
vectores.
 */

        Scanner sc=new Scanner(System.in);


        System.out.println("elija la opcion");
       int opcion=sc.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("El resultado de hallar el modulo de vectores es: " + hallarModuloVectores());
            case 2 -> System.out.println("El resultado del producto escalar es:" + hallarPorductoEscalar());
            case 3, 4 -> System.out.println("En construccion");
            default -> System.out.println("en construccion");
        }

    }

    public  static double valorX(){

        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el valor de la coordenada x");
        x=sc.nextDouble();
        return x;
    }
    public  static double valorY(){

        double y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el valor de la coordenada y");
        y=sc.nextDouble();
        return y;
    }

    public static double hallarModuloVectores(){
        double x=valorX();
        double y=valorY();
        double resultadoExponentes=Math.pow(x,2)+Math.pow(y,2);
        double modVectores=Math.sqrt(resultadoExponentes);
        return modVectores;
    }
    public static double hallarPorductoEscalar(){


        double x1=valorX();
        double y1=valorY();
        double x2=valorX();
        double y2=valorY();

        double prodEscalar=x1*x2+y1*y2;

         return prodEscalar;
}

}
