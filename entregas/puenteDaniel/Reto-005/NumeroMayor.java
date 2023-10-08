import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero entero:");
        int primerNumero = sc.nextInt();

        System.out.println("Ingrese el segundo numero entero:");
        int segundoNumero = sc.nextInt();

        if (primerNumero > segundoNumero) {
            System.out.println("El numero mayor es: " + primerNumero);
        } else if (primerNumero < segundoNumero) {
            System.out.println("El numero  mayor es: " + segundoNumero);
        } else {
            System.out.println("Los numeros son iguales");
        }
        
    }    
}
