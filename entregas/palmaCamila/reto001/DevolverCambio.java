class DevolverCambio {
    public static void main(String[] args) {

        int price = 232;
        int receivedMoney  = 400;

        int change = givenMoney  - price;

        int numberOfHundredDollarBill = change / 100;
        change %= 100;

        int numberOfFiftyDollarBill = change / 50;
        change %= 50;

        int numberOfTwentyDollarBill = change / 20;
        change %= 20;

        int numberOfTenDollarDollarBill = change / 10;
        change %= 10;

        int numberOfFiveDollarBill = change / 5;
        change %= 5;

        int numberOfTwoCoin = change / 2;
        change %= 2;

        int numberOfOneCoin = change / 1;
        change %= 1;

        System.out.println("Debe pagar :" + price);
        System.out.println("Ha entregado :" + givenMoney );

        System.out.println(numberOfHundredDollarBill + " billete(s) de 100€ ");
        System.out.println(numberOfFiftyDollarBill + " billete(s) de 50€ ");
        System.out.println(numberOfTwentyDollarBill + " billete(s) de 20€ ");
        System.out.println(numberOfTenDollarDollarBill + " billete(s) de 10€: ");
        System.out.println(numberOfFiveDollarBill + " billete(s) de 5€: " );
        System.out.println(numberOfTwoCoin + " moneda(s) de 2€: ");
        System.out.println(numberOfOneCoin + " moneda(s) de 1€: ");

    }
}
