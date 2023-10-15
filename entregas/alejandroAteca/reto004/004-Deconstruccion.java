import java.util.Scanner;

class Deconstruction {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digáme un primer numero de 3 cifras");
    int number1 = scanner.nextInt();

    System.out.println("Digáme un segundo numero de 3 cifras");
    int number2 = scanner.nextInt();

    System.out.println("Digáme un último numero de 3 cifras");
    int number3 = scanner.nextInt();

    int firstPick = number1 / 100;
    int secondPick = number2 % 100 / 10;
    int thirdPick = number3 % 10;

    System.out.println("Su número es " + firstPick + secondPick + thirdPick);
  }
}
