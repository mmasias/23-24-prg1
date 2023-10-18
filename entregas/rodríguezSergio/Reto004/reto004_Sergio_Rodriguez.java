import java.util.Scanner;

public class reto004_Sergio_Rodriguez {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número de 3 cifras");
        int número1 = scanner.nextInt();

        System.out.println("Introduce otro número de 3 cifras");
        int número2 = scanner.nextInt();

        System.out.println("Introduce un último número de 3 cifras");
        int número3 = scanner.nextInt();

        int digito1 = número1>=100 && número1<= 999 ? número1/100 : null ;
        int digito2_1 = número2>=100 && número2<= 999 ? número2%100 : null;
        double digito2_2 = digito2_1* 0.1;
        int digito2Final = (int) digito2_2;
        int digito3 = número3>= 100 && número3 <= 999 ? número3%10 : null;

        int númeroFinal = digito1*100 + digito2Final*10 + digito3;

        System.out.println("Tu número resultante de esta deconstrucción es " + númeroFinal);
    }
}