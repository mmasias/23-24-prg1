public class DevolverCambio2 {
    public static void main(String[] args) {

        int dineroDado;
        int precioProducto;
        int cambio;
        int pendienteDePagar;
        int billeteDe100;
        int billeteDe50;
        int billeteDe20;
        int billeteDe10;
        int billeteDe5;
        int monedaDe2;
        int monedaDe1;
        

        dineroDado = 4374;
        precioProducto = 286; 
        cambio = dineroDado - precioProducto;

        System.out.println("El producto cuesta" + precioProducto + "euros");
        System.out.println("--------------------------------------------------------");
        System.out.println("Entrego" + dineroDado + "euros");
        System.out.println("--------------------------------------------------------");
        System.out.println("El cambio sera" + cambio + "euros");
        System.out.println("--------------------------------------------------------");

        
        billeteDe100 = cambio/100;
        cambio = cambio % 100;
         System.out.println(billeteDe100 > 0 ? "Billetes de 100 euros: " + billeteDe100 : "");

        billeteDe50 = cambio/50;
        cambio = cambio % 50;
        System.out.println(billeteDe50 > 0 ? "Billetes de 50 euros: " + billeteDe50 : "");
        
        billeteDe20 = cambio/20;
        cambio = cambio % 20;
        System.out.println(billeteDe20 > 0 ? "Billetes de 20 euros: " + billeteDe20 : "");


        billeteDe10 = cambio/10;
        cambio = cambio % 10;
        System.out.println(billeteDe10 > 0 ? "Billetes de 10 euros: " + billeteDe10 : "");

        billeteDe5 = cambio/5;
        cambio = cambio%5;
        System.out.println(billeteDe5 > 0 ? "Billetes de 5 euros: " + billeteDe5 : "");

        monedaDe2 = cambio/2;
        cambio = cambio%2;
        System.out.println(monedaDe2 > 0 ? "Monedas de 2 euros: " + monedaDe2 : "");
        
        monedaDe1 = cambio/1;
        cambio = cambio%1;
        System.out.println(monedaDe1 > 0 ? "Monedas de 1 euros: " + monedaDe1 : "");
    }
    
}
