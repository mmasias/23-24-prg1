import java.util.Scanner;

class Reto4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un primer numero de 3 cifras");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce un segundo numero de 3 cifras");
        int numero2 = scanner.nextInt();

        System.out.println("Introduce un tercer numero de 3 cifras");
        int numero3 = scanner.nextInt();

        int digito1 = numero1>=100 && numero1<= 999 ? numero1/100 : null ;
        int digito2_1 = numero2>=100 && numero2<= 999 ? numero2%100 : null;
        double digito2_2 = digito2_1* 0.1;
        int digito2Final = (int) digito2_2;
        int digito3 = numero3>= 100 && numero3 <= 999 ? numero3%10 : null;

        int numeroFinal = digito1*100 + digito2Final*10 + digito3;

        System.out.println("Tu número es " + numeroFinal);
    }

}
