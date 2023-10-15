import java.util.Scanner;
public class RetoSinTernario05{
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Este programa compará 2 números y te dirá cual es el mayor");
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingresa el primer número a comparar: ");
        int numero1 = scanner.nextInt();
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingresa el segundo número a comparar: ");
        int numero2 = scanner.nextInt();
        System.out.println("----------------------------------------------------------");
        
        int resta = Math.abs(numero1-numero2);
        int resultado = (numero1 + numero2 + resta)/2;
        System.out.println("El numero mayor es: " + resultado); 
        
        
        scanner.close();
        
        
    }
    
    
}