import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera fila, compuesta de solo 3 números:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce la segunda, compuesta de solo 3 números:");
        int num2 = scanner.nextInt();

        System.out.println("Introduce la tercera fila, compuesta de solo 3 números:");
        int num3 = scanner.nextInt();

        int hundreds = num1 / 100;
        int tens = (num2 / 10) % 10;
        int units = num3 % 10;
        
        int resultado = hundreds * 100 + tens * 10 + units;

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}
