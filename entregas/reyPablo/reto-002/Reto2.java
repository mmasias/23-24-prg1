
class Reto2 {

	public static void main(String[] args) {
	int precio = 70;
        int cantidad = 504;
        int Vuelta = cantidad - precio; 
        System.out.println("El precio es: " + precio + "€");
        System.out.println("Tú dinero es: " + cantidad + "€");
        System.out.println("El cambio es: " + Vuelta + "€");
        int cantidad200 = Vuelta / 200;
        vuelta = vuelta %200;
        
        int cantidad100 = vuelta / 100;
        vuelta = vuelta % 100;
        
        int cantidad50 = vuelta / 50;
        vuelta = vuelta % 50;

        int cantidad20 = vuelta / 20;
        vuelta = vuelta % 20;

        int cantidad10 = vuelta / 10;
        vuelta = vuelta % 10;

        int cantidad5 = vuelta / 5;
        vuelta = vuelta % 5;

        int cantidad2 = vuelta / 2;
        vuelta = vuelta % 2;

        int cantidad1 = vuelta;
        
        System.out.print(cantidad200 > 0 ? "\nBilletes de 200 euros: " + cantidad200 : "");
        System.out.print(cantidad100 > 0 ? "\nBilletes de 100 euros: " + cantidad100 : "");
        System.out.print(cantidad50 > 0 ? "\nBilletes de 50 euros: " + cantidad50 : "");
        System.out.print(cantidad20 > 0 ? "\nBilletes de 20 euros: " + cantidad20 : "");
        System.out.print(cantidad10 > 0 ? "\nBilletes de 10 euros: " + cantidad10 : "");
        System.out.print(cantidad5 > 0 ? "\nBilletes de 5 euros: " + cantidad5 : "");
        System.out.print(cantidad2 > 0 ? "\nMonedas de 2 euros: " + cantidad2 : "");
        System.out.print(cantidad1 > 0 ? "\nMonedas de 1 euros: " + cantidad1 : "");

   	 
	}

}