import java.util.Scanner;

class DeconstruccionDeUnNumero {
	
	public static void main(String[] args) {
		final String LINEA = ("---------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer número (del cual se tomará la primera cifra(centenas))");
		int primerNumero = scanner.nextInt();
		System.out.println(LINEA);
		
		System.out.println("Ingrese el segundo número (del cual se tomará la segunda cifra(decenas))");
		int segundoNumero = scanner.nextInt();
		System.out.println(LINEA);
		
		System.out.println("Ingrese el tercer número (del cual se tomará la tercera cifra(unidades))");
		int tercerNumero = scanner.nextInt();
		System.out.println(LINEA);
		
		int centenas = primerNumero / 100;
		int decenas = (segundoNumero / 10) % 10;
		int unidades = tercerNumero % 10;
		
		System.out.println("La primera cifra del primer número es " + centenas);
		System.out.println(LINEA);
		System.out.println("La segunda cifra del segunda número es " + decenas);
		System.out.println(LINEA);
		System.out.println("La tercera cifra del tercer número es " + unidades);
		System.out.println(LINEA);
		
		int numeroReconstruido = (centenas * 100) + (decenas * 10) + unidades;
		System.out.println("Al reconstruir el número nos da: " + numeroReconstruido);
		System.out.println(LINEA);
		
		scanner.close();
	}
}