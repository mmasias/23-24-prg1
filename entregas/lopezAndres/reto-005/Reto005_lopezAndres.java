import java.util.Scanner;

public class Reto005_lopezAndres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba 2 numeros");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        System.out.println((numero1 > numero2) ? ("El mayor es: " + numero1 ) : ("El mayor es: " + numero2));
    }
}