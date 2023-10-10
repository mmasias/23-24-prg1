class ChangeCalculator2 {

  public static void main(String[] args) {
    int paid = 400;
    int shellPrice = 232;

    System.out.println("Debe pagar " + shellPrice + " €");

    System.out.println("Ha entregado " + paid + " €");

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
