import java.util.Scanner;

public class Decostruccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero de tres cifras: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo numero de tres cifras: ");
        int segundoNumero = scanner.nextInt();

        System.out.print("Ingrese el tercer numero de tres cifras: ");
        int tercerNumero = scanner.nextInt();

        int primeraCifra = primerNumero / 100;
        int segundaCifra = (segundoNumero / 10) % 10;
        int terceraCifra = tercerNumero % 10;

        int nuevoNumero = (cifra1 * 100) + (cifra2 * 10) + cifra3;

        System.out.println("El nuevo numero formado es: " + nuevoNumero);
    }
}
