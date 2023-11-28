import java.util.Scanner;
public class Estaticos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        final int EDUCADO = 1;
        final int MALEDUCADO = 2;

        System.out.println("Dime como saludo (1:educado, 2:maleducado)");
        int modoSaludo = entrada.nextInt();

        if(modoSaludo==EDUCADO){
            saludaEducado("Manuel");
        } else {
            saludaMaleducado("Manuel");
        }

    }

    private static void saludaEducado(String nombre) {
        System.out.println("Muy buenos dias " + nombre);
    }

    private static void saludaMaleducado(String nombre) {
        System.out.println("Hola " + nombre + ", HP!");
    }
}
