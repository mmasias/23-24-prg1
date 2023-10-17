class MoneyCalculations {
	public static void main(String[] args) {

		int sellPrice = 370;
		int paid = 1463;
		int change = paid - sellPrice;
		int bill;
		int billQty;
		String message;

		final String bill100 = "billete de " + 100 + " euros";
		final String bill50 = "billete de " + 50 + " euros";
		final String bill20 = "billete de " + 20 + " euros";
		final String bill10 = "billete de " + 10 + " euros";
		final String bill5 = "billete de " + 5 + " euros";
		final String coin2 = "moneda de " + 2 + " euros";
		final String coin1 = "moneda de " + 1 + " euros";

		System.out.println("||===================||");
		System.out.println("||  RECIBO DE COMPRA ||");
		System.out.println("||===================||");
		System.out.println();

		System.out.println("El precio total es: " + sellPrice + " euros");
		System.out.println("Usted ha dado: " + paid + " euros");
		System.out.println();

		System.out.println("Su cambio es de: " + change + " euros,");
		System.out.println("dado con un total de: ");
		System.out.println();

		bill = 100;
		billQty = change / bill;
		change = change % bill;
		message = (billQty + " " + bill100);
		System.out.println(message);

		bill = 50;
		billQty = change / bill;
		change = change % bill;
		message = (billQty + " " + bill50);
		System.out.println(message);

		bill = 20;
		billQty = change / bill;
		change = change % bill;
		message = (billQty + " " + bill20);
		System.out.println(message);

		bill = 10;
		billQty = change / bill;
		change = change % bill;
		message = (billQty + " " + bill10);
		System.out.println(message);

		bill = 5;
		billQty = change / bill;
		change = change % bill;
		message = (billQty + " " + bill5);
		System.out.println(message);

		bill = 2;
		billQty = change / bill;
		change = change % bill;
		message = (billQty + " " + coin2);
		System.out.println(message);

		bill = 1;
		billQty = change / bill;
		message = (billQty + " " + coin1);
		System.out.println(message);

	}
}
