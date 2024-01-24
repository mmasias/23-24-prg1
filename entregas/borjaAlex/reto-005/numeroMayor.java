import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int num1 = myScanner.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		int num2 = myScanner.nextInt();

		int numeroMayor = num1 > num2 ? num1 : num2;

		System.out.println("El numero mayor es: " + numeroMayor);

	}
}
