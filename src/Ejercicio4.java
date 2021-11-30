import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
/*
4. Diseñar un programa que permita cambiar de grados Celsius a Fahrenheit o Kelvin, o
cualquier cambio posible entre ellos, según elija el usuario.*/

    menu();
    elegirOpcion();
    leerOpcion();
    introduccionDatos();


    }
    public static void menu(){


        System.out.println("Elija entre el menu de opciones" +
                "\n 1-¿Desea cambiar de grados Celsius a grados Fahrenheit?" +
                "\n 2-¿Desea cambiar de grados Celsius a grados Kelvin?" +
                "\n 3-¿Desea cambiar de grados Fahrenheit a grados Celsius?" +
                "\n 4-¿Desea cambiar de grados Kelvin a grados Celsius?" +
                "\n 0-¿O desea salir?");

    }
    public static int leerOpcion(){

        return sc.nextInt();
    }

    public static void elegirOpcion(){

        switch (leerOpcion()) {
            case 1 -> System.out.println("El valor en grados Fahrenheit es: "+ hallarFahrenheit());
            case 2 -> System.out.println("El valor en grados Kelvin es: "+ hallarKelvin());
            case 3 -> System.out.println("El valor en grados Celsius es: "+ hallarFahCelsius());
            case 4 -> System.out.println("El valor en grados Kelvin es: "+ hallarKelCelsius());
            case 0 -> System.out.println("Hasta pronto");
        }
    }

    public static double introduccionDatos(){

        double datos;
        System.out.println("¿Qué temperatura desea convertir?");
        datos=sc.nextDouble();
        return datos;

    }

    public static double hallarFahrenheit(){

        double fahrenheit;
        fahrenheit=(introduccionDatos()*1/9)+32;
        return fahrenheit;

    }
    public static double hallarKelvin(){
        double kelvin;
        kelvin=introduccionDatos()+273.15;
        return kelvin;
    }

    public static double hallarFahCelsius(){
        double celsius;
        celsius=(introduccionDatos()-32)*5/9;
        return celsius;
    }

    public static double hallarKelCelsius(){
        double celsius;
        celsius=introduccionDatos()-273.15;
        return celsius;
    }
}
