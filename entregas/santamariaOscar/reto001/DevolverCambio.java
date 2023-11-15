
class DevolverCambio {
    public static void main(String[] args) {
        int billete100 = 100;
        int billete50 = 50;
        int billete20 = 20;
        int billete10 = 10;
        int billete5 = 5;
        int moneda2 = 2;
        int moneda1 = 1;

        int cantidadAPagar = 150, cantidadEntregada = 200, cambio;
        cambio = cantidadEntregada - cantidadAPagar;

        int billetes100 = cambio / billete100;
        cambio = cambio % billete100;
        int billetes50 = cambio / billete50;
        cambio = cambio % billete50;
        int billetes20 = cambio / billete20;
        cambio = cambio % billete20;
        int billetes10 = cambio / billete10;
        cambio = cambio % billete10;
        int billetes5 = cambio / billete5;
        cambio = cambio % billete5;
        int monedas2 = cambio / moneda2;
        cambio = cambio % moneda2;
        int monedas1 = cambio / moneda1;
        cambio = cambio % moneda1;


        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Monedas de 2: " + monedas2);
        System.out.println("Monedas de 1: " + monedas1);

    }
}
