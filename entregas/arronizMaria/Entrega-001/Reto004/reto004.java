import java.util.Scanner;

public class reto004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("(Todos los números a introducir deben de ser de tres dígitos)");
		System.out.println("-------------------------------------------------------------");

		System.out.print("Introduzca el primer número: ");
        int primerNumero = scanner.nextInt();
		
		int centenas = (primerNumero / 100);
		
		
		System.out.print("Introduzca el segundo número: ");
        int segundoNumero = scanner.nextInt();
		
		int decenas = (segundoNumero / 10) %10;
		
		System.out.print("Introduzca el tercer número: ");
        int tercerNumero = scanner.nextInt();
		
		int unidades = (tercerNumero) %10;
		
		System.out.println("--------------------------");
		System.out.println("El número obtenido es: " +centenas+decenas+unidades);
		
		
		
		
    }
}