import java.util.Scanner;
public class DevolverCambioMejorado {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos euros debe ");
        int givenMoney = scanner.nextInt();

        System.out.println("Cuantos euros entrega ");
        int price = scanner.nextInt();

        int change = price - givenMoney;
        System.out.println("Deberia recibir:");

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

        int twoCoin = change / 2;
        change = twoCoin > 0 ? change - (2 * twoCoin) : change; 

        int oneCoin = change / 1;
        change = oneCoin > 0 ? change - (1 * oneCoin) : change;

        String oneHundredString = oneHundredBill > 0 ?  oneHundredBill + " billetes de 100€ " : "";
        String fiftyString = fifBill > 0 ? fifBill + " billetes de 50€ " : "";
        String twentyString = twBill > 0 ? twBill + " billetes de 20€  " : "";
        String tenPString = tenBill > 0 ? tenBill + " billetes de 10€ " : "";
        String fivePString = fiveBill > 0 ? fiveBill + " billetes de 5€ " : "";
        String twString = twoCoin > 0 ? twoCoin +  " billetes de 2€ " : ""; 
        String onePString = oneCoin > 0 ?  oneCoin + " billetes de 1€ " : "";

        System.out.println(oneHundredString);
        System.out.println(fiftyString);
        System.out.println(twentyString);
        System.out.println(tenPString);
        System.out.println(fivePString);
        System.out.println(twString); 
        System.out.println(onePString);

        scanner.close();
    }
}
