

import java.util.Scanner;

public class Reto4 {

	public static void main(String[] args) {
		        Scanner entrada = new Scanner(System.in);	    
		        		      	        
		        System.out.println("Introduce el primer número de tres cifras: ");
		        int num1 = entrada.nextInt();		       
		        
		        System.out.println("Introduce el segundo número de tres cifras: ");
		        int num2 = entrada.nextInt();		        
		        
		        System.out.println("Introduce el ultimo número de tres cifras: ");
		        int num3 = entrada.nextInt();		        
		        
		        int primeraPosicion = num1 / 100;
		        
		        int segundaPosicion = (num2 / 10) % 10;
		        
		        int terceraPosicion = num3 % 10;   
		        
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("La primera posición del primer número es: " + primeraPosicion);
		        
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("La segunda posición del segundo número es: " + segundaPosicion);
		      
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("La tercera posición del último número es: " + terceraPosicion);
		        
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("El número final que pide el reto es: " + primeraPosicion + segundaPosicion + terceraPosicion);
		       
		    }
	}
