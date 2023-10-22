import java.util.Scanner;

class Reto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Escribe el segundo numero");
        int numero2 = scanner.nextInt();

         String resultado = numero1 > numero2 ? numero1 + " es mayor que " + numero2
                : numero2 + " es mayor que " + numero1;

        System.out.println(resultado);
        
    }
}