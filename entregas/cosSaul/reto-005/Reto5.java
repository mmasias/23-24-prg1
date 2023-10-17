import java.util.Scanner;
class Reto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer número: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Segundo número: ");
        int secondNumber = scanner.nextInt();

        System.out.println();
        System.out.println("El mayor es " + (firstNumber > secondNumber ? firstNumber : +secondNumber));
    }
}