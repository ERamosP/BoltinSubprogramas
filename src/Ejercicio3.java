import java.util.Scanner;
/*
. Realizar un programa que lea numeradores y denominadores de dos fracciones y que,
según opción, las sume, reste, multiplique o divida.
*/

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        elegirOpcion();
     }

    /**
     * menu de las posibles acciones que puede realizar el usuario
     */
    public static void menu() {


        System.out.println("Elija entre el menu de opciones" +
                " 1-¿Desea hallar la suma de dos numeros?" +
                " 2-¿Desea hallar la resta de dos numeros?" +
                " 3-¿Desea hallar la multiplicacion de dos numeros?" +
                " 4-¿Desea hallar la division de dos numeros?" +
                " 0-¿O desea salir?");

    }

    /**
     * lectura de la opcion elegida por el usuario
     *
     * @return la opcion elegida
     */
    public static int leerOpcion() {

        return sc.nextInt();
    }

    /**
     * acciones a realizar según la elección del usuario
     */
    public static void elegirOpcion() {

        boolean salir = false;
        do {
            menu();
            switch (leerOpcion()) {
                case 1 -> System.out.println(hallarSuma(crearFraccion(pedirNumerador(), pedirDenominador()), crearFraccion(pedirNumerador(), pedirDenominador())));
                case 2 -> System.out.println(hallarResta(crearFraccion(pedirNumerador(), pedirDenominador()), crearFraccion(pedirNumerador(), pedirDenominador())));
                case 3 -> System.out.println(hallarMultiplicacion(crearFraccion(pedirNumerador(), pedirDenominador()), crearFraccion(pedirNumerador(), pedirDenominador())));
                case 4 -> System.out.println(hallarDivision(crearFraccion(pedirNumerador(), pedirDenominador()), crearFraccion(pedirNumerador(), pedirDenominador())));
                case 0 -> {
                    System.out.println("Hasta pronto");
                    salir=true;
                }
                default -> System.out.println("Opcion incorrecta");

            }
        }while (!salir);
    }

    /**
     * En esta instruccion lo que hacemos es solicitarle al usuario la introduccion del numerador
     *
     * @return el numerador de la fraccion
     */
    public static double pedirNumerador() {


        System.out.println("Introduzca un numerador");
        return sc.nextDouble();
    }

    /**
     * En esta instruccion lo que hacemos es solicitarle al usuario la introduccion del denominador
     *
     * @return el denominador
     */
    public static double pedirDenominador() {


        System.out.println("Introduzca un denominador");
        return sc.nextDouble();
    }

    /**
     * Creacion de la fraccion
     *
     * @return el resultado de la fraccion
     */
    public static double crearFraccion(double numerador, double denominador) {

        /*double numerador=pedirNumerador();
        double denominador=pedirDenominador();*/

        return numerador / denominador;
    }

    /**
     * Suma de las dos fracciones por paramentros
     *
     * @param fraccion1 valor de la primera fraccion
     * @param fraccion2 valor de la segunda fraccion
     * @return el resultado de la suma
     */
    public static double hallarSuma(double fraccion1, double fraccion2) {


        return fraccion1 + fraccion2;
    }

    /**
     * Resta de dos fracciones por parametros
     *
     * @param fraccion1 valor de la primera fraccion
     * @param fraccion2 valor de la segunda fraccion
     * @return el resultado de la resta de los dos valores introducidos
     */
    public static double hallarResta(double fraccion1, double fraccion2) {

        return fraccion1 - fraccion2;

    }

    /**
     * Multiplicacion de dos fracciones con datos introducidos por valor
     *
     * @param fraccion1 valor de la primera fraccion
     * @param fraccion2 valor de la segunda fraccion
     * @return el resultado de la multiplicacion de las fracciones
     */

    public static double hallarMultiplicacion(double fraccion1, double fraccion2) {

        return fraccion1 * fraccion2;

    }

    /**
     * Division de dos fracciones con datos introducidos por valor
     *
     * @param fraccion1 valor de la primera fraccion
     * @param fraccion2 valor de la segunda fraccion
     * @return el resultado de la division
     */

    public static double hallarDivision(double fraccion1, double fraccion2) {

        return fraccion1 / fraccion2;

    }

}

