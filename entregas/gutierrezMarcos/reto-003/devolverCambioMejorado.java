import java.util.Scanner;

public class cambio {
    private static Scanner money;

    public static void main(String[] arg) {
        money = new Scanner(System.in);

        System.out.println("Cuantos euros debe?");
        int rMoney = money.nextInt();

        System.out.println("Cuantos euros entrega?");
        int eMoney = money.nextInt();


        int cambio = eMoney - rMoney;

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

        int billetesDe2 = cambio / 2;
        cambio %= 2;

        int billetesDe1 = cambio;

        System.out.println("Deberías recibir:");
        boolean resultado = billetesDe100 ? billetesDe100>0 : billetesDe100<0;
        System.out.println(resultado);
        System.out.println(billetesDe100+" billetes de 100€");
        System.out.println(billetesDe50+" billetes de 50€");
        System.out.println(billetesDe20+" billetes de 20€");
        System.out.println(billetesDe10+" billetes de 10€");
        System.out.println(billetesDe5+" billetes de 5€");
        System.out.println(billetesDe2+" billetes de 2€");
        System.out.println(billetesDe1+" billetes de 1€");
    }
}
