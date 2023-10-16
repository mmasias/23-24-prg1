import java.util.Scanner;
public class Reto4{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		System.out.println("Primer número");
		int numero1 = entrada.nextInt();
		System.out.println("Segundo número");
		int numero2 = entrada.nextInt();
		System.out.println("Tercer número");
		int numero3 = entrada.nextInt();

		int primeraCifra = numero1 / 100;
		int segundaCifra = (numero2 / 10) % 10;
		int terceraCifra = numero3 % 10;
		        
		int nuevoNumero = (primeraCifra * 100) + (segundaCifra * 10) + terceraCifra;

		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);
		System.out.println("Número 3: " + numero3);
		System.out.println("Nuevo número: " + nuevoNumero);
	}
 }

