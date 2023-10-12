import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa el segundo número:");
        int numero2 = sc.nextInt();
		int numeroMayor;
		
		numeroMayor = (numero1 >= numero2) ? numero1 : numero2;
		
		System.out.println("El numero mayor es:" + numeroMayor);
	}
}