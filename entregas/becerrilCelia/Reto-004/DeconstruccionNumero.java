import java.util.Scanner;

public class DeconstruccionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros enteros de 3 cifras separados");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int centenas = numero1 / 100;
        int decenas = (numero2 / 10) % 10;
        int unidades = numero3 % 10;

        System.out.println ("El numero es: " + centenas + decenas + unidades);
        scanner.close();

    }
}