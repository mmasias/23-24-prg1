package entregas.lopesBrenda.reto005;
import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer Número: ");
        int numero1 = scanner.nextInt();
       
        System.out.print("Segundo Número: ");
        int numero2 = scanner.nextInt();

        scanner.close();
        System.out.println("------------------------------------");
        System.out.println((numero1 > numero2) ? "Numero Mayor: " + numero1: "Numero Mayor: " + numero2 );
    }
}
