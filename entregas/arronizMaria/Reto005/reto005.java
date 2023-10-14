import java.util.Scanner;

class reto005{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca en primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int segundoNumero = scanner.nextInt();
		
		String resultado = (primerNumero>segundoNumero ? "El mayor es " + primerNumero + "\n" :
							"El mayor es " + segundoNumero);
		System.out.println(resultado);
		

    }
}