import java.util.Scanner;

public class Reto005_romeroAngel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero.");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un segundo numero.");
        int num2 = scanner.nextInt();

        System.out.println((num1 > num2) ? (num1 + " es mayor que " + num2) : (num2 + " es mayor que " + num1) );
    }
}