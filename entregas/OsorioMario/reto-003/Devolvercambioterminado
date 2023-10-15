import java.util.Scanner;

class Devolvercambioterminado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto entregado: ");
        int entrega = scanner.nextInt();
        System.out.print("Ingrese el monto debido: ");
        int debe = scanner.nextInt();

        int cambiopordevolver = entrega - debe;
        String mensaje = "";

        int calcular = 100;
        int cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        mensaje += (cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + calcular + "€\n" : "";

        calcular = 50;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        mensaje += (cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + calcular + "€\n" : "";

        calcular = 20;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        mensaje += (cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + calcular + "€\n" : "";

        calcular = 10;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        mensaje += (cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + calcular + "€\n" : "";

        calcular = 5;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        mensaje += (cantidadBilletes > 0) ? cantidadBilletes + " billetes de " + calcular + "€\n" : "";

        calcular = 2;
        int cantidadMonedas = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        mensaje += (cantidadMonedas > 0) ? cantidadMonedas + " monedas de " + calcular + "€\n" : "";

        calcular = 1;
        cantidadMonedas = cambiopordevolver;
        mensaje += (cantidadMonedas > 0) ? cantidadMonedas + " monedas de " + calcular + "€" : "";

        System.out.println("Cambio a devolver:");
        System.out.println(mensaje);

        scanner.close();
    }
}
