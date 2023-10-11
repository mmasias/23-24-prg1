 
public class Reto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precio = 70;
        int cantidad = 504;
        int Vuelta = cantidad - precio; 
        System.out.println("El precio es: " + precio + "€");
        System.out.println("El valor del objeto es: " + cantidad + "€");
        System.out.println("El cambio es: " + Vuelta + "€");
        int cantidad200 = Vuelta / 200;
        Vuelta = Vuelta % 200;
        int cantidad100 = Vuelta / 100;
        Vuelta = Vuelta % 100;
        
        int cantidad50 = Vuelta / 50;
        Vuelta = Vuelta % 50;

        int cantidad20 = Vuelta / 20;
        Vuelta = Vuelta % 20;

        int cantidad10 = Vuelta / 10;
        Vuelta = Vuelta % 10;

        int cantidad5 = Vuelta / 5;
        Vuelta = Vuelta % 5;

        int cantidad2 = Vuelta / 2;
        Vuelta = Vuelta % 2;

        int cantidad1 = Vuelta;
        System.out.println("Me devuelven " + cantidad200 + " billetes de 200€");
        System.out.println("Me devuelven " + cantidad100 + " billetes de 100€");
        System.out.println("Me devuelven " + cantidad50 + " billetes de 50€");
        System.out.println("Me devuelven " + cantidad20 + " billetes de 20€");
        System.out.println("Me devuelven " + cantidad10 + " billetes de 10€");
        System.out.println("Me devuelven " + cantidad5 + " monedas de 5€");
        System.out.println("Me devuelven " + cantidad2 + " monedas de 2€");
        System.out.println("Me devuelven " + cantidad1 + " monedas de 1€");
   	 
	}

}