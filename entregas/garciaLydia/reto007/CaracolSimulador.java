package entregas.garciaLydia.reto007;
import java.util.Scanner;

public class CaracolSimulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profundidadInicial = Math.random() * (20 - 10) + 10;
        double profundidadActual = -profundidadInicial;

        System.out.println("Profundidad Inicial: " + profundidadInicial);
        System.out.println("***---***---***---***---***---***---***---***---***");

        int diaActual = 0;
        boolean estaVivo = true;

        do {
            diaActual++;
            System.out.println("=== Día " + diaActual + " ===");

            double probabilidadLluvia = Math.random();
            if (probabilidadLluvia <= 0.05) {
                System.out.println("Lluvia fuerte. El pozo se inunda.");
                profundidadInicial -= 5;
                profundidadActual = -profundidadInicial;
            } else if (probabilidadLluvia <= 0.15) {
                System.out.println("Lluvia media. El pozo se inunda un poco.");
                profundidadInicial -= 2;
                profundidadActual = -profundidadInicial;
            } else {
                System.out.println("Buen clima.");
            }

            double caracolSube = Math.random() * 3 + 1;
            System.out.println("El caracol sube: " + caracolSube);
            profundidadActual += caracolSube;

            double caracolBaja = Math.random() * 2;
            System.out.println("El caracol baja: " + caracolBaja);
            profundidadActual -= caracolBaja;

            System.out.println("La profundidad actual es: " + profundidadActual);

            System.out.println("Presiona Enter para avanzar al siguiente día...");
            scanner.nextLine();

            if (diaActual > 10) {
                double caracolDespues10Dias = Math.random() * 2 + 1;
                System.out.println("El caracol sube: " + caracolDespues10Dias);
                profundidadActual += caracolDespues10Dias;
            }

            if (diaActual > 20) {
                double caracolDespues20Dias = Math.random();
                System.out.println("El caracol baja: " + caracolDespues20Dias);
                profundidadActual -= caracolDespues20Dias;
            }

            if (Math.random() <= 0.35) {
                System.out.println("Pasa un coche. El caracol cae 2 metros.");
                profundidadActual -= 2;
            }

        } while (profundidadActual < 0 && estaVivo && diaActual < 50);

        System.out.println("El caracol ha salido");
    }
}