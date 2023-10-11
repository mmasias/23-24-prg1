

import java.util.Scanner;

public class Reto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner entrada = new Scanner(System.in);	    
		        		      	        
		        System.out.println("Introduce el primer número de tres cifras: ");
		        int num1 = entrada.nextInt();		       
		        
		        System.out.println("Introduce el segundo número de tres cifras: ");
		        int num2 = entrada.nextInt();		        
		        
		        System.out.println("Introduce el ultimo número de tres cifras: ");
		        int num3 = entrada.nextInt();		        
		        
		        int PrimeraPosicion = num1 / 100;
		        
		        int SegundaPosicion = (num2 / 10) % 10;
		        
		        int TerceraPosicion = num3 % 10;   
		        
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("La primera posición del primer número es: " + PrimeraPosicion);
		        
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("La segunda posición del segundo número es: " + SegundaPosicion);
		      
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("La tercera posición del último número es: " + TerceraPosicion);
		        
		        System.out.println("-------------------------------------------------------------");
		        
		        System.out.println("El número final que pide el reto es: " + PrimeraPosicion + SegundaPosicion + TerceraPosicion);
		       
		    }
	}
