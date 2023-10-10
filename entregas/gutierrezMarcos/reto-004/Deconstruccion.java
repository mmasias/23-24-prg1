import java.util.Scanner;

public class decostruccion{
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        System.out.println("Introduce un 1er numero de 3 digitos");
        int num1 = num.nextInt();
        while(num1<100 || num1>999){
            System.out.println("Introduce un 1er numero de 3 digitos");
            num1 = num.nextInt();
        }
        System.out.println("Introduce un 2º numero de 3 digitos");
        int num2 = num.nextInt();
        while(num2<100 || num2>999){
            System.out.println("Introduce un 2º numero de 3 digitos");
            num2 = num.nextInt();
        }
        System.out.println("Introduce un 3er numero de 3 digitos");
        int num3 = num.nextInt();
        while(num3<100 || num3>999){
            System.out.println("Introduce un 3er numero de 3 digitos");
            num3 = num.nextInt();
        }

        int numFinal;

        numFinal = num1/100;

        System.out.println(numFinal);


    }
}
