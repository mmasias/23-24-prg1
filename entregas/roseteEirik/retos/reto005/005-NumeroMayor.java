import java.util.Scanner;

class NumeroMayor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nIngrese el primer numero: ");
        int numberOne = scanner.nextInt();
        System.out.println("\nIngrese el segundo numero: ");
        int numberTwo = scanner.nextInt();

        System.out.println("\nEl numero mayor es:");
        System.out.println(numberOne > numberTwo ? numberOne : numberTwo);
        
    }
}