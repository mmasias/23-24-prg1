import java.util.Scanner;

public class Reto004 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese tres números enteros de tres cifras:");
            System.out.print("Número 1: ");
            int numero1 = scanner.nextInt();

            System.out.print("Número 2: ");
            int numero2 = scanner.nextInt();

            System.out.print("Número 3: ");
            int numero3 = scanner.nextInt();

            int cifra1 = numero1 / 100; // Obtiene la primera cifra del primer número
            int cifra2 = (numero2 / 10) % 10; // Obtiene la segunda cifra del segundo número
            int cifra3 = numero3 % 10; // Obtiene la tercera cifra del tercer número

            int resultado = cifra1 * 100 + cifra2 * 10 + cifra3; // Construye el número resultante

            System.out.println("El número resultante es: " + resultado);
        }
    }
}