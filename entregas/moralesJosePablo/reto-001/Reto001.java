public class Reto001 {
    public static void main(String[] args) {
        int montoAPagar = 300;
        int montoEntregado = 575;

        int cambio = montoEntregado - montoAPagar;
        System.out.println("Cambio a devolver: " + cambio + " euros");

        int[] BilletesyMonedas = { 100, 50, 20, 10, 5, 2, 1 };

        int i = 0;
        mostrarDesglose(cambio, BilletesyMonedas, i);
    }

    public static void mostrarDesglose(int cambio, int[] BilletesyMonedas, int i) {
        int cantidad = cambio / BilletesyMonedas[i];
        cantidad = (cambio % BilletesyMonedas[i] / BilletesyMonedas[i]) * cantidad
                + (1 - cambio % BilletesyMonedas[i] / BilletesyMonedas[i]) * cantidad;
        cambio = cambio - cantidad * BilletesyMonedas[i];
        System.out.println("Billete/Moneda de " + BilletesyMonedas[i] + " euros: " + cantidad);
        i++;

        mostrarDesglose(cambio, BilletesyMonedas, i);
    }
}
