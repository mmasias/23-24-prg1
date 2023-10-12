import java.util.Scanner;

public class decostruccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero de tres cifras: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero de tres cifras: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero de tres cifras: ");
        int num3 = scanner.nextInt();

        int cifra1 = num1 / 100;
        int cifra2 = (num2 / 10) % 10;
        int cifra3 = num3 % 10;

        int nuevoNumero = (cifra1 * 100) + (cifra2 * 10) + cifra3;

        System.out.println("El nuevo numero formado es: " + nuevoNumero);
    }
}
