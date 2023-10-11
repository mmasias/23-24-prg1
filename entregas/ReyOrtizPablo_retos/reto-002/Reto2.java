
class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precio = 70;
        int cantidad = 504;
        int Vuelta = cantidad - precio; 
        System.out.println("El precio es: " + precio + "€");
        System.out.println("Tú dinero es: " + cantidad + "€");
        System.out.println("El cambio es: " + Vuelta + "€");
        int cantidad200 = Vuelta / 200;
        Vuelta = Vuelta %200;
        
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
        
        System.out.println(cantidad200 > 0 ? "Billetes de 200 euros: " + cantidad200 : "");
        System.out.println(cantidad100 > 0 ? "Billetes de 100 euros: " + cantidad100 : "");
        System.out.println(cantidad50 > 0 ? "Billetes de 50 euros: " + cantidad50 : "");
        System.out.println(cantidad20 > 0 ? "Billetes de 20 euros: " + cantidad20 : "");
        System.out.println(cantidad10 > 0 ? "Billetes de 10 euros: " + cantidad10 : "");
        System.out.println(cantidad5 > 0 ? "Billetes de 5 euros: " + cantidad5 : "");
        System.out.println(cantidad2 > 0 ? "Monedas de 2 euros: " + cantidad2 : "");
        System.out.println(cantidad1 > 0 ? "Monedas de 1 euros: " + cantidad1 : "");

   	 
	}

}