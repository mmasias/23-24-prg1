import java.util.Scanner;;

public class reto5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce un segundo entero: ");
        int num2 = sc.nextInt();

        String mayor_menor = num1 > num2 ? "El mayor es " + num1 : "El mayor es " + num2;

        System.out.println(mayor_menor);

    }
    
}
