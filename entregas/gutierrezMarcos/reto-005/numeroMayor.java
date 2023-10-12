import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número entero: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int segundoNumero = scanner.nextInt();


        int mayor = (primerNumero > segundoNumero) ? primerNumero : segundoNumero;

       
        System.out.println("El número mayor es: " + mayor);
    }
}
