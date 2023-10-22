import java.util.Scanner;
public class  DeconstruccionDeUnNumero {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
          System.out.print("Ingresa el valor del primer numero : ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingresa el valor del segundo numero: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Ingresa el valor del tercer numero: ");
        int tercerNumero = scanner.nextInt();



        int centenas = primerNumero / 100;
		int decenas = (segundoNumero / 10) % 10;
		int unidades = tercerNumero % 10;

          System.out.println ("El numero es: " + centenas + decenas + unidades);

        		scanner.close();
	}
}

