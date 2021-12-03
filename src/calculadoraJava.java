import java.util.Scanner;

public class calculadoraJava {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, suma, contadorErrores = 0;
        boolean seguir = false;

        do {


            try {

                seguir=true;
                System.out.println("Introduce el numero 1");
                num1 = sc.nextInt();
                System.out.println("Introduce el numero 2");
                num2 = sc.nextInt();
                suma = num1 + num2;

                System.out.println(suma);

            } catch (Exception e) {
                seguir=false;
                sc.nextLine();
                System.out.println("No has metido un numero " + e);
                contadorErrores++;
            }
        } while (!seguir);
        System.out.println("Has tenido " +contadorErrores + " fallos");
    }

}