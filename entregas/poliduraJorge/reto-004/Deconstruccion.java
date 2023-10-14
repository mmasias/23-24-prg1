import java.util.Scanner;

public class Reto004 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Por favor,introduce un numero de 3 cifras:");
        int num1=sc.nextInt();
        System.out.println("Por favor,introduce otro numero de 3 cifras:");
        int num2=sc.nextInt();
        System.out.println("Por favor,introduce un ultimo numero de 3 cifras:");
        int num3=sc.nextInt();

        int cifra1=num1>=100 && num1<=999 ? num1/100 : null;

        int cifra2=num2>=100 && num2<=999 ? num2%100 : null;
        double cifra2_1=cifra2*0.1;
        int i=(int)cifra2_1;

        int cifra3=num3>=100 && num3<=999 ? num3%10 : null;

        int num_final=cifra1*100+i*10+cifra3;

        System.out.println("\n" + num_final);

    }
}

