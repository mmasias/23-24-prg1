public class DevolucionDinero2 {
    public static void main(String[] args) {

        int dineroDado;
        int precioProducto;
        int cambio;
        int pendienteDePagar;
        int billete100;
        int billete50;
        int billete20;
        int billete10;
        int billete5;
        int moneda2;
        int moneda1;


        dineroDado = 4374;
        precioProducto = 286;
        cambio = dineroDado - precioProducto;

        System.out.println("El producto cuesta" + precioProducto + "euros");
        System.out.println("---------------------------------------------");
        System.out.println("Entrego" + dineroDado + "euros");
        System.out.println("---------------------------------------------");
        System.out.println("El cambio será" + cambio + "euros");
        System.out.println("---------------------------------------------");


        billete100 = cambio/100
        cambio = cambio/50
        System.out.println(billete100 > 0 ? "Billetes de 100 euros: " + billete100 : "");

        billete50 = cambio/50;
        cambio = cambio%50;
        System.out.println(billete50 > 0 ? "Billetes de 50 euros: " + billete50 : "");

        billete20 = cambio/20;
        cambio = cambio%20;
        System.out.printl(billete20 > 0 ? "Billetes de 20 euros; " + billete20 : "");

        billete10 = cambio/10;
        cambio = cambio%10;
        System.out.printl(billete10 > 0 ? "Billetes de 10 euros; " + billete10 : "");

        billete5 = cambio/5;
        cambio = cambio%5;
        System.out.printl(billete5 > 0 ? "Billetes de 5 euros; " + billete5 : "");

        moneda2 = cambio/2;
        cambio = cambio%2;
        System.out.printl(moneda2 > 0 ? "Monedas de 2 euros; " + moneda2 : "");

        moneda1 = cambio/1;
        cambio = cambio%1;
        System.out.printl(moneda1 > 0 ? "Monedas de 1 euro; " + moneda1 : "");







        


    }
}