
public class DevolverCambio {
    public static void main(String[] args) {
        int Billete100 = 100;
        int billete50 = 50;
        int billete20 = 20;
        int billete10 = 10;
        int billete5 = 5;
        int moneda2 = 2;
        int moneda1 = 1;

        int cantidadAPagar = 150, cantidadEntregada=200, cambio;
        cambio = cantidadEntregada - cantidadAPagar;

        int billete100 = cambio / 100;
        cambio = cambio % Billete100;
        billete50 = cambio / 50;
        cambio = cambio % billete50;
        billete20 = cambio / 20;
        cambio = cambio % billete20;
        billete10 = cambio / 10;
        cambio = cambio % billete10;
        billete5 = cambio / 5;
        cambio = cambio % billete5;
        moneda2 = cambio / 2;
        cambio = cambio % moneda2;
        moneda1 = cambio / 1;
        cambio = cambio % moneda1;


        System.out.println("El cambio es: " + cambio);
        System.out.println("------------------------");
        System.out.println("Billetes de 100: " + billete100);
        System.out.println("Billetes de 50: " + billete50);
        System.out.println("Billetes de 20: " + billete20);
        System.out.println("Billetes de 10: " + billete10);
        System.out.println("Billetes de 5: " + billete5);
        System.out.println("Monedas de 2: " + moneda2);
        System.out.println("Monedas de 1: " + moneda1);


    }
}
