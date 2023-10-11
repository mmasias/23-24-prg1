import java.util.Scanner;

public class reto4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un primer numero de 3 cifras");
        int num1 = sc.nextInt();

        System.out.println("Introduce un segundo numero de 3 cifras");
        int num2 = sc.nextInt();

        System.out.println("Introduce un tercer numero de 3 cifras");
        int num3 = sc.nextInt();

        int digito1 = num1>=100 && num1<= 999 ? num1/100 : null ;
        int digito2_1 = num2>=100 && num2<= 999 ? num2%100 : null;
        double digito2_2 = digito2_1* 0.1;
        int digito2_final = (int) digito2_2;
        int digito3 = num3>= 100 && num3 <= 999 ? num3%10 : null;
        
        int numero_final = digito1*100 + digito2_final*10 + digito3;

        System.out.println("Tu número es " + numero_final);
    }
    
}
