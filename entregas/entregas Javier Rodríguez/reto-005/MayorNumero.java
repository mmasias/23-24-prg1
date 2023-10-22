import java.util.Scanner;
public class MayorNumero{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

	        System.out.print("Primer número: ");
	        int numero1 = entrada.nextInt();

	        System.out.print("Segundo número: ");
	        int numero2 = entrada.nextInt();

	        int mayor = (numero1 > numero2) ? numero1 : numero2;

	        System.out.println("El mayor número es: " + mayor);
	 }
}

