import java.util.Scanner;

public class DeConstruccion {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero de tres cifras: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo nnumero de tres cifras:  ");
        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer numero de tres cifras: ");
        int num3 = sc.nextInt();

        int cifra1 = num1 / 100;
        int cifra2 = (num2 / 10) % 10;
        int cifra3 = num3 % 10;
        
        int numero = cifra1 * 100 + cifra2 * 10 + cifra3; 

        System.out.println("Primer numero: " + num1);
        System.out.println("Segundo numero: " + num2);
        System.out.println("Tercer numero: " + num3);
        System.out.println("NUMERO: " + numero);
    }
}
