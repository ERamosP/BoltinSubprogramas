import java.util.Scanner;

public class Ejercicio7 {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        int datoN = 0, datoM = 0;
        do {
            System.out.println("el denominador no puede ser mayor que numerador");
            System.out.println("Introduce el numerador");
            datoN = sc.nextInt();
            System.out.println("Introduce el denominador");
            datoM = sc.nextInt();


        } while (datoN < datoM);

        System.out.println(hallarCombinatorio(datoN, datoM));
    }

    public static long hallarFactorial(int num) {

        long factorial = 1;
        for (long i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static long hallarCombinatorio(int n, int m) {

        long factn = hallarFactorial(n);
        long factm = hallarFactorial(m);
        long restaFact = hallarFactorial(n - m);
        long combinatorio = factn / (factm * restaFact);

        return combinatorio;
    }
}
