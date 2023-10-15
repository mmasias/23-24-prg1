import java.util.Scanner;

public class Reto004_lopezAndres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int digito1;
        int digito2;
        int digito3;
        int deconstruirNum;
        System.out.println("Escriba 3 numeros de 3 digitos:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();

        System.out.println("Primer numero: " + numero1);
        System.out.println("Segundo numero: " + numero2);
        System.out.println("Tercer numero: " + numero3);

        digito1 = numero1 / 100;
        digito2 = (numero2 / 10) % 10;
        digito3 = numero3 % 10;
        deconstruirNum = digito1 * 100 + digito2 * 10 + digito3;

        System.out.print("NUMERO: "+ deconstruirNum);

    }
}