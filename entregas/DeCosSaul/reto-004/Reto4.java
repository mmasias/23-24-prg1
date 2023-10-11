import java.util.Scanner;
class Reto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Tercer número: ");
        int num3 = scanner.nextInt();
        
        System.out.println();
        System.out.print("NUMERO " + num1/100);
        System.out.print((num2-((num2/100)*100))/10);
        System.out.print(num3%10);
    }
}