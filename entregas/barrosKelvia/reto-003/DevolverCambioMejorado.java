import java.util.Scanner;

public class DevolverCambioMejorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a pagar: ");
        int toPay = scanner.nextInt();

        System.out.print("Ingrese el monto entregado: ");
        int delivered = scanner.nextInt();

        int change = delivered - toPay;
        System.out.println("El cambio es: " + change);

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

        System.out.println(billOneHundred > 0 ? "Billetes de 100 euros: " + billOneHundred : "");
        System.out.println(billFifty > 0 ? "Billetes de 50 euros: " + billFifty : "");
        System.out.println(billTwenty > 0 ? "Billetes de 20 euros: " + billTwenty : "");
        System.out.println(billTen > 0 ? "Billetes de 10 euros: " + billTen : "");
        System.out.println(billFive > 0 ? "Billetes de 5 euros: " + billFive : "");
        System.out.println(coinTwo > 0 ? "Monedas de 2 euros: " + coinTwo : "");
        System.out.println(coinOne > 0 ? "Monedas de 1 euros: " + coinOne : "");

    }   
}        
