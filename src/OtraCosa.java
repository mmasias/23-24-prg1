import java.util.Scanner;
class AdivinaNumero {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 10);

        System.out.println("He pensado un numero, adivinalo!");
        int numero = scanner.nextInt();

        if (numero==aleatorio) {
            System.out.println("Adivinaste!");
        } else {
            System.out.println("No adivinaste");
            if (numero>aleatorio) {
                System.out.println("Es menor!");
            } else {
                System.out.println("Es mayor");
            }
            numero = scanner.nextInt();
            if (numero==aleatorio) {
                System.out.println("Adivinaste!");
            } else {
                System.out.println("No adivinaste, era " + aleatorio);
            }
        }
    }
}
