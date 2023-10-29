import java.util.Scanner;

class DevolverCambioMejorado{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nInserte el precio del producto:");
        int productPrice = scanner.nextInt();
        System.out.println("\nInserte con cuanto dinero va a pagar:");
        int customerCash = scanner.nextInt();
        int changeCash = customerCash - productPrice;

        int billOneHundredChange = changeCash / 100;
        changeCash = changeCash % 100;
        int billFiftyChange = changeCash / 50;
        changeCash = changeCash % 50;
        int billTwentyChange = changeCash / 20;
        changeCash = changeCash % 20;  
        int billTenChange = changeCash / 10;
        changeCash = changeCash % 10;
        int billFiveChange = changeCash / 5;
        changeCash = changeCash % 5;
        int billTwoChange = changeCash / 2;
        changeCash = changeCash % 2;
        int billOneChange = changeCash / 1;
     
        System.out.println("\n----------------------------------------\nDebe pagar " + productPrice + " euros");
        System.out.println("Ha entregado " + customerCash + " euros");
        System.out.println("----------------------------------------");
        String receipt =
        (billOneHundredChange >= 1 ? billOneHundredChange + " billete(s) de 100 euros \n---\n" : "") +
        (billFiftyChange >= 1 ? billFiftyChange + " billete(s) de 50 euros \n---\n" : "") +
        (billTwentyChange >= 1 ? billTwentyChange + " billete(s) de 20 euros \n---\n" : "") +
        (billTenChange >= 1 ? billTenChange + " billete(s) de 10 euros \n---\n" : "") +
        (billFiveChange >= 1 ? billFiveChange + " billete(s) de 5 euros \n---\n" : "") +
        (billTwoChange >= 1 ? billTwoChange + " moneda(s) de 2 euros \n---\n" : "")+
        (billOneChange >= 1 ? billOneChange + " moneda(s) de 1 euro" : "");
        System.out.println(receipt);
    }
}