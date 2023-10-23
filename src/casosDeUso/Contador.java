package casosDeUso;
import java.util.Scanner;

class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean enOperacion = true;
        int contador = 0;
        while (enOperacion) {
            System.out.println("=-".repeat(15));
            System.out.print("Voy contando. ¿Sigo? (1:SI / 2 u otro número:NO) ");
            int respuesta = scanner.nextInt();

            if (respuesta == 1) {
                System.out.println("> Ha elegido seguir");
                contador++;
            } else {
                enOperacion = false;
                System.out.println("> Ha elegido terminar");
            }
        }

        System.out.println("Finalmente contó hasta " + contador);
        scanner.close();
    }    
}
