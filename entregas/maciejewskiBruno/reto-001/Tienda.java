class Tienda {
	public static void main(String[] args) {

		int precio;
		int pagado;
		int porDevolver;

		precio = 122;
		pagado = 200;
		porDevolver = pagado - precio;

		System.out.println("Total por devolver: " + porDevolver);
		System.out.println("Billetes de 20: " + porDevolver / 20);
		porDevolver = porDevolver % 20;
		System.out.println("Billetes de 10: " + porDevolver / 10);
		porDevolver = porDevolver % 10;
		System.out.println("Billetes de 5: " + porDevolver / 5);
		porDevolver = porDevolver % 5;
		System.out.println("Monedas de 2: " + porDevolver / 2);
		porDevolver = porDevolver % 2;
		System.out.println("Monedas de 1: " + porDevolver);
	}
}