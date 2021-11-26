import java.util.Scanner;
/*
. Realizar un programa que lea numeradores y denominadores de dos fracciones y que,
según opción, las sume, reste, multiplique o divida.
*/

public class Ejercicio3 {



    public static void main(String[] args) {


        menu();
        elegirOpcion();
        leerOpcion();


    }

    public static void menu(){


        System.out.println("Elija entre el menu de opciones" +
                "\n 1-¿Desea hallar la suma de dos numeros?" +
                "\n 2-¿Desea hallar la resta de dos numeros?" +
                "\n 3-¿Desea hallar la multiplicacion de dos numeros?" +
                "\n 4-¿Desea hallar la division de dos numeros?" +
                "\n 0-¿O desea salir?");

    }
    public static int leerOpcion(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }

    public static void elegirOpcion(){

        switch (leerOpcion()) {
            case 1 -> System.out.println(hallarSuma(crearFraccion(),crearFraccion()));
            case 2 -> System.out.println(hallarResta(crearFraccion(),crearFraccion()));
            case 3 -> System.out.println(hallarMultiplicacion(crearFraccion(),crearFraccion()));
            case 4 -> System.out.println(hallarDivision(crearFraccion(),crearFraccion()));
            case 0 -> System.out.println("Hasta pronto");
        }
    }


    public static double pedirNumerador(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un numerador");
        return sc.nextDouble();
    }
    public static double pedirDenominador(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un denominador");
        return sc.nextDouble();
    }
    public static double crearFraccion(){

        double numerador=pedirNumerador();
        double denominador=pedirDenominador();

        return numerador/denominador;
    }

    public static double hallarSuma(double fraccion1, double fraccion2){


        return fraccion1+fraccion2;
    }
    public static double hallarResta(double fraccion1, double fraccion2){

        return  fraccion1- fraccion2;

    }

    public static double hallarMultiplicacion(double fraccion1, double fraccion2){

        return fraccion1*fraccion2;

    }
    public static double hallarDivision(double fraccion1, double fraccion2){

        return fraccion1/fraccion2;

    }

}

