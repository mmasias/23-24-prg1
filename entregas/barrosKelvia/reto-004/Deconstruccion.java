import java.util.Scanner;

public class Deconstruccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número de tres cifras:");
        int numero1 = scanner.nextInt();
            
        System.out.println("Ingrese el segundo número de tres cifras:");
        int numero2 = scanner.nextInt();
            
        System.out.println("Ingrese el tercer número de tres cifras:");
        int numero3 = scanner.nextInt();
            
        int cifra1 = numero1 / 100; 
        int cifra2 = (numero2 / 10) % 10; 
        int cifra3 = numero3 % 10; 
        int numeroGenerado = cifra1 * 100 + cifra2 * 10 + cifra3; 
            
            
        System.out.println("El número generado es: " + numeroGenerado);
    }
}
