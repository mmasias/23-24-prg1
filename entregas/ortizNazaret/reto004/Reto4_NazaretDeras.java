import java.util.Scanner;

class Reto4_NazaretDeras {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros enteros de 3 cifras:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int centenas = number1 / 100;
        int decenas = (number2 / 10) % 10;
        int unidades = number3 % 10;

        System.out.println ("The number is: " + centenas + decenas + unidades);
        scanner.close();

    }
}