import java.util.Scanner;
public class DevolverCambioMejorado {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos euros debe: ");
        int receivedMoney = scanner.nextInt();

        System.out.println("Cuantos euros entrega: ");
        int price = scanner.nextInt();

        int change = price - receivedMoney;
        System.out.println("Deberia recibir:");

        int  numberOfHundredDollarBill = change / 100;
        change =  numberOfHundredDollarBill > 0 ? change - (100 *  numberOfHundredDollarBill) : change;

        int numberOfFiftyDollarBill = change / 50;
        change = numberOfFiftyDollarBill > 0 ? change - (50 * numberOfFiftyDollarBill) : change;

        int numberOfTwentyDollarBill = change / 20;
        change = numberOfTwentyDollarBill > 0 ? change - (20 * numberOfTwentyDollarBill) : change;

        int numberOfTenDollarBill = change / 10;
        change = numberOfTenDollarBill > 0 ? change - (10 * numberOfTenDollarBill) : change;

        int numberOfFiveDollarBill = change / 5;
        change = numberOfFiveDollarBill > 0 ? change - (5 * numberOfFiveDollarBill) : change;

        int numberOfTwoCoin = change / 2;
        change = numberOfTwoCoin > 0 ? change - (2 * numberOfTwoCoin) : change; 

        int numberOfOneCoin = change / 1;
        change = numberOfOneCoin > 0 ? change - (1 * numberOfOneCoin) : change;

        String numberOfHundredDollarBillString = numberOfHundredDollarBill > 0 ?  numberOfHundredDollarBill + " billetes de 100€ " : "";
        String numberOfFiftyDollarBillString = numberOfFiftyDollarBill > 0 ? numberOfFiftyDollarBill + " billetes de 50€ " : "";
        String numberOfTwentyDollarBillString = numberOfTwentyDollarBill > 0 ? numberOfTwentyDollarBill + " billetes de 20€  " : "";
        String numberOfTenDollarBillString = numberOfTenDollarBill > 0 ? numberOfTenDollarBill + " billetes de 10€ " : "";
        String numberOfFiveDollarBillString = numberOfFiveDollarBill > 0 ? numberOfFiveDollarBill + " billetes de 5€ " : "";
        String numberOfTwoCoinString = numberOfTwoCoin > 0 ? numberOfTwoCoin +  " billetes de 2€ " : ""; 
        String numberOfOneCoinString = numberOfOneCoin > 0 ?  numberOfOneCoin + " billetes de 1€ " : "";

        System.out.println(numberOfHundredDollarBillString);
        System.out.println(numberOfFiftyDollarBillString);
        System.out.println(numberOfTwentyDollarBillString);
        System.out.println(numberOfTenDollarBillString);
        System.out.println(numberOfFiveDollarBillString);
        System.out.println(numberOfTwoCoinString); 
        System.out.println(numberOfOneCoinString);

        scanner.close();
    }
}
