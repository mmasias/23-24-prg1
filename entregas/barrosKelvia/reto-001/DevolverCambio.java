class CalculadoraCambio {
    public static void main(String[] args) {

        int toPay = 232;
        int delivered = 400;
        int change = delivered - toPay;
        
        int billOneHundred = change / 100;
        change = change % 100;

        int billFifty = change / 50;
        change = change % 50;

        int billTwenty = change / 20;
        change = change % 20;

        int billTen = change / 10;
        change = change % 10;

        int billFive = change / 5;
        change = change % 5;

        int coinTwo = change / 2;
        change = change % 2;

        int coinOne = change;

        System.out.println("Billetes de 100 euros: " + billOneHundred);
        System.out.println("Billetes de 50 euros: " + billFifty);
        System.out.println("Billetes de 20 euros: " + billTwenty);
        System.out.println("Billetes de 10 euros: " + billTen);
        System.out.println("Billetes de 5 euros: " + billFive);
        System.out.println("Monedas de 2 euros: " + coinTwo);
        System.out.println("Monedas de 1 euro: " + coinOne);

        
    }
}
