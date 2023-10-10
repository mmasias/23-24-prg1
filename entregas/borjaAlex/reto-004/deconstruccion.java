import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);

		System.out.println("Introduce un numero de tres digitos: ");
		int num1 = myscanner.nextInt();

		System.out.println("Introduce otro numero de tres digitos: ");
		int num2 = myscanner.nextInt();

		System.out.println("Introduce otro numero de tres digitos: ");
		int num3 = myscanner.nextInt();
		
		int firstDigit = num1 / 100;
		int secondDigit = (num2 % 100) / 10;
		int thirdDigit= num3 % 10;

		String result = "" + firstDigit + secondDigit + thirdDigit;

		System.out.println("NUMERO: " + result);
	}
}
