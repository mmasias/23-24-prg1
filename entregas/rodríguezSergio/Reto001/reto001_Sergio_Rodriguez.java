public class reto001_Sergio_Rodriguez {
    public static void main(String[] args) {

        int coste = 87;
        int miDinero = 250;
        int vuelta = miDinero - coste; 
        System.out.println("La vuelta será: " + vuelta+ " euros");
        System.out.println("Ha entregado: " + vuelta + " euros" );

        int Billete_100 = vuelta / 100;
        vuelta = vuelta % 100;

        int Billete_50 = vuelta / 50;
        vuelta = vuelta % 50;

        int Billete_20 = vuelta / 20;
        vuelta = vuelta % 20;

        int Billete_10 = vuelta / 10;
        vuelta = vuelta % 10;

        int Billete_5 = vuelta / 5;
        vuelta = vuelta % 5;

        int Moneda_2 = vuelta / 2;
        vuelta = vuelta % 2;

        int Moneda_1 = vuelta / 1;
        
        System.out.println("Debe pagar: " + coste + " euros");

        System.out.println("Billete(s) de 100: " + Billete_100);
        System.out.println("Billete(s) de 50: " + Billete_50);
        System.out.println("Billete(s) de 20: " + Billete_20);
        System.out.println("Billete(s) de 10: " + Billete_10);
        System.out.println("Billete(s) de 5: " + Billete_5);
        System.out.println("Moneda(s) de 2: " + Moneda_2);
        System.out.println("Moneda(s) de 1: " + Moneda_1);

    }
}