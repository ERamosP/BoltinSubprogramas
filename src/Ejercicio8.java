public class Ejercicio8 {
    public static void main(String[] args) {
        /*8. Diseñar un subprograma para pintar la pirámide de Tartaglia (Busca en Internet las
        especificaciones).*/



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

    public static void pintarPiramide(long altura){

        for (long i=0;i<=altura-1;i++){
            for (int k=0;k<=altura;k++){
                System.out.print(" ");
            }
            for (long j=0;j<=i;i++){
                System.out.print("");
            }
        }

    }
}
