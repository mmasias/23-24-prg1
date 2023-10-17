class Reto2 {
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
        
        monedas2 = devolucion / 2;
        devolucion = devolucion % 2;
        
        monedas1 = devolucion;
        
        String salida = (billetes100 == 0 ? "" : "Numero de billetes de 100: " + billetes100 + "\n") +
                (billetes50== 0 ? "" : "Numero de billetes de 50: " + billetes50 + "\n") +
                (billetes20 == 0 ? "" : "Numero de billetes de 20: " + billetes20 + "\n") +
                (billetes10 == 0 ? "" : "Numero de billetes de 10: " + billetes10 + "\n") +
                (billetes5 == 0 ? "" : "Numero de billetes de 5: " + billetes5 + "\n") +
                (monedas2 == 0 ? "" : "Numero de billetes de 2: " + monedas2 + "\n") +
                (monedas1 == 0 ? "" : "Numero de monedas de 1: " + monedas1 + "\n");
        System.out.println(salida);
    }
}
