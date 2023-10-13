package entregas.lopesBrenda.reto003;
import java.util.Scanner;

public class DevolverCambioMejorado {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("------------------------------------");
    System.out.print("Cuantos euros debe? ");
    int montoAPagar = scanner.nextInt();
   
    System.out.print("Cuantos euros entrega? ");
    int montoPago = scanner.nextInt();

    scanner.close();

    int cambio = montoPago - montoAPagar;

    int billete100 = cambio/100;
    cambio = cambio % 100;

    int billete50 = cambio/50;
    cambio = cambio % 50;

    int billete20 = cambio/20;
    cambio = cambio % 20;

    int billete10 = cambio/10;
    cambio = cambio % 10;

    int billete5 = cambio/5;
    cambio = cambio % 5;

    int moneda2 = cambio/2;
    cambio = cambio % 2;

    System.out.println("------------------------------------");
    System.out.println("Deberia recibir: " );
    System.out.print("------------------------------------");
    System.out.print((billete100 > 0) ? "\n" + billete100 + " billete(s) de 100€ ": "" );
    System.out.print((billete50 > 0) ? "\n" + billete50 + " billete(s) de 50€ ":  "" );
    System.out.print((billete20 > 0) ? "\n" +billete20 + " billete(s) de 20€ ": "" );
    System.out.print((billete10 > 0) ? "\n" +billete10 + " billete(s) de 10€ ": "" );
    System.out.print((billete5 > 0) ? "\n" +billete5 + " billete(s) de 5€ ": "" );
    System.out.print((moneda2 > 0) ? "\n" +moneda2 + " moneda(s) de 2€ ": "" );
    System.out.print((cambio > 0) ? "\n" +cambio + " moneda(s) de 1€ ": "" );


    }
}
