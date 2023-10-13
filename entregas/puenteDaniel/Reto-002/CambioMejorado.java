public class CambioMejorado{
    public static void main(String[] args) {
        int entregado, cuenta, devolucion;
        cuenta = 443;
        entregado = 1000;
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
        System.out.print((billete100>=1)? ("Billete(s) de 100 euros:"+billete100 + "\n"):"");
        System.out.print((billete50>=1) ? ("Billete(s) de 50 euros:"+billete50 + "\n"):"");
        System.out.print((billete20>=1) ? ("Billete(s) de 20 euros:"+billete20 + "\n"):"");
        System.out.print((billete10>=1)? ("Billete(s) de 10 euros:"+billete10 + "\n"):"");
        System.out.print((billete5>=1)? ("Billete(s) de 5 euros:"+billete5 + "\n"):"");
        System.out.print((moneda2>=1)? ("Moneda(s) de 2 euros:"+moneda2 +"\n"):"");
        System.out.print((moneda1>=1)? ("Moneda(s) de 1 euro:"+moneda1 + "\n"):"");
        System.out.println(LINEA);
    } 
}

