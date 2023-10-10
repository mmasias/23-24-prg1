public class cambio {
    public static void main(String[] arg) {
        
        System.out.println("Debe pagar 232 euros");
        System.out.println("Ha entregado 400 euros");
        System.out.println("---------------------------------------");

        int cambio = 168;

        int billetesDe100 = cambio / 100;
        cambio %= 100;

        int billetesDe50 = cambio / 50;
        cambio %= 50;

        int billetesDe20 = cambio / 20;
        cambio %= 20;

        int billetesDe10 = cambio / 10;
        cambio %= 10;

        int billetesDe5 = cambio / 5;
        cambio %= 5;

        int billetesDe2 = cambio / 2;
        cambio %= 2;

        int billetesDe1 = cambio;

        System.out.println(billetesDe100+" billete(s) de 100€");
        System.out.println(billetesDe50+" billete(s) de 50€");
        System.out.println(billetesDe20+" billete(s) de 20€");
        System.out.println(billetesDe10+" billete(s) de 10€");
        System.out.println(billetesDe5+" billete(s) de 5€");
        System.out.println(billetesDe2+" billete(s) de 2€");
        System.out.println(billetesDe1+" billete(s) de 1€");
    }
}
