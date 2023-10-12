import java.util.Scanner;

class Deconstruccion{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nInserte la primera cifra de tres digitos: ");
        int numberOne = scanner.nextInt();

        System.out.println("\nInserte la segunda cifra de tres digitos: ");
        int numberTwo = scanner.nextInt();
        System.out.println("\nInserte la tercera cifra de tres digitos: ");
        int numberThree = scanner.nextInt();

        final int aboveThreeDigits = 1000;
        int digitOne = numberOne / 100;
        int residueNumberTwo = numberTwo % 100;
        int digitTwo = residueNumberTwo / 10;
        int digitThree = numberThree % 10;
        int finalNumber = digitOne * 100 + digitTwo * 10 + digitThree;

        boolean errorNumberOne = numberOne >= aboveThreeDigits ? true : false;
        boolean errorNumberTwo = numberTwo >= aboveThreeDigits ? true : false;
        boolean errorNumberThree = numberThree >= aboveThreeDigits ? true : false;
    
        System.out.println(errorNumberOne == true ? "\nError: El numero " + numberOne + " es mayor de tres cifras" : "");
        System.out.println(errorNumberTwo == true ? "\nError: El numero " + numberTwo + " es mayor de tres cifras" : "");
        System.out.println(errorNumberThree == true ? "\nError: El numero " + numberThree + " es mayor de tres cifras" : "");

        System.out.println(errorNumberOne == true ? "" : errorNumberTwo == true ? "" : errorNumberThree == true ? "" : "Numero: " + finalNumber + "\n");
        
    }
}
