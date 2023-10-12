
import java.util.Scanner;
class NumeroMayor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Ingrese el número 1: ");
        int valor1= s.nextInt();

        System.out.println("Ingrese el número 2: ");
        int valor2= s.nextInt();

        int mayor= valor1>valor2 ? valor1:valor2;

        System.out.println("El número mayor es: " + mayor);

    }
}
