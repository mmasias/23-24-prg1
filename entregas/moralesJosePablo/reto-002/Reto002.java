import java.util.Scanner;

public class Reto002 {
    public static void main(String[] args) {
        int montoAPagar = 730; // Precio fijo del artículo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Monto entregado: ");
        int montoEntregado = scanner.nextInt();
        scanner.close(); // Cerrar el Scanner

        int cambio = montoEntregado - montoAPagar;
        System.out.println("Cambio a devolver: " + cambio + " euros");

        int denominacion = 100;
        String resultado = mostrarDesglose(cambio, denominacion);
        System.out.println(resultado);
    }

    public static String mostrarDesglose(int cambio, int denominacion) {
        int cantidad = cambio / denominacion;
        cambio = cambio % denominacion;

        String resultado = "Billete/Moneda de " + denominacion + " euros: " + cantidad;

        String output = (cantidad > 0) ? resultado : "";
        System.out.println(output);

        denominacion = (denominacion == 100) ? 50 : (denominacion == 50) ? 20 : (denominacion == 20) ? 10 : (denominacion == 10) ? 5 : (denominacion == 5) ? 2 : 0;

        String nextOutput = (denominacion > 0) ? mostrarDesglose(cambio, denominacion) : "";
        return nextOutput;
    }
}