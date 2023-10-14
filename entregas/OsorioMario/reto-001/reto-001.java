class DevolverCambio {
    public static void main(String[] args) {

        int entrega = 500;
        int debe = 328;
        int cambiopordevolver = entrega - debe;

        int calcular = 100;
        int cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        System.out.println(cantidadBilletes + " billetes de " + calcular + "€");

        calcular = 50;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        System.out.println(cantidadBilletes + " billetes de " + calcular + "€");

        calcular = 20;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        System.out.println(cantidadBilletes + " billetes de " + calcular + "€");

        calcular = 10;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        System.out.println(cantidadBilletes + " billetes de " + calcular + "€");

        calcular = 5;
        cantidadBilletes = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        System.out.println(cantidadBilletes + " billetes de " + calcular + "€");

        calcular = 2;
        int cantidadMonedas = cambiopordevolver / calcular;
        cambiopordevolver %= calcular;
        System.out.println(cantidadMonedas + " monedas de " + calcular + "€");

        calcular = 1;
        cantidadMonedas = cambiopordevolver;
        System.out.println(cantidadMonedas + " monedas de " + calcular + "€");
    }
}
