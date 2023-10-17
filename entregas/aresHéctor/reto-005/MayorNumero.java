import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();


        int mayor = (numero1 > numero2) ? numero1 : numero2;

       
        System.out.println("El número mayor es: " + mayor);
    }
}