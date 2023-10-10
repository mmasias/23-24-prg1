public class devolverCambio {
    public static void main(String[] arg) {
        
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

        System.out.println(billetesDe100+" billetes de 100€");
        System.out.println(billetesDe50+" billetes de 50€");
        System.out.println(billetesDe10+" billetes de 10€");
        System.out.println(billetesDe5+" billetes de 5€");
        System.out.println(billetesDe2+" billetes de 2€");
        System.out.println(billetesDe1+" billetes de 1€");
    }
}
