package entregas.garciaLydia.reto005;

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();


        int mayor = Math.max(numero1, numero2);


        System.out.println("El número mayor es: " + mayor);


        scanner.close();
    }
}