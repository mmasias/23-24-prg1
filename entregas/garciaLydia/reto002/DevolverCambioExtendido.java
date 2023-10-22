package entregas.garciaLydia.reto002;

public class DevolverCambioExtendido {
    public static void main(String[] args) {

        int montoAPagar = 337;
        int montoEntregado = 500;


        int cambioTotal;
        cambioTotal = montoEntregado - montoAPagar;
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

        System.out.print("......................................... ");
        System.out.print((billete100 > 0) ? "\nBilletes de 100:" + billete100 : "");
        System.out.print((billete50 > 0) ? "\nBilletes de 50:" + billete50 : "");
        System.out.print((billete20 > 0) ? "\nBilletes de 20:" + billete20 : "");
        System.out.print((billete10 > 0) ? "\nBilletes de 10:" + billete10 : "");
        System.out.print((billete5 > 0) ? "\nBilletes de 5:" + billete5 : "");
        System.out.print((moneda2 > 0) ? "\nMonedas de 2:" + moneda2 : "");
        System.out.print((moneda1 > 0) ? "\nMonedas de 1:" + moneda1 : "");
        System.out.print("\n..........................................  ");
    }
}

