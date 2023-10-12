public class DevolverCambio {
    public static void main(String[] args) {

        int price = 232;
        int givenMoney  = 400;

        int change = givenMoney  - price;

        int oneHundredBill = change / 100;
        change %= 100;

        int fifBill = change / 50;
        change %= 50;

        int twtBill = change / 20;
        change %= 20;

        int tenBill = change / 10;
        change %= 10;

        int fiveBill = change / 5;
        change %= 5;

        int twoCoin = change / 2;
        change %= 2;

        int oneCoin = change / 1;
        change %= 1;

        System.out.println("Debe pagar :" + price);
        System.out.println("Ha entregado :" + givenMoney );

        System.out.println(oneHundredBill + " billete(s) de 100€ ");
        System.out.println(fifBill + " billete(s) de 50€ ");
        System.out.println(twtBill + " billete(s) de 20€ ");
        System.out.println(tenBill + " billete(s) de 10€: ");
        System.out.println(fiveBill + " billete(s) de 5€: " );
        System.out.println(twoCoin + " moneda(s) de 2€: ");
        System.out.println(oneCoin + " moneda(s) de 1€: ");

    }
}
