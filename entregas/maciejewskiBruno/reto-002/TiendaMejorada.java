class TiendaMejorada {
    public static void main(String[] args) {
        int precio;
        int pagado;
        int porPagar;

        precio = 123;
        pagado = 150;

        porPagar = pagado - precio;

        System.out.println("El total a devolver es " + porPagar);

        String billetes100 = porPagar / 100 > 0 ? porPagar / 100 + " billetes de 100\n" : "";
        porPagar = porPagar % 100;
        String billetes50 = porPagar / 50 > 0 ? porPagar / 50 + " billetes de 50\n" : "";
        porPagar = porPagar % 50;
        String billetes20 = porPagar / 20 > 0 ? porPagar / 20 + " billetes de 20\n" : "";
        porPagar = porPagar % 20;
        String billetes10 = porPagar / 10 > 0 ? porPagar / 10 + " billetes de 10\n" : "";
        porPagar = porPagar % 10;
        String billetes5 = porPagar / 5 > 0 ? porPagar / 5 + " billetes de 5\n" : "";
        porPagar = porPagar % 5;
        String monedas2 = porPagar / 2 > 0 ? porPagar / 2 + " monedas de 2\n" : "";
        porPagar = porPagar % 2;
        String monedas1 = porPagar > 0 ? porPagar + " monedas de 1\n" : "";

        System.out.print(billetes100 + billetes50 + billetes20 + billetes10 + billetes5 + monedas2 + monedas1);
    }
}