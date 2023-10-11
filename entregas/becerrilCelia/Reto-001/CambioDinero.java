public class CambioDinero {
    public static void main(String[] args) {

        int precio = 153;
        int cantidad = 200;
        int cambio = cantidad - precio; 
        System.out.println (("El cambio es: " + cambio));

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

        int moneda1 = cambio;

        System.out.println("Billetes de 50e: " + billete50);
        System.out.println("Billetes de 20e: " + billete20);
        System.out.println("Billetes de 10e: " + billete10);
        System.out.println("Billetes de 5: " + billete5);
        System.out.println("Monedas de 2e: " + moneda2);
        System.out.println("Monedas de 1e: " + moneda1);

    }
}
