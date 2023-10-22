import java.util.Scanner;

class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Segundo número: ");
        int segundoNumero = scanner.nextInt();

        int mayor = (primerNumero > segundoNumero) ? primerNumero : segundoNumero;

        System.out.println("El numero mayor es " + mayor);

        scanner.close();
    }
}
