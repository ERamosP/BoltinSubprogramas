import java.util.Scanner;

public class calculadoraJava {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

         int num1, num2, suma;
         try{


        System.out.println("Introduce el numero 1");
        num1=sc.nextInt();
        System.out.println("Introduce el numero 2");
        num2=sc.nextInt();
        suma=num1+num2;

             System.out.println(suma);

         }catch (Exception e){
             System.out.println("No has metido un numero " + e);
         }

    }

}