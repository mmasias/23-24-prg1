import java.util.Scanner; 

    public class Reto5 {

    public static void main (String[]args ){


        Scanner scanner = new Scanner (System.in);

        System.out.println(" Introducir el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println(" Introducir el segundo numero: ");
        int num2 = scanner.nextInt(); 

        int high = num1 >= num2? num1 :num2; 

        System.out.println(" El numero mas alto es el: " + high);

        scanner.close(); 


    }
   

    }