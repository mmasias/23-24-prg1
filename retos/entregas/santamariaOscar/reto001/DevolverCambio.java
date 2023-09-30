
import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        int[] money = {100, 50,20,10,5,2,1};
        int cantidadAPagar, cantidadEntregada, cambio;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad a pagar : ");
        cantidadAPagar = scanner.nextInt();

        System.out.print("Ingrese la cantidad entregada : ");
        cantidadEntregada = scanner.nextInt();

        scanner.close();

        cambio = cantidadEntregada - cantidadAPagar;

        if (cambio < 0) {
            System.out.println("La cantidad entregada es insuficiente.");
        } else {
            System.out.println("Su cambio es: " + cambio);


            for (int i = 0; i < money.length; i++) {
                double billeteActual = money[i];
                int cantidadDeDinero = (int) (cambio / billeteActual);

                if (cantidadDeDinero > 0) {
                    System.out.println(cantidadDeDinero + " Billete(s) de " + billeteActual + " ");
                    cambio -= cantidadDeDinero * billeteActual;
                }
            }
        }
    }
}
