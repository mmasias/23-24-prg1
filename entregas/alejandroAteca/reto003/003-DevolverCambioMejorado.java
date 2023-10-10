import java.util.Scanner;

class ChangeCalculator3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Dime con cuanto pagas");
    int paid = scanner.nextInt();

    System.out.println("Dime cuanto debes");
    int shellPrice = scanner.nextInt();

    int billsNumber;
    int nowWorking;
    int change = paid - shellPrice;

    nowWorking = 100;
    billsNumber = change / nowWorking;
    change = change - (nowWorking * billsNumber);
    System.out.println(billsNumber > 0 ? billsNumber + " billetes de " + nowWorking + "€" : "");

    nowWorking = 50;
    billsNumber = (change - (change % nowWorking)) / nowWorking;
    change = change - (nowWorking * billsNumber);
    System.out.println(billsNumber > 0 ? billsNumber + " billetes de " + nowWorking + "€" : "");

    nowWorking = 20;
    billsNumber = (change - (change % nowWorking)) / nowWorking;
    change = change - (nowWorking * billsNumber);
    System.out.println(billsNumber > 0 ? billsNumber + " billetes de " + nowWorking + "€" : "");

    nowWorking = 10;
    billsNumber = (change - (change % nowWorking)) / nowWorking;
    change = change - (nowWorking * billsNumber);
    System.out.println(billsNumber > 0 ? billsNumber + " billetes de " + nowWorking + "€" : "");

    nowWorking = 5;
    billsNumber = (change - (change % nowWorking)) / nowWorking;
    change = change - (nowWorking * billsNumber);
    System.out.println(billsNumber > 0 ? billsNumber + " billetes de " + nowWorking + "€" : "");

    nowWorking = 2;
    billsNumber = (change - (change % nowWorking)) / nowWorking;
    change = change - (nowWorking * billsNumber);
    System.out.println(billsNumber > 0 ? billsNumber + " monedas de " + nowWorking + "€" : "");

    nowWorking = 1;
    billsNumber = (change - (change % nowWorking)) / nowWorking;
    change = change - (nowWorking * billsNumber);
    System.out.println(billsNumber > 0 ? billsNumber + " monedas de " + nowWorking + "€" : "");
  }
}
