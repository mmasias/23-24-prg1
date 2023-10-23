import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numberOne = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numberTwo = scanner.nextInt();

        System.out.println("El número mayor es: " );
        System.out.println(numberOne > numberTwo ? numberOne : numberTwo);

    }
}