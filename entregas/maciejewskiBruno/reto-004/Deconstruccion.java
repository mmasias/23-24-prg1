import java.util.Scanner;

class Deconstruccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero");
        int primerNumero = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        int segundoNumero = scanner.nextInt();
        System.out.println("Escribe el tercer número");
        int tercerNumero = scanner.nextInt();

        primerNumero -= primerNumero % 100;
        segundoNumero = segundoNumero % 100;
        segundoNumero -= segundoNumero % 10;
        tercerNumero = tercerNumero % 100;
        tercerNumero = tercerNumero % 10;

        System.out.println("El resultado es: " + (primerNumero + segundoNumero + tercerNumero));
        scanner.close();
    }
}