import java.util.Scanner;

public class DeconstruccionDeNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero:");
		int numero1 = scanner.nextInt();
		System.out.println("Ingresa el segundo numero:");
		int numero2 = scanner.nextInt();
		System.out.println("Ingresa el tercer numero:");
		int numero3 = scanner.nextInt();
		int primerDigito;
		int segundoDigito;
		int tercerDigito;
		int numeroFinal;
		
		primerDigito = numero1 / 100;
		segundoDigito = (numero2 / 10) % 10;
		tercerDigito = numero3 % 10;
		numeroFinal = primerDigito * 100 + segundoDigito * 10 + tercerDigito;
		
		System.out.println("El numero deconstruido es el siguiente:" + numeroFinal);
	}
}