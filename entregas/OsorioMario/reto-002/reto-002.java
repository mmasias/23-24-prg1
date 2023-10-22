class Devolvercambiomejora {
    public static void main(String[] args) {

        int entrega = 500;
        int debe = 328;
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

        System.out.println(mensaje);
    }
}
