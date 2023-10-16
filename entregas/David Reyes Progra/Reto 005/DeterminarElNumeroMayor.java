import java.util.Scanner;

class DeterminarElNumeroMayor {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el primer numero:");
		int primerNumero = sc.nextInt();
		System.out.println ("Ingrese el segundo numero:");
		int segundoNumero = sc.nextInt();
		int numeroMayor;
		
		numeroMayor = primerNumero >= segundoNumero? primerNumero :segundoNumero;
		
		System.out.println("El numero mayor seria: " + numeroMayor);
		}
}