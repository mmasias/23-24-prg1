public class reto1 {
    public static void main(String[] args) {
        System.out.println("Debes pagar 232 euros");
        System.out.println("He entregado 400 euros");
        System.out.println("-----------------------------------");

        int cambio = 168;

        int billetesde100 = cambio / 100;
        cambio %= 100;

        int billetesde50 = cambio / 50;
        cambio %= 50;

        int billetesde20 = cambio / 20;
        cambio %= 20;

        int billetesde10 = cambio / 10;
        cambio %= 10;

        int billetesde5 = cambio / 5;
        cambio %= 5;

        int billetesde2 = cambio / 2;
        cambio %= 2;
        int billetesde1 = cambio;

        System.out.println(billetesde100 + "Billete(s) de 100");
        System.out.println(billetesde50 + "Billete(s) de 50");
        System.out.println(billetesde20 + "Billete(s) de 20");
        System.out.println(billetesde10 + "Biletes(s) de 10");
        System.out.println(billetesde5 + "Billete(s) de 5");
        System.out.println(billetesde2 + "Billete(s) de 2");
        System.out.println(billetesde1 + "Billete(s) de 1");
    }
}
