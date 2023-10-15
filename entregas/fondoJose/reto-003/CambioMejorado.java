import java.util.Scanner;

class CambioMejorado {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el precio del producto");
		int debe = scanner.nextInt();
		System.out.println("Ingresa el dinero a aportar");
		int entrega = scanner.nextInt();
		int tipoBillete;
		int billete;
		int porDevolver = entrega - debe;
		String mensaje = "";
		
		tipoBillete = 100;
		billete = porDevolver / tipoBillete;
		porDevolver = porDevolver % 100;
		mensaje = mensaje + ((billete > 0) ? billete + " billetes de " + tipoBillete + "\n": "");
		
		tipoBillete = 50;
		billete = porDevolver / tipoBillete;
		porDevolver = porDevolver % 50;
		mensaje = mensaje + ((billete > 0) ? billete + " billetes de " + tipoBillete + "\n": "");
		
		tipoBillete = 20;
		billete = porDevolver / tipoBillete;
		porDevolver = porDevolver % 20;
		mensaje = mensaje + ((billete > 0) ? billete + " billetes de " + tipoBillete + "\n": "");
		
		tipoBillete = 10;
		billete = porDevolver / tipoBillete;
		porDevolver = porDevolver % 10;
		mensaje = mensaje + ((billete > 0) ? billete + " billetes de " + tipoBillete + "\n": "");
		
		tipoBillete = 5;
		billete = porDevolver / tipoBillete;
		porDevolver = porDevolver % 5;
		mensaje = mensaje + ((billete > 0) ? billete + " billetes de " + tipoBillete + "\n": "");
		
		tipoBillete = 2;
		billete = porDevolver / tipoBillete;
		porDevolver = porDevolver % 2;
		mensaje = mensaje + ((billete > 0) ? billete + " billetes de " + tipoBillete + "\n": "");
		
		tipoBillete = 1;
		billete = porDevolver / tipoBillete;
		porDevolver = porDevolver % 1;
		mensaje = mensaje + ((billete > 0) ? billete + " billetes de " + tipoBillete + "\n": "");
		
		System.out.println("La cantidad de billetes a devolver son:" + "\n" + mensaje);
	}
}