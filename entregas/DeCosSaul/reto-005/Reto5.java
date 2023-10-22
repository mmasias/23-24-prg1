import java.util.Scanner;
class Reto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println();
        System.out.println("El mayor es " + (num1>num2 ? num1 : + num2));
}
}