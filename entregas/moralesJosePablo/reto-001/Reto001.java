public class Reto001 {
    public static void main(String[] args) {
        int montoAPagar = 300;
        int montoEntregado = 575;

        int cambio = montoEntregado - montoAPagar;
        System.out.println("Cambio a devolver: " + cambio + " euros");

        int[] denominaciones = { 100, 50, 20, 10, 5, 2, 1 };

        int i = 0;
        mostrarDesglose(cambio, denominaciones, i);
    }

    public static void mostrarDesglose(int cambio, int[] denominaciones, int i) {
        if (i < denominaciones.length) {
            int cantidad = cambio / denominaciones[i];
            cantidad = (cambio % denominaciones[i] / denominaciones[i]) * cantidad
                    + (1 - cambio % denominaciones[i] / denominaciones[i]) * cantidad;
            cambio = cambio - cantidad * denominaciones[i];
            System.out.println("Billete/Moneda de " + denominaciones[i] + " euros: " + cantidad);
            i++;
            mostrarDesglose(cambio, denominaciones, i);
        }
    }
}