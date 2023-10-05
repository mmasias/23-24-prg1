import java.util.Scanner;

public class generadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número (de tres cifras): ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número (de tres cifras): ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número (de tres cifras): ");
        int num3 = scanner.nextInt();

        int resultado = generarNumero(num1, num2, num3);

        System.out.println("El número generado es: " + resultado);
    }

    public static int generarNumero(int num1, int num2, int num3) {
   
        int cifra1 = num1 / 100;
        int cifra2 = (num2 / 10) % 10;
        int cifra3 = num3 % 10;

        int resultado = cifra1 * 100 + cifra2 * 10 + cifra3;

        return resultado;
    }
}
