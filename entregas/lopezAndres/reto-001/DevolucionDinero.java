
public class DevolucionDinero {
    public static void main(String [] args) {
		int dineroPagado = 1000;
		int dineroAPagar = 746;
		int cambio = dineroPagado - dineroAPagar;
		
		int billetes100 = (int) cambio / 100;
		cambio %= 100;
		
		int billetes50 = (int) cambio / 50;
		cambio %= 50;
		
		int billetes20 = (int) cambio / 20;
		cambio %= 20;
		
		int billetes10 = (int) cambio / 10;
		cambio %= 10;
		
		int billetes5 = (int) cambio / 5;
		cambio %= 5;
		
		int monedas2 = (int) cambio /2;
		cambio %= 2;
		
		int monedas1 = (int) cambio /1;
		
		System.out.println("Cambio a devolver:");
		System.out.println("Billetes de 100 euros: " + billetes100);
		System.out.println("Billetes de 50 euros: " + billetes50);
		System.out.println("Billetes de 20 euros: " + billetes20);
		System.out.println("Billetes de 10 euros: " + billetes10);
		System.out.println("Billetes de 5 euros: " + billetes5);
		System.out.println("Monedas de 2 euros: " + monedas2);
		System.out.println("Monedas de 1 euro: " + monedas1);
    }
} 