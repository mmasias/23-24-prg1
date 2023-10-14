public class Cambio{
    public static void main(String[] args) {

        int billetes100= 0;
        int billetes50= 0;
        int billetes20= 0;
        int billetes10= 0;
        int billetes5= 0;
        int monedas2= 0;
        int monedas1= 0;

        int cantidadPagar = 400;
        int cantidadEntregada = 677;

        System.out.println("Debes pagar: " + cantidadPagar);
        System.out.println("Has pagado: " + cantidadEntregada);
        System.out.println("-------------------------");

        int cantidadDevolver = cantidadEntregada - cantidadPorPagar;

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

        System.out.println(billetes100 + " billete(s) de 100€");
        System.out.println(billetes50 + " billete(s) de 50€");
        System.out.println(billetes20 + " billete(s) de 20€");
        System.out.println(billetes10 + " billete(s) de 10€");
        System.out.println(billetes5 + " billete(s) de 5€");
        System.out.println(monedas2 + " moneda(s) de 2€");
        System.out.println(monedas1 + " moneda(s) de 1€");

    }
}
