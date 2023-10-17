import java.util.Scanner;

class DeconstruccionDeUnNumero 
{
public static void main(String[] args) 

{
        Scanner sc = new Scanner(System.in);
		System.out.println ("Ingrese el primer numero de tres digitos:");
		int primerNumero = sc.nextInt();
		System.out.println ("Ingrese el segundo numero de tres digitos:");
		int segundoNumero = sc.nextInt();
		System.out.println ("Ingrese el tercer numero de tres digitos:");
		int tercerNumero = sc.nextInt();
		
		int numero1;
		int numero2;
		int numero3;
		int numeroFinal;
		
		numero1 = (primerNumero / 100);
		numero2 = (segundoNumero / 10) %10;
		numero3 = (tercerNumero) % 10;
		numeroFinal = (numero1 * 100) + numero2 * 10 + numero3;
		
		System.out.println ("El numero desconstruido seria: " + numeroFinal);
		}
}