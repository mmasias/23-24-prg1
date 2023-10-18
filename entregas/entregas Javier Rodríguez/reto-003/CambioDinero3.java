import java.util.Scanner;
public class Reto3{

	public static void main(String[] args){

		Scanner entrada=new Scanner (System.in);
		System.out.println("CAJA REGISTRADORA 2");
		System.out.println("¿Cuanto es el coste?");
		int coste = entrada.nextInt();
		System.out.println("¿Cuanto es el dinero que tienes?");
		int dinero = entrada.nextInt();
		int cambio = dinero - coste;
		
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
		
		int moneda1 = cambio / 1;
		
		cambio = dinero - coste;
		
		System.out.println("El producto cuesta " + coste + " euros");
		System.out.println("Pagas con " + dinero + " euros");
		System.out.println("La vuelta es de " + cambio + " euros");
		System.out.println("Te devuelven");
		System.out.println(billete50 > 0 ? "billetes de 50: " + billete50 : "");
		System.out.println(billete20 > 0 ? "billetes de 20: " + billete20 : "");
		System.out.println(billete10 > 0 ? "billetes de 10: " + billete10 : "");
		System.out.println(billete5 > 0 ? "billetes de 5: " + billete5 : "");
		System.out.println(moneda2 > 0 ? "monedas de 2: " + moneda2 : "");
		System.out.println(moneda1 > 0 ? "monedas de 1: " + moneda1 : "");
	}

}