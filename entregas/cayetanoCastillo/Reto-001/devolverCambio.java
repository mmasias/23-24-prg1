import java.util.Scanner;

public class devolverCambio {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar monto a pagar y monto entregado

        System.out.print("Monto a pagar: ");
        int montoPagar = teclado.nextInt();
        while(montoPagar <=0){
            System.out.println("El Monto introducido es negativo o 0.");
            System.out.print("Ingrese un nuevo monto:");
            montoPagar = teclado.nextInt();
        }

        System.out.print("Monto entregado: ");
        int montoEntregado = teclado.nextInt();
        while(montoEntregado < montoPagar){
            System.out.print("Monto menor que el Pago, ingrese un numero superior o igual a ["+ montoPagar + "]: ");
            montoEntregado = teclado.nextInt();
        }
        // Calcular el cambio
        int cambio = montoEntregado - montoPagar;

        // Llamar a la función para desglosar el cambio
        if(cambio != 0){
        desglosarCambio(cambio);
        }else{
            System.out.print("El cambio es 0, no hay devolución.");
        }
    }

    public static void desglosarCambio(int cambio) {
        int[] denominaciones = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("El cambio se desglosa en:");

        for (int i = 0; i < denominaciones.length; i++) {
            int cantidad = cambio / denominaciones[i];
            if (cantidad > 0) {
                System.out.println(cantidad + " billete(s) o moneda(s) de " + denominaciones[i] + " " + (denominaciones[i] > 1 ? "euros" : "euro"));
            }
            cambio %= denominaciones[i];
        }
    }
}
