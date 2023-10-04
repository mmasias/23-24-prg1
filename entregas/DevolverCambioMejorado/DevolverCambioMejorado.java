public class DevolverCambioMejorado {

    public static void main(String[] args) {
        int amountPaid = 400;
        int productPrice = 232;
        int change = amountPaid - productPrice;

        int hundredBills = change / 100;
        int fiftyBills = (change % 100) / 50;
        int twentyBills = ((change % 100) % 50) / 20;
        int tenBills = (((change % 100) % 50) % 20) / 10;
        int fiveBills = ((((change % 100) % 50) % 20) % 10) / 5;
        int twoCoins = (((((change % 100) % 50) % 20) % 10) % 5) / 2;
        int oneCoins = ((((((change % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.println("Change: " + change);
        System.out.println(hundredBills > 0 ? "100 Bills: " + hundredBills : "");
        System.out.println(fiftyBills > 0 ? "50 Bills: " + fiftyBills : "");
        System.out.println(twentyBills > 0 ? "20 Bills: " + twentyBills : "");
        System.out.println(tenBills > 0 ? "10 Bills: " + tenBills : "");
        System.out.println(fiveBills > 0 ? "5 Bills: " + fiveBills : "");
        System.out.println(twoCoins > 0 ? "2 Coins: " + twoCoins : "");
        System.out.println(oneCoins > 0 ? "1 Coins: " + oneCoins : "");
    }
}
