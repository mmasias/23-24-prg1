import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        int mayor;

        if (numero1 > numero2) {
            mayor = numero1;
        } else {
            mayor = numero2;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
