import java.util.Scanner;

public class boletin6Ejer3 {

    static Scanner sc = new Scanner(System.in);

    /**
     * En el Main colocamos por orden las acciones que deseamos que se realicen para ejecutar un programa
     * @param args
     */
    public static void main(String[] args) {


        elegirOpcionAreaVolumen();


/* Ejercicio 3: Diseñar un programa que nos permita calcular áreas y
volúmenes de distintas figuras geométricas, como conos, pirámides y cilindros, según elija el usuario.*/
    }

    // System.lineSeparator(); sirve para los saltos de linea en los print y printf y en la concatenacion de cadenas

    public static void imprimirMenu() {

        System.out.println("¿Que opcion desea realizar?" + System.lineSeparator() +
                " 1 - ¿Desea calcular el area?" + System.lineSeparator() +
                " 2 - ¿Desea calcular el volumen?" + System.lineSeparator() +
                " 0 - Salir");

    }

    public static int leerOpcion() {

        return sc.nextInt();
    }

    public static void elegirOpcionAreaVolumen() {
        int opcion;
        boolean salir=false;
        do {
            imprimirMenu();
            opcion = leerOpcion();

            switch (opcion) {

                case 1:
                    System.out.println("En construccion");
                    break;

                case 2:
                    System.out.println("En construccion");
                    break;
                case 0:
                    System.out.println("Adios");
                    salir=true;
                    break;
                default:
                    System.out.println("No existe");

            }
        }while (!salir);

    }


}
