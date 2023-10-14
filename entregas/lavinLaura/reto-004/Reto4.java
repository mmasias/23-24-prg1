import java.util.Scanner;


public class Reto4{
     public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);


 System.out.println("Introduzca 3 numeros de 3 digitos cada uno:");

    System.out.print("Numero 1:");
    int numero1 = scanner.nextInt();



    System.out.print("Numero 2:");
    int numero2 = scanner.nextInt();




    System.out.print(" Numero 3:");
    int numero3 = scanner.nextInt();



     int cifra1 = numero1 / 100;

     int cifra2 = ( numero2 / 10 ) % 10;

     int cifra3 = numero3 % 10;


     int resultado = cifra1 * 100 + cifra2 * 10 + cifra3;
     System.out.println(" Resultado: " +  resultado);

     scanner.close();
 


 }






}


