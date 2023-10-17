import java.util.Scanner;

public class Reto005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mayor = ((numero1 + numero2) + Math.abs(numero1 - numero2)) / 2;

        System.out.println("El número mayor es: " + mayor);
    }
}
