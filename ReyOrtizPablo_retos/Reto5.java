
import java.util.Scanner;
public class Reto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		        System.out.print("Introduce el primer número: ");
		        int num1 = entrada.nextInt();

		        System.out.print("Introduce el segundo número: ");
		        int num2 = entrada.nextInt();

		        int mayor = (num1>num2)? num1 : num2;

		        System.out.println("El número mayor entre el " + num1 + " y " + num2 + " es: " + mayor);		        
	}

}