import java.util.Scanner;

public class mayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int mayor = obtenerMayor(num1, num2);

        System.out.println("El número mayor es: " + mayor);
    }

    public static int obtenerMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
