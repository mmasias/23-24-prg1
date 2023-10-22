public class    Reto01{
    public static void main(String[] args) {
        int precio = 169;
        int pago = 200;  

       
        int cambio = pago - precio;

        
        int billetes100 = cambio / 100;
        cambio = cambio % 100;

        int billetes50 = cambio / 50;
        cambio = cambio % 50;

        int billetes20 = cambio / 20;
        cambio = cambio % 20;

        int billetes10 = cambio / 10;
        cambio = cambio % 10;

        int billetes5 = cambio / 5;
        cambio = cambio % 5;

        int billetes2 = cambio / 2;
        cambio = cambio % 2;

        int monedas1 = cambio;

        
        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Billetes de 2: " + billetes2);
        System.out.println("Monedas de 1: " + monedas1);
    }
}