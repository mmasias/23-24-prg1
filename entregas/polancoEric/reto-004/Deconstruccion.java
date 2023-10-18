import java.util.Scanner;

public class Deconstruccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.print("Segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.print("Tercer numero: ");
        int numero3 = entrada.nextInt();

        
        int primerDigito = (numero1 / 100) % 10;  
        int segundoDigito = (numero2 / 10) % 10;   
        int tercerDigito = numero3 % 10;          

       
        int cuartoNumero = primerDigito * 100 + segundoDigito * 10 + tercerDigito;

       
        System.out.println("NUMERO " + cuartoNumero);

        entrada.close();
    }
}
