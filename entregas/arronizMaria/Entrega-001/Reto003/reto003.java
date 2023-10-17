import java.util.Scanner;

class reto003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad que debe pagar: ");
		int precio = scanner.nextInt();
		System.out.print("Introduzca la cantidad pagada: ");
		int pagado = scanner.nextInt();
		
		int cantidad = pagado - precio;
		System.out.println("Se le va a devolver: " + cantidad);
		
		final int BILLETE100 = 100;
	    final int BILLETE50 = 50;
		final int BILLETE20 = 20;
		final int BILLETE10 = 10;
		final int BILLETE5 = 5;
		final int MONEDA2 = 2;
		final int MONEDA1 = 1;
		
		int cantidadBillete100 = cantidad / BILLETE100;
		cantidad%= BILLETE100;
		
		int cantidadBillete50 = cantidad / BILLETE50;
		cantidad%= BILLETE50;
		
		int cantidadBillete20 = cantidad / BILLETE20;
		cantidad%= BILLETE20;
		
		int cantidadBillete10 = cantidad / BILLETE10;
		cantidad%= BILLETE10;
		
		int cantidadBillete5 = cantidad / BILLETE5;
		cantidad%= BILLETE5;
		
		int cantidadMoneda2 = cantidad / MONEDA2;
		cantidad%= MONEDA2;
		
		int cantidadMoneda1 = cantidad / MONEDA1;
		cantidad%= MONEDA1;
		
		String cambio = (cantidadBillete100 > 0 ? "Billete(s) de 100: " + cantidadBillete100 + "\n" : "") +
						(cantidadBillete50 > 0 ? "Billete(s) de 50: " + cantidadBillete50 + "\n" : "") +
						(cantidadBillete20 > 0 ? "Billete(s) de 20: " + cantidadBillete20 + "\n" : "") +
						(cantidadBillete10 > 0 ? "Billete(s) de 10: " + cantidadBillete10 + "\n" : "") +
						(cantidadBillete5 > 0 ? "Billete(s) de 5: " + cantidadBillete5 + "\n" : "") +
						(cantidadMoneda2 > 0 ? "Moneda(s) de 2: " + cantidadMoneda2 + "\n" : "") +
						(cantidadMoneda1 > 0 ? "Moneda(s) de 1: " + cantidadMoneda1 + "\n" : "");
		
		System.out.println(cambio);
		
		

    }
}