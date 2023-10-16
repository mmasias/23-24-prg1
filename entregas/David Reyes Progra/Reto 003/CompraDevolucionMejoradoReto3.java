import java.util.Scanner;

class CompraDevolucionMejoradoReto3 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del producto");
		int precioProducto = valores.nextInt();
		System.out.println("Ingrese el dinero");
        int dineroDado= valores.nextInt(); 
        int vuelto;
		final String LINEA = "----------------------------------";
        vuelto = dineroDado - precioProducto;
        
        System.out.println("Mi producto me costó " + precioProducto + " euros");
        System.out.println(LINEA);
        System.out.println("Daré la cantidad de " + dineroDado + " euros");
        System.out.println(LINEA);
        System.out.println("El vuelto será de " + vuelto + " euros");
        System.out.println(LINEA);
        System.out.println("Lo que se reparte en: ");
        System.out.println(LINEA);

        int billeteDe100 = vuelto / 100;
        int pendiente = vuelto % 100;
        String mensajeBilleteDe100 = (billeteDe100 > 0) ? "Se devolverán " + billeteDe100 + " billetes de 100 euros\naún falta que devuelvan " + pendiente + " euros\n---------------------------------------------------" : "";

        int billeteDe50 = pendiente / 50;
        pendiente = pendiente % 50;
        String mensajeBilleteDe50 = (billeteDe50 > 0) ? "Se devolverán " + billeteDe50 + " billetes de 50 euros\naún falta que devuelvan " + pendiente + " euros\n---------------------------------------------------" : "";

        int billeteDe20 = pendiente / 20;
        pendiente = pendiente % 20;
        String mensajeBilleteDe20 = (billeteDe20 > 0) ? "Se devolverán " + billeteDe20 + " billetes de 20 euros\naún falta que devuelvan " + pendiente + " euros\n---------------------------------------------------" : "";

        int billeteDe10 = pendiente / 10;
        pendiente = pendiente % 10;
        String mensajeBilleteDe10 = (billeteDe10 > 0) ? "Se devolverán " + billeteDe10 + " billetes de 10 euros\naún falta que devuelvan " + pendiente + " euros\n---------------------------------------------------" : "";

        int billeteDe5 = pendiente / 5;
        pendiente = pendiente % 5;
        String mensajeBilleteDe5 = (billeteDe5 > 0) ? "Se devolverán " + billeteDe5 + " billetes de 5 euros\naún falta que devuelvan " + pendiente + " euros\n---------------------------------------------------" : "";

        int monedaDe2 = pendiente / 2;
        pendiente = pendiente % 2;
        String mensajeMonedaDe2 = (monedaDe2 > 0) ? "Se devolverán " + monedaDe2 + " monedas de 2 euros\naún falta que devuelvan " + pendiente + " euros\n---------------------------------------------------" : "";

        int monedaDe1 = pendiente / 1;
        pendiente = pendiente % 1;
        String mensajeMonedaDe1 = (monedaDe1 > 0) ? "Se devolverán " + monedaDe1 + " monedas de 1 euro\naún falta que devuelvan " + pendiente + " euros\n---------------------------------------------------" : "";

        System.out.println(mensajeBilleteDe100 + mensajeBilleteDe50 + mensajeBilleteDe20 + mensajeBilleteDe10 + mensajeBilleteDe5 + mensajeMonedaDe2 + mensajeMonedaDe1);
}
}