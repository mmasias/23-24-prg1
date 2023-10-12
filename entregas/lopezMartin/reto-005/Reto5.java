import java.util.Scanner;

class Reto5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce un segundo entero: ");
        int numero2 = sc.nextInt();

        String mayorMenor = numero1 > numero2 ? "El mayor es " + numero1 : "El mayor es " + numero2;

        System.out.println(mayorMenor);

    }

}
