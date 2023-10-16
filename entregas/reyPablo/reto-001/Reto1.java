class Reto1 {

	public static void main(String[] args) {
	int precio = 70;
        int cantidad = 504;
        int vuelta = cantidad - precio; 
        System.out.println("El precio es: " + Precio + "€");
        System.out.println("El valor del objeto es: " + Cantidad + "€");
        System.out.println("El cambio es: " + Vuelta + "€");
        int cantidad200 = vuelta / 200;
        vuelta = vuelta % 200;
        int cantidad100 = vuelta / 100;
        vuelta = Vuelta % 100;
        
        int cantidad50 = vuelta / 50;
        Vuelta = Vuelta % 50;

        int cantidad20 = vuelta / 20;
        Vuelta = Vuelta % 20;

        int cantidad10 = vuelta / 10;
        Vuelta = Vuelta % 10;

        int cantidad5 = vuelta / 5;
        vuelta = vuelta % 5;

        int cantidad2 = vuelta / 2;
        vuelta =vuelta % 2;

        int cantidad1 = vuelta;
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