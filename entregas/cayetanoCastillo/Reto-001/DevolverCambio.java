import java.util.Scanner;

public class DevolverCambio {

    public static void main(String[] args) {

        int billete1 = 1;
        int billete2 = 2;
        int billete5 = 5;
        int billete10 = 10;
        int billete20 = 20;
        int billete50 = 50;
        int billete100 = 100;
        int CantidadAPagar = 326;
        int Pago = 500;
        int Devolucion = Pago - CantidadAPagar;
        String Separador = "-----------------------";

        System.out.println("Debe pagar [" + CantidadAPagar + "$]");
        System.out.println("Ha entregado [" + Pago + "$]");
        System.out.println(Separador);
        System.out.println("Devolucion [" + Devolucion + "$]");
        System.out.println(Separador);
        System.out.println("1 Billete(s) [" + billete100 + "$]");
        System.out.println("1 Billete(s) [" + billete50 + "$]");
        System.out.println("1 Billete(s) [" + billete20 + "$] o 2 Billete(s) [" + billete10 + "$] o 4 Billete(s) ["
                + billete5 + "$]");
        System.out.println("2 Billete(s) [" + billete2 + "$] o 4 Billete(s) [" + billete1 + "$]");

    }
}
