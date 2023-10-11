import java.util.Scanner;

public class Reto4 {

 public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número de tres cifras: ");
        int numero1 = scanner.nextInt();

       
        System.out.print("Ingrese el segundo número de tres cifras: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el segundo número de tres cifras: ");
        int numero3 = scanner.nextInt();

        int primeraCifra = numero1 / 100;
        int segundaCifra = (numero2 / 10) % 10;
        int terceraCifra = numero3 % 10;



        System.out.println( "Tu nuevo numero es " + primeraCifra + segundaCifra + terceraCifra);
 }

}
 
 