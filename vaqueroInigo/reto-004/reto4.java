import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero de tres cifras: ");
        int numeroA = scanner.nextInt();

        System.out.print("Ingrese el segundo numero de tres cifras: ");
        int numeroB = scanner.nextInt();

        System.out.print("Ingrese el tercer numero de tres cifras: ");
        int numeroC = scanner.nextInt();

        int cifra1 = numeroA / 100; 
        int cifra2 = (numeroB / 10) % 10; 
        int cifra3 = numeroC % 10; 

        int nuevoNumero = cifra1 * 100 + cifra2 * 10 + cifra3;

        System.out.println("El nuevo numero resultante es: " + nuevoNumero);
    }
}