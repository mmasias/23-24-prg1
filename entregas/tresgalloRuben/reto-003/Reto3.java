import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
         
         System.out.print("Ingrese el dinero a pagar: ");
        int dineroAPagar = scanner.nextInt();
         System.out.print("Ingrese el dinero que has pagado: ");
        int dineroPagado = scanner.nextInt();
        int cambio = dineroPagado - dineroAPagar;
        int billetes100 =  cambio / 100;
        cambio %= 100;
        
        int billetes50 = cambio / 50;
        cambio %= 50;
        
        int billetes20 =  cambio / 20;
        cambio %= 20;
        
        int billetes10 =  cambio / 10;
        cambio %= 10;
        
        int billetes5 =  cambio / 5;
        cambio %= 5;
        
        int monedas2 =  cambio / 2;
        cambio %= 2;
        
        int monedas1 =  cambio;
        
        System.out.println("Cambio a devolver:");
        System.out.println(billetes100 > 0 ? "Billetes de 50 euros: " + billetes100 : "");
        System.out.println(billetes50 > 0 ? "Billetes de 50 euros: " + billetes50 : "");
        System.out.println(billetes20 > 0 ? "Billetes de 20 euros: " + billetes20 : "");
        System.out.println(billetes10 > 0 ? "Billetes de 10 euros: " + billetes10 : "");
        System.out.println(billetes5 > 0 ? "Billetes de 5 euros: " + billetes5 : "");
        System.out.println(monedas2 > 0 ? "Monedas de 2 euros: " + monedas2 : "");
        System.out.println(monedas1 > 0 ? "Monedas de 1 euro: " + monedas1 : "");
    }
}