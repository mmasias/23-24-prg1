import java.util.Scanner;

public class Reto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa tres números de 3 cifras:");
        
        
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        
        int centenas = numero1 / 100;
        int decenas = (numero2 / 10) % 10;
        int unidades = numero3 % 10;

        
        int numeroResultante = centenas * 100 + decenas * 10 + unidades;

        System.out.println("El número resultante es: " + numeroResultante);

        
        scanner.close();
    }
}