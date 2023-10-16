class CompraDevolucion {
	public static void main (String [] args) {

		int dineroEntregado;
		int precioProducto;
		int cambio;
		int porDar;
		int billeteDe100;
		int billeteDe50;
		int billeteDe20;
		int billeteDe10;
		int billeteDe5;
		int monedaDe2;
		int monedaDe1;
		final String LINEA = "----------------------------------";

		dineroEntregado = 2940;
		precioProducto = 1668;
		cambio = dineroEntregado - precioProducto;
       
        System.out.println(LINEA);
		System.out.println("Mi producto tiene un costó de " + precioProducto + " euros");
		System.out.println(LINEA);
		System.out.println("Daré la cantidad de " + dineroEntregado + " euros");
		System.out.println(LINEA);
		System.out.println("El cambio será de " + cambio + " euros");
		System.out.println(LINEA);
		System.out.println("Lo que se reparte en: ");
		System.out.println(LINEA);
		
		billeteDe100 = cambio/100;

		porDar = cambio%100;
		System.out.println("Se devolverán " + billeteDe100 + " billetesMinimos de 100 euros");
		System.out.println("aún falta por devuelver " + porDar + " euros");
		System.out.println(LINEA);
        

		billeteDe50 = porDar/50;

		porDar = porDar%50;
		System.out.println("Se devolverán " + billeteDe50 + " billetesMinimos de 50 euros");
		System.out.println("aún falta por devolver " + porDar + " euros");
		System.out.println(LINEA);
		


		billeteDe20 = porDar/20;

		porDar = porDar%20;
		System.out.println("Se devolverán " + billeteDe20 + " billetesMinimos de 20 euros");
		System.out.println("aún falta por devolver " + porDar + " euros");
		System.out.println(LINEA);
		


		billeteDe10 = porDar/10;

		porDar = porDar%10;
        
		System.out.println("Se devolverán " + billeteDe10 + " billetesMinimos de 10 euros");
		System.out.println("aún falta por devolver " + porDar + " euros");
		System.out.println(LINEA);
		

		billeteDe5 = porDar/5;

		porDar = porDar%5;
        
		System.out.println("Se devolverán " + billeteDe5 + " billetesMinimos de 5 euros");
		System.out.println("aún falta por devolver " + porDar + " euros");
		System.out.println(LINEA);
		 
		monedaDe2 = porDar/2;

		porDar = porDar%2;
		System.out.println("Se devolverán " + monedaDe2 + " monedas de 2 euros");
		System.out.println("aún falta por devolver " + porDar + " euros");
		System.out.println(LINEA);
		
		monedaDe1 = porDar/1;
		
		porDar = porDar%1;
		System.out.println("Se devolverán " + monedaDe1 + " monedas de 1 euros");
        System.out.println("aún falta por devolver " + porDar + " euros");
        System.out.println(LINEA);
	}
}