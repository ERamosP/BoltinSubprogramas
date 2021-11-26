import java.util.Scanner;

public class sumaManu  {



    public static void main(String[] args) {

       /* para hallar la suma de un numero he de solicitar
        dos numeros por consola y sumarlos
        declarar variables
        entero num1, num2, total
        solicitar valores de num1 y num2
        leerlos
        total=num1+num2.
        entero hallarSuma (entero num1, entero num2);
        total=num1+num2.
        devolver total*/


       /*OTRO MODO

              pedirNum1
       */

        System.out.println( "El resultado es: " + hallarSuma());  /* (pedirNum1(),pedirNum2()) esto lo tendria que poner para hacer
       la llamada al subprograma*/
    }
    public static int pedirNum1(){

        int num1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        num1=sc.nextInt();

        return num1;
    }
    public static int pedirNum2(){

        int num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        num2=sc.nextInt();

        return num2;
    }

    public static int hallarSuma(){ //(int Num1, int Num2)  lo meto por parametros

        int num1=pedirNum1(); //llamo al subprograma pedirNum1

        int num2=pedirNum2(); //llamo al subprograma pedirNum2

        int total=num1+num2;

        return total;
    }








}