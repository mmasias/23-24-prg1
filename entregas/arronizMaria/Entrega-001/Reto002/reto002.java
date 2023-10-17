class reto002{
    public static void main(String[] args) {
	
	System.out.println("Debe pagar 232 euros");
	System.out.println("Ha entregrado 400 euros");
	System.out.println("------------------------");
	
	final int BILLETE100 = 100;
	final int BILLETE50 = 50;
	final int BILLETE20 = 20;
	final int BILLETE10 = 10;
	final int BILLETE5 = 5;
	final int MONEDA2 = 2;
	final int MONEDA1 = 1;
	
	int pagado = 400;
	int precio = 232;
	int cantidad = pagado - precio;
	
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
	
	String mensaje1 = cantidadBillete100>0? "Billete(s) de 100: " +cantidadBillete100 :" ";
	String mensaje2 = cantidadBillete50>0? "Billete(s) de 50: " +cantidadBillete50 :" ";
	String mensaje3 = cantidadBillete20>0? "Billete(s) de 20: " +cantidadBillete20 :" ";
	String mensaje4 = cantidadBillete10>0? "Billete(s) de 10: " +cantidadBillete10 :" ";
	String mensaje5 = cantidadBillete5>0? "Billete(s) de 5: " +cantidadBillete5 :" ";
	String mensaje6 = cantidadMoneda2>0? "Moneda(s) de 2: " +cantidadMoneda2 :" ";
	String mensaje7 = cantidadMoneda1>0? "Moneda(s) de 1: " +cantidadMoneda1 :" ";
	
	System.out.println(mensaje1);
	System.out.println(mensaje2);
	System.out.println(mensaje3);
	System.out.println(mensaje4);
	System.out.println(mensaje5);
	System.out.println(mensaje6);
	System.out.println(mensaje7);
	
    }
}