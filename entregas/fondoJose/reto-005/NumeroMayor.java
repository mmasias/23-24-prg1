import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero:");
		int numero1 = scanner.nextInt();
		System.out.println("Ingresa el segundo numero:");
		int numero2 = scanner.nextInt();
		int numeroMayor;
		
		numeroMayor = (numero1 >= numero2) ? numero1 : numero2;
		
		System.out.println("El numero mayor es:" + numeroMayor);
	}
}