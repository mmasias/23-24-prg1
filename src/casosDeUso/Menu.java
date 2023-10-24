package casosDeUso;
import java.util.Scanner;

class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean enOperacion = true;
        while (enOperacion) {
            System.out.println("=-".repeat(15));
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opción: ");
            int respuesta = scanner.nextInt();

            if (respuesta == 4) {
                System.out.println("> Ha elegido salir");
                enOperacion = false;
            } else if (respuesta == 1) {
                System.out.println("> Ha elegido 1");
            } else if (respuesta == 2) {
                System.out.println("> Ha elegido 2");
            } else if (respuesta == 3) {
                System.out.println("> Ha elegido 3");
            } else {
                System.out.println("> Ha elegido una opción incorrecta!");
            }
        }
        scanner.close();
    }
}
