import java.util.Scanner;
public class Reto05{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Este es un programa que te compara 2 números, y te dice si es mayor, menor o igual");
        System.out.println("                                                                                  ");
        System.out.println("Porfavor, ingresa el primer número: ");
        System.out.println("----------------------------------------------------------------------------------");
        int numero1 = scanner.nextInt();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Porfavor, ingresa el segundo número: ");
        System.out.println("----------------------------------------------------------------------------------");
        int numero2 = scanner.nextInt();
        System.out.println("----------------------------------------------------------------------------------");
        
        String mensaje = (numero1>numero2) ? numero1 + " Es el número mayor" : (numero1<numero2) ? numero2 + " Es el número mayor" : numero1 + " y " + numero2 + " Son iguales";
        System.out.println(mensaje);


        scanner.close();
        
        
    }
}
