import java.util.Scanner;

public class cambio {
    private static Scanner money;

    public static void main(String[] arg) {
        money = new Scanner(System.in);

        System.out.println("Cuanto quieres entregar?");
        int rMoney = money.nextInt();

        System.out.println("Debe pagar 232 euros");
        System.out.println("Ha entregado " + rMoney + " euros");
        System.out.println("---------------------------------------");

        int cambio = rMoney - 232;

        int billetesDe100 = cambio / 100;
        cambio %= 100;

        int billetesDe50 = cambio / 50;
        cambio %= 50;

        int billetesDe20 = cambio / 20;
        cambio %= 20;

        int billetesDe10 = cambio / 10;
        cambio %= 10;

        int billetesDe5 = cambio / 5;
        cambio %= 5;

        int monedasDe2 = cambio / 2;
        cambio %= 2;

        int monedasDe1 = cambio;

        System.out.println("Billetes de 100: " + billetesDe100);
        System.out.println("Billetes de 50: " + billetesDe50);
        System.out.println("Billetes de 20: " + billetesDe20);
        System.out.println("Billetes de 10: " + billetesDe10);
        System.out.println("Billetes de 5: " + billetesDe5);
        System.out.println("Monedas de 2: " + monedasDe2);
        System.out.println("Monedas de 1: " + monedasDe1);
    }
}
