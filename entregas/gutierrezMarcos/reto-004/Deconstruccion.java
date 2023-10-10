import java.util.Scanner;

public class decostruccion{
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        System.out.println("Introduce un 1er numero de 3 digitos");
        int num1 = num.nextInt();

        System.out.println("Introduce un 2º numero de 3 digitos");
        int num2 = num.nextInt();

        System.out.println("Introduce un 3er numero de 3 digitos");
        int num3 = num.nextInt();


        int numFinal;

        numFinal = num1/100;

        System.out.println(numFinal);


    }
}
