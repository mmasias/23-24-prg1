public class Cambio{
    public static void main(String[] args) {

        int billetes100= 0;
        int billetes50= 0;
        int billetes20= 0;
        int billetes10= 0;
        int billetes5= 0;
        int monedas2= 0;
        int monedas1= 0;

        int cantidad_pagar = 400;
        int cantidad_entregada = 677;

        System.out.println("Debes pagar: " + cantidad_pagar);
        System.out.println("Has pagado: " + cantidad_entregada);
        System.out.println("-------------------------");

        int cantidad_devolver = cantidad_entregada-cantidad_pagar;

        billetes100 = cantidad_devolver/100;
        cantidad_devolver = cantidad_devolver-(100*billetes100);
        billetes50 = cantidad_devolver/50;
        cantidad_devolver = cantidad_devolver-(50*billetes50);
        billetes20 = cantidad_devolver/20;
        cantidad_devolver = cantidad_devolver-(20*billetes20);
        billetes10 = cantidad_devolver/10;
        cantidad_devolver = cantidad_devolver-(10*billetes10);
        billetes5 = cantidad_devolver/5;
        cantidad_devolver = cantidad_devolver-(5*billetes5);
        monedas2 = cantidad_devolver/2;
        cantidad_devolver = cantidad_devolver-(2*monedas2);
        monedas1 = cantidad_devolver/1;
        cantidad_devolver = cantidad_devolver-(1*monedas1);

        System.out.println(billetes100 + " billete(s) de 100€");
        System.out.println(billetes50 + " billete(s) de 50€");
        System.out.println(billetes20 + " billete(s) de 20€");
        System.out.println(billetes10 + " billete(s) de 10€");
        System.out.println(billetes5 + " billete(s) de 5€");
        System.out.println(monedas2 + " moneda(s) de 2€");
        System.out.println(monedas1 + " moneda(s) de 1€");

    }
}
