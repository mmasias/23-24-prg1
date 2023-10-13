package entregas.lopesBrenda.Reto001;

public class DevolverCambio {
    public static void main(String[] args) {

        int montoAPagar = 232;
        int montoPago = 400;

        int cambio = montoPago - montoAPagar;

        int billete100 = cambio/100;
        cambio = cambio % 100;

        int billete50 = cambio/50;
        cambio = cambio % 50;

        int billete20 = cambio/20;
        cambio = cambio % 20;

        int billete10 = cambio/10;
        cambio = cambio % 10;

        int billete5 = cambio/5;
        cambio = cambio % 5;

        int moneda2 = cambio/2;
        cambio = cambio % 2;


        System.out.println("Debe pagar " + montoAPagar + " euros");
        System.out.println("Ha entregado " + montoPago + " euros");
        System.out.println("------------------------------------");
        System.out.println(billete100 + " billete(s) de 100€ "  );
        System.out.println(billete50 + " billete(s) de 50€ "  );
        System.out.println(billete20 + " billete(s) de 20€ "  );
        System.out.println(billete10 + " billete(s) de 10€ "  );
        System.out.println(billete5 + " billete(s) de 5€ "  );
        System.out.println(moneda2 + " moneda(s) de 2€ "  );
        System.out.println(cambio + " moneda(s) de 1€ "  );


    }
}