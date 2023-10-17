import java.util.Scanner;
public class Reto003 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
int billete100 = 100;
int billete50 = 50;
int billete20 = 20;
int billete10 = 10;
int billete5 = 5;
int moneda2 = 2;
int moneda1 = 1;

System.out.println("Dime, ¿Cuánto cuesta el producto?");
int precioVenta = scanner.nextInt();

System.out.println("¿Cuántos euros me das?");
int precioEntrega = scanner.nextInt();


int cambio = precioEntrega - precioVenta;


System.out.println(" Debe pagar " + precioVenta + " euros ");
System.out.println (" Ha entregado " + precioEntrega + " euros ");
System.out.println( "------------------------------------------------");



int cambioBilletes100 = cambio / billete100; 
cambio = cambio % 100;
System.out.println(cambioBilletes100 > 0 ? cambioBilletes100 + " billetes de 100 euros " : "");

int cambioBilletes50 = cambio / billete50;
cambio = cambio % 50; 
System.out.println(cambioBilletes50 > 0 ? cambioBilletes50 + " billetes de 50 euros " : "");

int cambioBilletes20 = cambio / billete20; 
cambio = cambio % 20;
System.out.println(cambioBilletes20 > 0 ? cambioBilletes20 + " billetes de 20 euros " : "");

int cambioBilletes10 = cambio / billete10; 
cambio = cambio % 10;
System.out.println(cambioBilletes10 > 0 ? cambioBilletes10 + " billetes de 10 euros " : "");

int cambioBilletes5 = cambio / billete5; 
cambio = cambio % 5;
System.out.println(cambioBilletes5 > 0 ? cambioBilletes5 + " billetes de 5 euros " : "");

int cambioMonedas2 = cambio / moneda2; 
cambio = cambio % 2;
System.out.println(cambioMonedas2 > 0 ? cambioMonedas2 + " monedas de 2 euros " : "");

int cambioMonedas1 = cambio / moneda1; 
System.out.println(cambioMonedas1 > 0 ? cambioMonedas1 + " monedas de 1 euro " : "");
scanner.close();
    }
} 


