package entregas.garciaLydia.reto004;

import java.util.Scanner;

public class Deconstruccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número de tres cifras: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número de tres cifras: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número de tres cifras: ");
        int num3 = scanner.nextInt();


        int resultado = (num1 / 100 % 10) * 100 + (num2 / 10 % 10) * 10 + (num3 % 10);


        System.out.println("NUMERO: " + resultado);
    }
}

