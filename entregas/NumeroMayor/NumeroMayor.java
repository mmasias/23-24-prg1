import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println(" ");
        System.out.println("-----------------------------");       
        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

        System.out.println(num1 > num2 ? "El mayor es el Primer numero : " + num1 : "");
        System.out.println(num2 > num1 ? "El mayor es el Segundo numero : " + num2 : "");
    }
    
}
