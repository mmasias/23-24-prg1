public class devolverCambio {
    public static void main(String[] args) {
        int entregado, cuenta, devolucion;
        cuenta = 552;
        entregado = 695;
        devolucion = entregado - cuenta;

        int billete100, billete50, billete20, billete10, billete5, moneda2, moneda1;

        billete100 = devolucion / 100;
        devolucion = devolucion % 100;

        billete50 = devolucion / 50;
        devolucion = devolucion % 50;

        billete20 = devolucion / 20;
        devolucion = devolucion % 20;

        billete10 = devolucion / 10;
        devolucion = devolucion % 10;

        billete5 = devolucion / 5;
        devolucion = devolucion % 5;

        moneda2 = devolucion / 2;
        devolucion = devolucion % 2;

        moneda1 = devolucion;

        final String LINEA = "-----------------------";
        System.out.println(LINEA);
        System.out.println("Debe pagar:"+cuenta);
        System.out.println("Ha entregado:"+entregado);;
        System.out.println(LINEA);
        System.out.println("Billete(s) de 100 euros:"+billete100);
        System.out.println("Billete(s) de 50 euros:"+billete50);
        System.out.println("Billete(s) de 20 euros:"+billete20);
        System.out.println("Billete(s) de 10 euros:"+billete10);
        System.out.println("Billete(s) de 5 euros:"+billete5);
        System.out.println("Moneda(s) de 2 euros:"+moneda2);
        System.out.println("Moneda(s) de 1 euro:"+moneda1);
        System.out.println(LINEA);
    }    
}
