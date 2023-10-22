package entregas.lopesBrenda.reto004;
import java.util.Scanner;

public class DeconstruccionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer Número: ");
        int numero1 = scanner.nextInt();
       
        System.out.print("Segundo Número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Tercer Número: ");
        int numero3 = scanner.nextInt();
    
        scanner.close();

        int primeraCifra = numero1 / 100;
        int segundaCifra = (numero2 / 10) % 10;
        int terceraCifra = numero3 % 10;

        int numeroCreado = primeraCifra * 100 + segundaCifra * 10 + terceraCifra;
        System.out.println("------------------------------------");
        System.out.println("Número creado: " + numeroCreado);
    }
}
