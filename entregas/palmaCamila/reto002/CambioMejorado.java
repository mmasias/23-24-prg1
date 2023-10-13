public class CambioMejorado {
    public static void main(String[] args) {
        int price = 500;
        int givenMoney = 46;
        int change = price - givenMoney;

        System.out.println("El precio es: " + price + " y tu me has dado: " + givenMoney);
        System.out.println("Tu cambio es: " + change);

        int oneHundredBill = change / 100;
        change = change - (100 * oneHundredBill);

        int fifBill = change / 50;
        change = change - (50 * fifBill);

        int twBill = change / 20;
        change = change - (20 * twBill);

        int tenBill = change / 10;
        change = change - (10 * tenBill);

        int fiveBill = change / 5;
        change = change - (5 * fiveBill);

        int twoCoin = change / 2;
        change = change - (2 * twoCoin);

        int oneCoin = change / 1;
        change = change - (1 * oneCoin);

        String oneHundredString = oneHundredBill > 0 ? oneHundredBill + " billetes de 100€\n" : "";
        String fiftyString = fifBill > 0 ? fifBill + " billetes de 50€\n" : "";
        String twentyString = twBill > 0 ? twBill + " billetes de 20€\n" : "";
        String tenString = tenBill > 0 ? tenBill + " billetes de 10€\n" : "";
        String fivePString = fiveBill > 0 ? fiveBill + " billetes de 5€\n" : "";
        String twoPString = twoCoin > 0 ? twoCoin + " billetes de 2€\n" : "";
        String onePString = oneCoin > 0 ? oneCoin + " billetes de 1€\n" : "";

        System.out.print(oneHundredString);
        System.out.print(fiftyString);
        System.out.print(twentyString);
        System.out.print(tenString);
        System.out.print(fivePString);
        System.out.print(twoPString);
        System.out.print(onePString);
        
    }
}
