import java.util.Scanner;
public class Reto03 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int Cambio;
        int BilleteDe100;
        int BilleteDe50;
		int BilleteDe20;
		int BilleteDe10;
		int BilleteDe5;
		int MonedaDe2;
		int MonedaDe1;

        System.out.println("========================================================");
        System.out.println("Ingrese la cantidad a pagar");
        int PrecioProducto = scanner.nextInt();
        System.out.println("========================================================");
		System.out.println("Ingrese El Dinero que le entregara al Cajero");
		int DineroUsuario = scanner.nextInt();
        System.out.println("========================================================");
        

        Cambio = DineroUsuario - PrecioProducto;

        System.out.println("El precio del producto es: " + PrecioProducto + " Euros");
        System.out.println("========================================================");
        System.out.println("El Dinero Entregado fue: " + DineroUsuario + " Euros");
        System.out.println("========================================================");
        System.out.println("El cambio a devolver sera de: " + Cambio + " Euros");
        System.out.println("========================================================");
        System.out.println("Lo que sera devuelto en");
        System.out.println("========================================================");

        BilleteDe100 = Cambio/100;
		Cambio = Cambio%100;
        String BilleteDe100Texto = (BilleteDe100 >0) ? BilleteDe100 +" Billete(s) de 100 " + "\n"  + "========================================================"+  "\n"  : "";
        BilleteDe50 = Cambio/50;
		Cambio = Cambio%50;
        String BilleteDe50Texto = (BilleteDe50 >0) ? BilleteDe50 +" Billete(s) de 50 " + "\n"  + "========================================================"+  "\n"  : "";

        BilleteDe20 = Cambio/20;
		Cambio = Cambio%20;
        String BilleteDe20Texto = (BilleteDe20 >0) ? BilleteDe20 +" Billete(s) de 20 " + "\n"  + "========================================================"+  "\n"  : "";


        BilleteDe10 = Cambio/10;
		Cambio = Cambio%10;
        String BilleteDe10Texto = (BilleteDe10 >0) ? BilleteDe10 +" Billete(s) de 10 " + "\n"  + "========================================================"+  "\n" : "";

        

        BilleteDe5 = Cambio/5;
		Cambio = Cambio%5;
        String BilleteDe5Texto = (BilleteDe5 >0) ? BilleteDe5 +" Billete(s) de 5 " +  "\n"  + "========================================================"+  "\n" : "";

        MonedaDe2 = Cambio/2;
		Cambio = Cambio%2;
        String MonedaDe2Texto = (MonedaDe2 >0) ? MonedaDe2 +" Moneda(s) de 2 " +  "\n"  + "========================================================"+  "\n" : "";

        MonedaDe1 = Cambio/1;
		Cambio = Cambio%1;
        String MonedaDe1Texto = (MonedaDe1 >0) ? MonedaDe1 +" Moneda(s) de 1" +  "\n"  + "========================================================"+  "\n" : "";


        System.out.println(BilleteDe100Texto + BilleteDe50Texto + BilleteDe20Texto + BilleteDe10Texto + BilleteDe5Texto + MonedaDe1Texto + MonedaDe2Texto);

}
}

    
