package entregas.garciaLydia.reto007;
import java.util.Scanner;

public class CaracolClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputUsuario;
        int profundidadCaracol = (int) (Math.random() * (11) + 10);
        int dia = 0;
        boolean estaDentro = true;
        boolean estaVvivo = true;
        System.out.println("El dia [" + dia + "] el caracol cayó hasya [" + profundidadCaracol + "] metros de profundidad");

        double subidaMaxima = 4.0;
        double subidaMinima = 1.0;
        while (estaDentro && estaVvivo){
            dia ++;
            System.out.println("Dia " + dia);
            inputUsuario = scanner.nextLine();


            if (dia == 50 ){
                estaVvivo = false;
                System.out.println("El caracol ha muerto");
            }
        }
        System.out.println("La simulacion ha terminado");
        String estadoCaracol;


        }

}

