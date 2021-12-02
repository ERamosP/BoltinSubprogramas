import java.util.Scanner;

public class Ejercicio8 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        /*8. Diseñar un subprograma para pintar la pirámide de Tartaglia (Busca en Internet las
        especificaciones).*/

        long filas;
        System.out.println("introduzca la altura de la piramide");
        filas=sc.nextLong();
        pintarPiramide(filas);

    }

    public static int pedirDatos(){

        System.out.println("Introduzca el valor que desee");
        return sc.nextInt();
    }
    public static long hallarFactorial(long num) {

        num=pedirDatos();
        long factorial = 1;
        for (long i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static long hallarCombinatorio(long n, long m) {

         n = hallarFactorial(pedirDatos());
         m = hallarFactorial(pedirDatos());
        long restaFact = hallarFactorial(n-m);


        return n / (m * restaFact);
    }

    public static void pintarPiramide(long altura){


        for (long i=0;i<=altura-1;i++){
            for (int k=0;k<=altura;k++){
                System.out.print(k+" ");
            }
            for (long j=0;j<=i;i++){
                System.out.print("");
                System.out.print(hallarCombinatorio(i,j)+" ");
            }

        }

    }
}
