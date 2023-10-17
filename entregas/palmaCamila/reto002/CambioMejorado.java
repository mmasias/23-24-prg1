class CambioMejorado {
    public static void main(String[] args) {
        int price = 500;
        int receivedMoney = 46;
        int change = price - receivedMoney;

        System.out.println("El precio es: " + price + " y tu me has dado: " + receivedMoney);
        System.out.println("Tu cambio es: " + change);

        int numberOfHundredDollarBill = change / 100;
        change = change - (100 * numberOfHundredDollarBill);

        int numberOfFiftyDollarBill = change / 50;
        change = change - (50 * numberOfFiftyDollarBill);

        int numberOfTwentyDollarBill = change / 20;
        change = change - (20 * numberOfTwentyDollarBill);

        int numberOfTenDollarBill = change / 10;
        change = change - (10 * numberOfTenDollarBill);

        int numberOfFiveDollarBill = change / 5;
        change = change - (5 * numberOfFiveDollarBill);

        int numberOfTwoCoin = change / 2;
        change = change - (2 * numberOfTwoCoin);

        int numberOfOneCoin = change / 1;
        change = change - (1 * numberOfOneCoin);

        String numberOfHundredDollarBillString = numberOfHundredDollarBill > 0 ? numberOfHundredDollarBill + " billetes de 100€\n" : "";
        String numberOfFiftyDollarBillString = numberOfFiftyDollarBill > 0 ? numberOfFiftyDollarBill + " billetes de 50€\n" : "";
        String numberOfTwentyDollarBillString = numberOfTwentyDollarBill > 0 ? numberOfTwentyDollarBill + " billetes de 20€\n" : "";
        String numberOfTenDollarBillString = numberOfTenDollarBill > 0 ? numberOfTenDollarBill + " billetes de 10€\n" : "";
        String numberOfFiveDollarBillString = numberOfFiveDollarBill > 0 ? numberOfFiveDollarBill + " billetes de 5€\n" : "";
        String numberOfTwoCoinString = numberOfTwoCoin > 0 ? numberOfTwoCoin + " billetes de 2€\n" : "";
        String numberOfOneCoinString = numberOfOneCoin > 0 ? numberOfOneCoin + " billetes de 1€\n" : "";

        System.out.print(numberOfHundredDollarBillString);
        System.out.print(numberOfFiftyDollarBillString);
        System.out.print(numberOfTwentyDollarBillString);
        System.out.print(numberOfTenDollarBillString);
        System.out.print(numberOfFiveDollarBillString);
        System.out.print(numberOfTwoCoinString);
        System.out.print(numberOfOneCoinString);
        
    }
}
