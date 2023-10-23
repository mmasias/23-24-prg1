package casosDeUso;
import java.util.Scanner;

class Acumulador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean enOperacion = true;
        int contador = 0;
        while (enOperacion) {
            System.out.println("=-".repeat(15));
            System.out.print("Voy acumulando. ¿Cuánto acumulas? (0 para salir) ");
            int respuesta = scanner.nextInt();

            if (respuesta != 0) {
                contador = contador + respuesta;
                System.out.println("> Vamos acumulando.");
            } else {
                enOperacion = false;
                System.out.println("> Ha elegido terminar");
            }
        }

        System.out.println("Finalmente acumuló " + contador);
        scanner.close();
    }    
}
