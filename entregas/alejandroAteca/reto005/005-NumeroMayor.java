import java.util.Scanner;

class HigherNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digáme un primer número");
    int number1 = scanner.nextInt();

    System.out.println("Digáme un segundo número ");
    int number2 = scanner.nextInt();

    int firstPick = number1 - number2;

    System.out.println(firstPick > 0 ? "El número más alto es " + number1 : "");
    System.out.println(firstPick < 0 ? "El número más alto es " + number2 : "");
  }
}
