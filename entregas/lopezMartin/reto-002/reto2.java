class Reto2{
    public static void main(String[] args) {

        int billetes100= 0;
        int billetes50= 0;
        int billetes20= 0;
        int billetes10= 0;
        int billetes5= 0;
        int monedas2= 0;
        int monedas1= 0;

        int cantidadPagar = 400;
        int cantidadEntregada = 1432;

        System.out.println("Debes pagar: " + cantidadPagar);
        System.out.println("Has pagado: " + cantidadEntregada);
        System.out.println("-------------------------");

        int cantidadDevolver = cantidadEntregada-cantidadPagar;

        billetes100 = cantidadDevolver/100;
        cantidadDevolver = cantidadDevolver-(100*billetes100);
        billetes50 = cantidadDevolver/50;
        cantidadDevolver = cantidadDevolver-(50*billetes50);
        billetes20 = cantidadDevolver/20;
        cantidadDevolver = cantidadDevolver-(20*billetes20);
        billetes10 = cantidadDevolver/10;
        cantidadDevolver = cantidadDevolver-(10*billetes10);
        billetes5 = cantidadDevolver/5;
        cantidadDevolver = cantidadDevolver-(5*billetes5);
        monedas2 = cantidadDevolver/2;
        cantidadDevolver = cantidadDevolver-(2*monedas2);
        monedas1 = cantidadDevolver/1;
        cantidadDevolver = cantidadDevolver-(1*monedas1);

        String mensaje100 = billetes100 > 0 ? billetes100 + " billete(s) de 100€\n" : "";
        String mensaje50 = billetes50 > 0 ? billetes50 + " billete(s) de 50€\n" : "";
        String mensaje20 = billetes20 > 0 ? billetes20 + " billete(s) de 20€\n" : "";
        String mensaje10 = billetes10 > 0 ? billetes10 + " billete(s) de 10€\n" : "";
        String mensaje5 = billetes5 > 0 ? billetes5 + " billete(s) de 5€\n" : "";
        String mensaje2 = monedas2 > 0 ? monedas2 + " moneda(s) de 2€\n" : "";
        String mensaje1 = monedas1 > 0 ? monedas1 + " moneda(s) de 1€\n" : "";

        System.out.print(mensaje100);
        System.out.print(mensaje50);
        System.out.print(mensaje20);
        System.out.print(mensaje10);
        System.out.print(mensaje5);
        System.out.print(mensaje2);
        System.out.print(mensaje1);

    }
}
