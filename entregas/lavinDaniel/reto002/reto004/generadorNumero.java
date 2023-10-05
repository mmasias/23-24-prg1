import java.util.Scanner;

public class generadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingresa tres números enteros de tres cifras:");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        // Extraer las cifras individuales de los números
        int cifra1 = numero1 / 100;     // Obtiene la primera cifra de numero1
        int cifra2 = (numero2 / 10) % 10;  // Obtiene la segunda cifra de numero2
        int cifra3 = numero3 % 10;       // Obtiene la tercera cifra de numero3

        // Construir el número resultante
        int numeroResultante = cifra1 * 100 + cifra2 * 10 + cifra3;

        System.out.println("El número resultante es: " + numeroResultante);

        scanner.close();
    }
}
