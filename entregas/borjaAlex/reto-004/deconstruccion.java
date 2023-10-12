import java.util.Scanner;

public class Deconstruccion {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Introduce un numero de tres digitos: ");
		int num1 = myScanner.nextInt();

		System.out.println("Introduce otro numero de tres digitos: ");
		int num2 = myScanner.nextInt();

		System.out.println("Introduce otro numero de tres digitos: ");
		int num3 = myScanner.nextInt();
		
		int firstDigit = num1 / 100;
		int secondDigit = (num2 % 100) / 10;
		int thirdDigit= num3 % 10;

		String result = "" + firstDigit + secondDigit + thirdDigit;

		System.out.println("NUMERO: " + result);
	}
}
