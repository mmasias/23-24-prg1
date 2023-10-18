import java.util.Scanner;

public class reto005_Sergio_Rodriguez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un primer número:");
        int número1 = scanner.nextInt();

        System.out.println("Ahora introduce otro número diferente:");
        int número2 = scanner.nextInt();

        int high = número1 >= número2 ? número1 : número2;
        System.out.println("El número más alto de esos dos es el " + high);

        scanner.close();
    }
}