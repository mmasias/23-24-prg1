import java.util.Scanner;

class Reto4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un primer numero de 3 cifras");
        int num1 = scanner.nextInt();

        System.out.println("Introduce un segundo numero de 3 cifras");
        int num2 = scanner.nextInt();

        System.out.println("Introduce un tercer numero de 3 cifras");
        int num3 = scanner.nextInt();

        int digito1 = num1>=100 && num1<= 999 ? num1/100 : null ;
        int digito2_1 = num2>=100 && num2<= 999 ? num2%100 : null;
        double digito2_2 = digito2_1* 0.1;
        int digito2Final = (int) digito2_2;
        int digito3 = num3>= 100 && num3 <= 999 ? num3%10 : null;

        int numeroFinal = digito1*100 + digito2Final*10 + digito3;

        System.out.println("Tu número es " + numeroFinal);
    }

}
