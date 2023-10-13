import java.util.Scanner;

public class TresCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número (de 3 cifras): ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número (de 3 cifras): ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número (de 3 cifras): ");
        int numero3 = scanner.nextInt();

        // Extraer las cifras
        int cifra1 = numero1 % 10;
        int cifra2 = (numero2 / 10) % 10;
        int cifra3 = (numero3 / 100) % 10;

        // Combinar las cifras
        int resultado = cifra1 * 100 + cifra2 * 10 + cifra3;

        System.out.println("El resultado es: " + resultado);
    }
}