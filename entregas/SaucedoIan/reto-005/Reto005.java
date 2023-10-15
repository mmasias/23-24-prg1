import java.util.Scanner;

class Reto05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el Numero A");
		int NumeroA = scanner.nextInt();
		System.out.println("========================================================");

		System.out.println("Ingrese el Numero B");
		int NumeroB = scanner.nextInt();
		System.out.println("========================================================");

		int Diferencia = Math.abs(NumeroA - NumeroB);

		int NumeroMayor = (NumeroA + NumeroB + Diferencia) / 2;

		System.out.println("El Nmero mayor es " + NumeroMayor);

		scanner.close();
	}
}