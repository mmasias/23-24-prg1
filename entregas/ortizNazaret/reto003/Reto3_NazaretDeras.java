import java.util.Scanner;

class Reto3_NazaretDeras {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
  
        System.out.println("How much does it cost?");
        int price= scanner.nextInt();
        System.out.println("How much is given?");
        int givenMoney = scanner.nextInt();
        int change = givenMoney - price;

        System.out.println("El precio es: " + price + " y tu me has dado: " + givenMoney);
        System.out.println("Tu cambio es: " + change);
        
        int oneHundredBill = change / 100;
        change = oneHundredBill > 0 ? change - (100 * oneHundredBill) : change;
        
        int fifBill = change / 50;
        change = fifBill > 0 ? change - (50 * fifBill) : change;
        
        int twBill = change / 20;
        change = twBill > 0 ? change - (20 * twBill) : change;
        
        int tenBill = change / 10;
        change = tenBill > 0 ? change - (10 * tenBill) : change;
        
        int fiveBill = change / 5;
        change = fiveBill > 0 ? change - (5 * fiveBill) : change;
        
        int oneBill = change / 1;
        change = oneBill > 0 ? change - (1 * oneBill) : change;
        
        String result =
        (oneHundredBill > 0 ? "Billetes de 100: " + oneHundredBill + "\n" : "") +
        (fifBill> 0 ? "Billetes de 50: " + fifBill + "\n" : "") +
        (twBill> 0 ? "Billetes de 20: " + twBill + "\n" : "") +
        (tenBill > 0 ? "Billetes de 10: " + tenBill + "\n" : "") +
        (fiveBill > 0 ? "Billetes de 5: " + fiveBill + "\n" : "") +
        (oneBill > 0 ? "Billetes de 1: " + oneBill + "\n" : "");
        
        System.out.println(result);

    }
}