import java.util.Scanner;

public class Desconstruccion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce un segundo número:");
        int num2 = scanner.nextInt();

        int high = num1 >= num2 ? num1 : num2;
        System.out.println("El número mayor es: " + high);

        scanner.close();
    }
}
