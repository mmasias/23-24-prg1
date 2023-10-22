import java.util.Scanner;
public class Reto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================================");
        System.out.println("Ingrese el numero del que se tomara la Primera cifra (Posicion A de ABC) ");
        int PrimerNumero = scanner.nextInt();

        System.out.println("========================================================");
        System.out.println("Ingrese el numero del que se tomara la Segunda cifra (Posicion  B de ABC) ");
        int SegundoNumero = scanner.nextInt();

        System.out.println("========================================================");
        System.out.println("Ingrese el numero del que se tomara la Tercera cifra (Posicion C de ABC) ");
        int TercerNumero = scanner.nextInt();

        System.out.println("========================================================");
        int PosicionA = PrimerNumero / 100;
        int PosicionB = (SegundoNumero/10) % 10;
        int PosicionC = TercerNumero % 10;

        System.out.println("La primera Cifra o Posicion A seria: " + PosicionA);
        System.out.println("La segunda Cifra o Posicion B  seria: " + PosicionB);
        System.out.println("La tercera Cifra o Posicion C seria: " + PosicionC);
        System.out.println("========================================================");

        int NumeroABC = (PosicionA*100) + (PosicionB*10) +PosicionC;

        System.out.println("El numero compuesto seria: " + NumeroABC);
        System.out.println("========================================================");

        scanner.close();

    }
    
}
