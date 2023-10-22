public class CambioDinero {
    public static void main(String[] args) {
        int precio = 1307;
        int cantidad = 2000;
        int cambio = cantidad - precio;
        System.out.println("El cambio es: " + cambio);

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

        System.out.println(billete100 + " Billetes de 100");
        System.out.println(billete50 + " Billetes de 50");
        System.out.println(billete20 + " Billetes de 20");
        System.out.println(billete10 + " Billetes de 10");
        System.out.println(billete5 + " Billetes de 5");
        System.out.println(moneda2 + " Monedas de 2");
        System.out.println(moneda1 + " Monedas de 1");
    }
}