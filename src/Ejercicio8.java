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


        long factorial = 1;
        for (long i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static long hallarCombinatorio(long n, long m) {

         long x = hallarFactorial(n);
         long y = hallarFactorial(m);
        long restaFact = hallarFactorial(n-m);


        return x / (y * restaFact);
    }

    public static void pintarPiramide(long altura){


        for (int i=0; i<altura; i++){

            for(int j=0; j<=i;j++){
                System.out.print(hallarCombinatorio(i,j));

            }
            System.out.println();
        }

    }
}
