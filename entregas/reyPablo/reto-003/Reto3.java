
import java.util.Scanner;
class Reto3 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
        System.out.println("---------------------------------------");
	System.out.println("El precio debe ser menor que tu dinero ");
	System.out.println("---------------------------------------");
		
	System.out.println("Introduce el precio del objeto ");
	int precio = entrada.nextInt();
	System.out.println("Introduce tu dinero ");
        int cantidad = entrada.nextInt();
        
        int vuelta = cantidad - precio; 
        System.out.println("El precio es: " + precio + "€");
        System.out.println("Tú dinero es: " + cantidad + "€");
        System.out.println("El cambio es: " + vuelta + "€");
        int cantidad200 = vuelta / 200;
        vuelta = vuelta %200;
        
        int cantidad100 = vuelta / 100;
        vuelta = vuelta % 100;
        
        int cantidad50 = vuelta / 50;
        vuelta = vuelta % 50;

        int cantidad20 = vuelta / 20;
        vuelta = vuelta % 20;

        int cantidad10 = vuelta / 10;
        vuelta = vuelta % 10;

        int cantidad5 = vuelta / 5;
        vuelta = vuelta % 5;

        int cantidad2 = vuelta / 2;
        vuelta = vuelta % 2;

        int cantidad1 = vuelta;
        
        System.out.println(cantidad200 > 0 ? "Billetes de 200 euros: " + cantidad200 : "");
        System.out.println(cantidad100 > 0 ? "Billetes de 100 euros: " + cantidad100 : "");
        System.out.println(cantidad50 > 0 ? "Billetes de 50 euros: " + cantidad50 : "");
        System.out.println(cantidad20 > 0 ? "Billetes de 20 euros: " + cantidad20 : "");
        System.out.println(cantidad10 > 0 ? "Billetes de 10 euros: " + cantidad10 : "");
        System.out.println(cantidad5 > 0 ? "Billetes de 5 euros: " + cantidad5 : "");
        System.out.println(cantidad2 > 0 ? "Monedas de 2 euros: " + cantidad2 : "");
        System.out.println(cantidad1 > 0 ? "Monedas de 1 euros: " + cantidad1 : "");

	}

}
