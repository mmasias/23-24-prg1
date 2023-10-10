public class reto2 {
    public static void main(String[] args) {
   

        int cambio = 168;

        int billetesde100 = cambio / 100;
        cambio %= 100;

        int billetesde50 = cambio / 50;
        cambio %= 50;

        int billetesde10 = cambio / 10;
        cambio %= 10;

        int billetesde5 = cambio / 5;
        cambio %= 5;

        int billetesde2 = cambio / 2;
        cambio %= 2;
        int billetesde1 = cambio;

        System.out.println(billetesde100 + " Billetes de 100@");
        System.out.println(billetesde50 + " Billetes de 50€");
        System.out.println(billetesde10 + " Biletes de 10€");
        System.out.println(billetesde5 + " Billetes de 5€");
        System.out.println(billetesde2 + " Billetes de 2€");
        System.out.println(billetesde1 + " Billetes de 1€");
    }
}
