import java.util.Scanner;
class Reto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer número: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Segundo número: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Tercer número: ");
        int thirdNumber = scanner.nextInt();
        
        System.out.println();
        System.out.print("NUMERO " + firstNumber/100);
        System.out.print((secondNumber-((secondNumber/100)*100))/10);
        System.out.print(thirdNumber%10);
    }
}