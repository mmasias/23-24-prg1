
import java.util.Scanner;
public class MayorNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Ingrese el número 1: ");
        int num1= s.nextInt();

        System.out.println("Ingrese el número 2: ");
        int num2= s.nextInt();

        int mayor= num1>num2 ? num1:num2;

        System.out.println("El número mayor es: " + mayor);

    }
}
