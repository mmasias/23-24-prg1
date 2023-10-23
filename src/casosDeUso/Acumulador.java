package casosDeUso;
import java.util.Scanner;

class Acumulador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean enOperacion = true;
        int contador = 0;
        while (enOperacion) {
            System.out.println("=-".repeat(15));
            System.out.println("Voy acumulando. ¿Cuanto acumula? (0 para salir)");
            int respuesta = scanner.nextInt();

            if (respuesta != 0) {
                System.out.println("> Vamos acumulando");
                contador = contador + respuesta;
            } else {
                enOperacion = false;
                System.out.println("> Ha elegido terminar");
            }
        }

        System.out.println("Finalmente acumuló " + contador);
        scanner.close();
    }    
}
