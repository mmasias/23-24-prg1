import java.util.Scanner;

public class Reto004_romeroAngel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número de 3 digitos:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un segundo número de 3 digitos:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese un tercer número de 3 digitos:");
        int num3 = scanner.nextInt();
        
        int dig1;
        int dig2;
        int dig3;
        int deconNum;

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Número 3: " + num3);

        dig1 = num1/100;
        dig2 = (num2/10)%10;
        dig3 = num3%10;

        deconNum = dig1*100 + dig2*10 + dig3;

        System.out.print(deconNum);

    }
}