class Reto001_romeroAngel {
	public static void main(String [] args){
		
		int sellPrice = 370;
        int paid = 1463;
        int change = paid - sellPrice;	
        int bil;
        int bilQnt;	
		String mensaje;
				
		String bil100 = "billete de " + 100 + " euros"; 
		String bil50 = "billete de " + 50 + " euros"; 
		String bil20 = "billete de " + 20 + " euros"; 
		String bil10 = "billete de " + 10 + " euros"; 
		String bil5 = "billete de " + 5 + " euros"; 
		String mon2 = "moneda de " + 2 + " euros";
		String mon1 = "moneda de " + 1 + " euros";
				
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
			 
			bil = 100;
			bilQnt = change/bil;
			change = change%bil; 			
			mensaje = (bilQnt + " " + bil100);
			System.out.println(mensaje);
			
			bil = 50;
			bilQnt = change/bil;
			change = change%bil; 			
			mensaje = (bilQnt + " "  + bil50);
			System.out.println(mensaje);
			
			bil = 20;
			bilQnt = change/bil;
			change = change%bil; 			
			mensaje = (bilQnt + " "  + bil20);
			System.out.println(mensaje);
			
			bil = 10;
			bilQnt = change/bil;
			change = change%bil; 			
			mensaje = (bilQnt + " "  + bil10);
			System.out.println(mensaje);
			
			bil = 5;
			bilQnt = change/bil;
			change = change%bil; 			
			mensaje = (bilQnt + " "  + bil5);
			System.out.println(mensaje);
			
			bil = 2;
			bilQnt = change/bil;
			change = change%bil; 			
			mensaje = (bilQnt + " "  + mon2);
			System.out.println(mensaje);
			
			bil = 1;
			bilQnt = change/bil;			
			mensaje = (bilQnt + " "  + mon1);	
			System.out.println(mensaje);
			
	}	
}
	