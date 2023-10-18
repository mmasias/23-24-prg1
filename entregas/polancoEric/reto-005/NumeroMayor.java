import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
	    System.out.print("Primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Segundo numero: ");
        int numero2 = entrada.nextInt();
		
		int mayor= (numero1>numero2) ? numero1 : numero2;
		
		System.out.println("El mayor es " + mayor);
		
		entrada.close();
    }
}
