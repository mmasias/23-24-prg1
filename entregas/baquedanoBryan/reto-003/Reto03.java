import java.util.Scanner;
public class    Reto03{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta el precio del producto: ");
        int precio = scanner.nextInt();
        
        System.out.println("Inserta la cantidad con la que pagas: ");
        int pago = scanner.nextInt();

        int cambio = pago - precio;
        int billetes;
        String resultado;

        System.out.println("---------------------------------------");
        System.out.println("Tu cambio debería ser: " + cambio + "€" );
        System.out.println("                                        ");

        billetes = cambio / 100;
        cambio = cambio % 100;
        System.out.println( (resultado = (billetes > 0) ? "Se entregará tanta cantidad de 100: " + (Integer.toString(billetes)) : ""));
        
        billetes = cambio / 50;
        cambio = cambio % 50;
        System.out.println( (resultado = (billetes > 0) ? "Se entregará tanta cantidad de 50: " + (Integer.toString(billetes)) : ""));
        
        billetes = cambio / 20;
        cambio = cambio % 20;
        System.out.println( (resultado = (billetes > 0) ? "Se entregará tanta cantidad de 20: " + (Integer.toString(billetes)) : ""));
        
        billetes = cambio / 10;
        cambio = cambio % 10;
        System.out.println( (resultado = (billetes > 0) ? "Se entregará tanta cantidad de 10: " + (Integer.toString(billetes)) : ""));
        
        billetes = cambio / 5;
        cambio = cambio % 5;
        System.out.println( (resultado = (billetes > 0) ? "Se entregará tanta cantidad de 5: " + (Integer.toString(billetes)) : ""));
        
        billetes = cambio / 2;
        cambio = cambio % 2;
        System.out.println( (resultado = (billetes > 0) ? "Se entregará tanta cantidad de 2: " + (Integer.toString(billetes)) : ""));
        
        billetes = cambio / 1;
        cambio = cambio % 1;
        System.out.println( (resultado = (billetes > 0) ? "Se entregará tanta cantidad de 1: " + (Integer.toString(billetes)) : ""));

        scanner.close();
        
        
    }
}
