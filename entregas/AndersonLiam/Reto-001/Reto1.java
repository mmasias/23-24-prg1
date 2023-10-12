public class Reto1 {
    public static void main(String[] args) {

        int coste = 120;
        int miDinero = 160;
        int vuelta = miDinero - coste; 
        System.out.println("La vuelta será: " + vuelta);

        int billete100 = vuelta / 100;
        vuelta = vuelta % 100;

        int billete50 = vuelta / 50;
        vuelta = vuelta % 50;

        int billete20 = vuelta / 20;
        vuelta = vuelta % 20;

        int billete10 = vuelta / 10;
        vuelta = vuelta % 10;

        int moneda2 = vuelta / 2;
        vuelta = vuelta % 2;

        int moneda1 = vuelta / 1;
        
        System.out.println(billete100 + " Billetes de 100");

        System.out.println(billete50 + " Billetes de 50");

        System.out.println(billete20 + " Billetes de 20");
        
        System.out.println(billete10 + " Billetes de 10");

         System.out.println(moneda1 + " Moneda de 1");

         System.out.println(moneda2 + " Moneda de 2");
    }
}