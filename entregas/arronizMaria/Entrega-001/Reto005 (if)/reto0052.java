import java.util.Scanner;

class reto0052{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca en primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int segundoNumero = scanner.nextInt();
		
		if (primerNumero>segundoNumero){
			System.out.println("El mayor es " + primerNumero);
			
		} else {
			System.out.println("El mayor es " + segundoNumero);
		}
		

    }
}