class DevolverCambio{
    public static void main(String[] args){
	
	int dineroDado;
	int precioVenta;
	int cambio;
	int billeteDe100;
	int billeteDe50;
	int billeteDe20;
	int billeteDe10;
	int billeteDe5;
	int monedaDe2;
	int monedaDe1;
	
	dineroDado= 1000;
	precioVenta= 870;
	cambio= dineroDado - precioVenta;
	
	System.out.println("El producto cuesta " + precioVenta + " euros");
	System.out.println("--------------------------------------------");
	System.out.println("Doy " + dineroDado + " euros");
	System.out.println("--------------------------------------------");
	System.out.println("Me van a dar " + cambio + " euros");
	
	billeteDe100= cambio/100;
	cambio= cambio % 100;
	billeteDe50= cambio/50;
	cambio= cambio % 50; 
	billeteDe20= cambio/20;
	cambio= cambio % 20;
	billeteDe10= cambio/10;
	cambio= cambio % 10;
	billeteDe5= cambio/5;
	cambio= cambio % 5;
	monedaDe2= cambio/2;
	cambio= cambio % 2;
	monedaDe1= cambio/1;
	cambio= cambio % 1;
	
	System.out.println("Me van a dar " + billeteDe100 + " billete(s) de 100 euros");
	System.out.println("Me van a dar " + billeteDe50 + " billete(s) de 50 euros");
	System.out.println("Me van a dar " + billeteDe20 + " billete(s) de 20 euros");
	System.out.println("Me van a dar " + billeteDe10 + " billete(s) de 10 euros");
	System.out.println("Me van a dar " + billeteDe5 + " billete(s) de 5 euros");
	System.out.println("Me van a dar " + monedaDe2 + " moneda(s) de 2 euros");
	System.out.println("Me van a dar " + monedaDe1 + " monedas(s) de 1 euro");

    }
} 
