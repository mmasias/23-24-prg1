import java.util.Scanner;

public class DevolverCambioMejorado {

    public static void main(String[] args) {

        int CantidadAPagar = 326;
        int Pago = 500;
        int Devolucion = Pago - CantidadAPagar;
        int billete100 = Devolucion / 100;
        Devolucion = Devolucion % 100;
        int billete50 = Devolucion / 50;
        Devolucion = Devolucion % 50;
        int billete20 = Devolucion / 20;
        Devolucion = Devolucion % 20;
        int billete10 = Devolucion / 10;
        Devolucion = Devolucion % 10;
        int billete5 = Devolucion / 5;
        Devolucion = Devolucion % 5;
        int billete2 = Devolucion / 2;
        Devolucion = Devolucion % 2;
        int billete1 = Devolucion;

        String Separador = "-----------------------";

        System.out.println("Debe pagar [" + CantidadAPagar + "$]");
        System.out.println("Ha entregado [" + Pago + "$]");
        System.out.println(Separador);
        System.out.println("Devolucion [" + Devolucion + "$]");
        System.out.println(Separador);

        System.out.println(billete100 + " Billete(s) [100$]");
        System.out.println(billete50 + " Billete(s) [50$]");
        System.out.println(billete20 + " Billete(s) [20$]");
        System.out.println(billete10 + " Billete(s) [10$]");
        System.out.println(billete5 + " Billete(s) [5$]");
        System.out.println(billete2 + " Billete(s) [2$]");
        System.out.println(billete1 + " Billete(s) [1$]");

    }
}

