import java.util.Scanner;

class deconstrucciondeunnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número de tres cifras: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número de tres cifras: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número de tres cifras: ");
        int numero3 = scanner.nextInt();

        int digito1 = numero1 / 100;
        int digito2 = (numero2 / 10) % 10;
        int digito3 = numero3 % 10;

        int numerofinal = (digito1 * 100) + (digito2 * 10) + digito3;

        System.out.println("El número  es: " + numerofinal);

        scanner.close();
    }
}
