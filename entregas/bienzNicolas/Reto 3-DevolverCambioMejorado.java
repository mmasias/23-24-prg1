import java.util.Scanner;

public class CambioDinero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a pagar: ");
        int costo = scanner.nextInt();

        System.out.print("Ingrese el monto entregado: ");
        int billetera = scanner.nextInt();

        int cambio = billetera - costo;

        System.out.println("Su cambio es " + cambio);

        int billete100 = cambio / 100;
        cambio = cambio % 100;

        int billete50 = cambio / 50;
        cambio = cambio % 50;

        int billete20 = cambio / 20;
        cambio = cambio % 20;

        int billete10 = cambio / 10;
        cambio = cambio % 10;

        int billete5 = cambio / 5;
        cambio = cambio % 5;

        int moneda2 = cambio / 2;
        cambio = cambio % 2;

        int moneda1 = cambio / 1;
        cambio = cambio % 1;

        System.out.println("Billetes de 100: " + billete100);
        System.out.println("Billetes de 50:  " + billete50);
        System.out.println("Billetes de 20:  " + billete20);
        System.out.println("Billetes de 10:  " + billete10);
        System.out.println("Billetes de 5:   " + billete5);
        System.out.println("Monedas de 2:    " + moneda2);
        System.out.println("Monedas de 1:    " + moneda1);
    }
}
