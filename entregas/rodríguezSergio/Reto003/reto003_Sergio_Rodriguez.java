import java.util.Scanner;

public class reto003_Sergio_Rodriguez {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuanto cuesta el producto: ");
        int precio = scanner.nextInt();

        System.out.print("Cuanto dinero entrego: ");
        int cantidad = scanner.nextInt();
       
        int cambio = cantidad - precio; 
        System.out.println("Me devuelven: " + cambio + " euros");
        

        int Billete_100 = cambio / 100;
        cambio = cambio % 100;

        int Billete_50 = cambio / 50;
        cambio = cambio % 50;

        int Billete_20 = cambio / 20;
        cambio = cambio % 20;

        int Billete_10 = cambio / 10;
        cambio = cambio % 10;

        int Billete_5 = cambio / 5;
        cambio = cambio % 5;

        int Moneda_2 = cambio / 2;
        cambio = cambio % 2;

        int Moneda_1 = cambio;
        
        System.out.println(Billete_100 > 0 ? "Billete(s) de 100 euros: " + Billete_100 : "");
        System.out.println(Billete_50 > 0 ? "Billete(s) de 50 euros: " + Billete_50 : "");
        System.out.println(Billete_20 > 0 ? "Billete(s) de 20 euros: " + Billete_20 : "");
        System.out.println(Billete_10 > 0 ? "Billete(s) de 10 euros: " + Billete_10 : "");
        System.out.println(Billete_5 > 0 ? "Billete(s) de 5 euros: " + Billete_5 : "");
        System.out.println(Moneda_2 > 0 ? "Moneda(s) de 2 euros: " + Moneda_2 : "");
        System.out.println(Moneda_1 > 0 ? "Monedas(s) de 1 euros: " + Moneda_1 : "");

    }
}