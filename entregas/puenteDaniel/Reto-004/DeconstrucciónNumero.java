import java.util.Scanner;

public class DeconstrucciónNumero {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero de 3 cifras:");
        int primerNumero = sc.nextInt();

        System.out.println("Ingrese un segundo número entero de 3 cifras:");
        int segundoNumero = sc.nextInt();

        System.out.println("Ingrese un tercer número entero de 3 cifras:");
        int tercerNumero = sc.nextInt();

        int cifra1 = primerNumero / 100;
        int cifra2 = segundoNumero / 10 % 10;
        int cifra3 = tercerNumero % 10;

        int numeroGenerado = cifra1 * 100 + cifra2 * 10 + cifra3;
        
        System.out.println("El número generado es: " + numeroGenerado);
    }
}
