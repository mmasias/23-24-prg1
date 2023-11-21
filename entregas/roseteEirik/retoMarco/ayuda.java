package roseteEirik.retoMarco;

public class ayuda {
    public static void main(String[] args) {
        String mensaje1 = obtenerMensaje(5);
        String mensaje2 = obtenerMensaje(10);

        System.out.println("Mensaje 1: " + mensaje1);
        System.out.println("Mensaje 2: " + mensaje2);
    }

    public static String obtenerMensaje(int numero) {
        if (numero > 0) {
            // Alguna lógica aquí
            return "El número es positivo.";
        } else if (numero < 0) {
            // Otra lógica aquí
            return "El número es negativo.";
        } else {
            // Lógica predeterminada
            return "El número es cero.";
        }
    }
}