class DevolverCambio {
    public static void main(String[] args) {
        int price= 10;
        int givenMoney = 25;
        int change = givenMoney - price;

        System.out.println("El precio es: " + price + " y tu me has dado: " + givenMoney);
        System.out.println("Tu cambio es: " + change);

        int oneHundredBill = change / 100;
        change = oneHundredBill > 0 ? change - (100 * oneHundredBill) : change;

        int fiftyBill = change / 50;
        change = fiftyBill > 0 ? change - (50 * fiftyBill) : change;

        int twentyBill = change / 20;
        change = twentyBill > 0 ? change - (20 * twentyBill) : change;

        int tenBill = change / 10;
        change = tenBill > 0 ? change - (10 * tenBill) : change;

        int fiveBill = change / 5;
        change = fiveBill > 0 ? change - (5 * fiveBill) : change;

        int oneBill = change / 1;
        change = oneBill > 0 ? change - (1 * oneBill) : change;

        System.out.println("\n" + oneHundredBill + " Billetes de 100");
        System.out.println(fiftyBill + " Billetes de 50");
        System.out.println(twentyBill+ " Billetes de 20");
        System.out.println(tenBill + " Billetes de 10");
        System.out.println(fiveBill + " Billetes de 5");
        System.out.println(oneBill + " Billetes de 1");
    }
} 
