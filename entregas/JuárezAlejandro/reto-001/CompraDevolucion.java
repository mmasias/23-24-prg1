class CompraDevolucion {
	
	public static void main (String [] args) {
		int dineroDado;
		int precioProducto;
		int vuelto;
		int pendiente;
		int billeteDe100;
		int billeteDe50;
		int billeteDe20;
		int billeteDe10;
		int billeteDe5;
		int monedaDe2;
		int monedaDe1;
		final String LINEA = "------------------------------------------";
		
		dineroDado = 1765;
		precioProducto = 1269;
		vuelto = dineroDado - precioProducto;
		
		System.out.println("Mi producto me costó " + precioProducto + " euros");
		System.out.println(LINEA);
		System.out.println("Daré la cantidad de " + dineroDado + " euros");
		System.out.println(LINEA);
		System.out.println("El vuelto será de " + vuelto + " euros");
		System.out.println(LINEA);
		System.out.println("Lo que se reparte en: ");
		System.out.println(LINEA);
		
		billeteDe100 = vuelto / 100;
		pendiente = vuelto % 100;
		System.out.println("Se devolverán " + billeteDe100 + " billetes de 100 euros");
		System.out.println("aún falta que devuelvan " + pendiente + " euros");
		System.out.println(LINEA);
		
		billeteDe50 = pendiente / 50;
		pendiente = pendiente % 50;
		System.out.println("Se devolverán " + billeteDe50 + " billetes de 50 euros");
		System.out.println("aún falta que devuelvan " + pendiente + " euros");
		System.out.println(LINEA);
		
		billeteDe20 = pendiente / 20;
		pendiente = pendiente % 20;
		System.out.println("Se devolverán " + billeteDe20 + " billetes de 20 euros");
		System.out.println("aún falta que devuelvan " + pendiente + " euros");
		System.out.println(LINEA);
		
		billeteDe10 = pendiente / 10;
		pendiente = pendiente % 10;
		System.out.println("Se devolverán " + billeteDe10 + " billetes de 10 euros");
		System.out.println("aún falta que devuelvan " + pendiente + " euros");
		System.out.println(LINEA);
		
		billeteDe5 = pendiente / 5;
		pendiente = pendiente % 5;
		System.out.println("Se devolverán " + billeteDe5 + " billetes de 5 euros");
		System.out.println("aún falta que devuelvan " + pendiente + " euros");
		System.out.println(LINEA);
		
		monedaDe2 = pendiente / 2;
		pendiente = pendiente % 2;
		System.out.println("Se devolverán " + monedaDe2 + " monedas de 2 euros");
		System.out.println("aún falta que devuelvan " + pendiente + " euros");
		System.out.println(LINEA);
		
		monedaDe1 = pendiente;
		System.out.println("Se devolverán " + monedaDe1 + " monedas de 1 euros");
		
		System.out.println(LINEA);
		System.out.println("Ya no se devolverá más dinero");
	}
}