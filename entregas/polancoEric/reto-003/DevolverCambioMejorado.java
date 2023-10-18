import java.util.Scanner;

public class DevolverCambioMejorado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dineroDado;
        int precioVenta;
        int cambio;
        int billeteDe100;
        int billeteDe50;
        int billeteDe20;
        int billeteDe10;
        int billeteDe5;
        int monedaDe2;
        int monedaDe1;
         

        System.out.print("Cuantos euros da? ");
        dineroDado = entrada.nextInt();
        System.out.print("Cuantos euros debe? ");
        precioVenta = entrada.nextInt();

        cambio = dineroDado - precioVenta;

        System.out.println("El producto cuesta " + precioVenta + " euros");
        System.out.println("--------------------------------------------");
        System.out.println("Doy " + dineroDado + " euros");
        System.out.println("--------------------------------------------");
        System.out.println("Me van a dar " + cambio + " euros");

        billeteDe100 = cambio / 100;       
        cambio = cambio % 100;
        billeteDe50 = cambio / 50;       
        cambio = cambio % 50;
        billeteDe20 = cambio / 20;       
        cambio = cambio % 20;
        billeteDe10 = cambio / 10;       
        cambio = cambio % 10;
        billeteDe5 = cambio / 5;       
        cambio = cambio % 5;
        monedaDe2 = cambio / 2;        
        cambio = cambio % 2;
        monedaDe1 = cambio / 1;
        cambio = cambio % 1;

        devolucionCambio("billete(s) de 100 euros", billeteDe100);
        devolucionCambio("billete(s) de 50 euros", billeteDe50);
        devolucionCambio("billete(s) de 20 euros", billeteDe20);
        devolucionCambio("billete(s) de 10 euros", billeteDe10);
        devolucionCambio("billete(s) de 5 euros", billeteDe5);
        devolucionCambio("moneda(s) de 2 euros", monedaDe2);
        devolucionCambio("moneda(s) de 1 euro", monedaDe1);
    }

   
    public static void devolucionCambio(String tipo, int cantidad) {
        System.out.println(cantidad > 0 ? "Me van a dar " + cantidad + " " + tipo : " ");
    }
}
