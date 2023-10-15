import java.util.Scanner;

class MenorOMayor {
	
	public static void main(String[] args) {
		final String LINEA = ("---------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número");
		double primerNumero = scanner.nextDouble();
		System.out.println(LINEA);
		
		System.out.println("Ingrese el segundo número");
		double segundoNumero = scanner.nextDouble();
		System.out.println(LINEA);
		
		double diferencia = Math.abs(primerNumero-segundoNumero);
		
		double calculoParaNumeroMayor = (primerNumero + segundoNumero + diferencia)/2;
		
		System.out.println("El número mayor es " + calculoParaNumeroMayor);
		
		scanner.close();
	}
}