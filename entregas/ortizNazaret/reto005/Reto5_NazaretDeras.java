import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int num1 = myscanner.nextInt();

		System.out.println("Introduce el segundo numero: ");
		int num2 = myscanner.nextInt();

		int numeroMayor = num1 > num2 ? num1 : num2;

		System.out.println("El numero mayo es: " + numeroMayor);

	}
}