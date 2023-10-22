class Reto1 {
    public static void main(String[] args) {
        int precio, paga, devolucion, billetes100, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        precio = 154;
        paga = 1442;
        devolucion = paga - precio;

        billetes100 = devolucion / 100;
        devolucion = devolucion % 100;

        billetes50 = devolucion / 50;
        devolucion = devolucion % 50;

        billetes20 = devolucion / 20;
        devolucion = devolucion % 20;

        billetes10 = devolucion / 10;
        devolucion = devolucion % 10;

        billetes5 = devolucion / 5;
        devolucion = devolucion % 5;

        monedas2 = devolucion - devolucion / 2;
        devolucion = devolucion % 2;
        
        monedas1 = devolucion;

        System.out.println("Numero de billetes de 100:" + billetes100);
        System.out.println("Numero de billetes de 50:" + billetes50);
        System.out.println("Numero de billetes de 20:" + billetes20);
        System.out.println("Numero de billetes de 10:" + billetes10);
        System.out.println("Numero de billetes de 5:" + billetes5);
        System.out.println("Numero de billetes de 2:" + monedas2);
        System.out.println("Numero de monedas de 1:" + monedas1);
    }
}
