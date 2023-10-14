public class Reto1 {
    public static void main (String [] args) {
        int DineroUsuario;
        int PrecioProducto;
        int Cambio;
        int BilleteDe100;
        int BilleteDe50;
		int BilleteDe20;
		int BilleteDe10;
		int BilleteDe5;
		int MonedaDe2;
		int MonedaDe1;

        DineroUsuario = 1500;
        PrecioProducto = 354;
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
        System.out.println("========================================================");
        System.out.println(BilleteDe100 +" Billete(s) de 100");
        System.out.println("========================================================");

        BilleteDe50 = Cambio/50;
		Cambio = Cambio%50;
        System.out.println("========================================================");
        System.out.println(BilleteDe50 +" Billete(s) de 50");
        System.out.println("========================================================");

        BilleteDe20 = Cambio/20;
		Cambio = Cambio%20;
        System.out.println("========================================================");
        System.out.println(BilleteDe20 +" Billete(s) de 20");
        System.out.println("========================================================");

        BilleteDe10 = Cambio/10;
		Cambio = Cambio%10;
        System.out.println("========================================================");
        System.out.println(BilleteDe10 +" Billete(s) de 10");
        System.out.println("========================================================");

        BilleteDe5 = Cambio/5;
		Cambio = Cambio%5;
        System.out.println("========================================================");
        System.out.println(BilleteDe5 +" Billete(s) de 5");
        System.out.println("========================================================");

        MonedaDe2 = Cambio/2;
		Cambio = Cambio%2;
        System.out.println("========================================================");
        System.out.println(MonedaDe2 +" Moneda(S) de 2");
        System.out.println("========================================================");

        MonedaDe1 = Cambio/1;
		Cambio = Cambio%1;
        System.out.println("========================================================");
        System.out.println(MonedaDe1 +" Moneda(S) de 1");
        System.out.println("========================================================");








}
}
