package entregas.garciaLydia.reto001;

public class DevolverCambio {
    public static void main(String[] args) {

        int montoAPagar = 337;
        int montoEntregado = 500;
        int cambioTotal = montoEntregado - montoAPagar;
        int cambio = cambioTotal;


        int billete100 = cambio / 100;
        cambio %= 100;

        int billete50 = cambio / 50;
        cambio %= 50;

        int billete20 = cambio / 20;
        cambio %= 20;

        int billete10 = cambio / 10;
        cambio %= 10;

        int billete5 = cambio / 5;
        cambio %= 5;

        int moneda2 = cambio / 2;
        cambio %= 2;

        int moneda1 = cambio;

        System.out.println("..........................................  ");
        System.out.println("Dinero a pagar:" + montoAPagar);
        System.out.println("Dinero entregado:" + montoEntregado);
        System.out.println("Cambio a devolver:" + cambioTotal);
        System.out.println("..........................................  ");
        System.out.println("Billetes de 100: " + billete100);
        System.out.println("Billetes de 50: " + billete50);
        System.out.println("Billetes de 20: " + billete20);
        System.out.println("Billetes de 10: " + billete10);
        System.out.println("Billetes de 5: " + billete5);
        System.out.println("Monedas de 2: " + moneda2);
        System.out.println("Monedas de 1: " + moneda1);
        System.out.println("..........................................  ");
    }
}