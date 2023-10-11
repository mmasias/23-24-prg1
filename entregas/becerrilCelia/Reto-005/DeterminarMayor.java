import java.util.Scanner;

public class DeterminarMayor {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numeroMayor;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1er numero: ");
        numero1 = scanner.nextInt();

        System.out.print("2do numero: ");
        numero2 = scanner.nextInt();

        numeroMayor = (numero1 > numero2) ? numero1 : numero2;

        System.out.println("El mayor de los 2 numeros es: " + numeroMayor);

        scanner.close();
    }
}