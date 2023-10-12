import java.util.Scanner;

public class DeconstruccionDeNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el tercer número:");
        int num3 = sc.nextInt();
	int numero1;
	int numero2;
	int numero3;
	int numeroFinal;
		
        numero1 = num1 / 100;
        numero2 = (num2 / 10) % 10;
        numero3 = num3 % 10;
        numeroFinal = numero1 * 100 + numero2 * 10 + numero3;
        
        System.out.println("El número deconstruido es el siguiente: " + numeroFinal);
    }
}
