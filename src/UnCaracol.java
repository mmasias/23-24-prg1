import java.util.Scanner;
class UnCaracol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputUsuario;

        double profundidadCaracol = (int) (Math.random() * 10) + 10;
        int dia = 0;
        boolean estaDentro = true;
        boolean estaVivo = true;
        System.out.println("El dia [" + dia + "] el caracol cayo hasta [" + profundidadCaracol + "] m");

        double subidaMaxima = 4.0;
        double subidaMinima = 1.0;

        double bajadaMaxima = 2.0;
        double bajadaMinima = 0;

        while (estaDentro && estaVivo) {
            dia++;
            System.out.println("Dia " + dia);

            double caracolSube = Math.random() * (subidaMaxima - subidaMinima) + subidaMinima;
            System.out.println("El caracol sube: " + caracolSube);

            profundidadCaracol = profundidadCaracol - caracolSube;

            if (profundidadCaracol < 0) {
                estaDentro = false;
            }

            double caracolBaja = Math.random() * (bajadaMaxima - bajadaMinima) + bajadaMinima;
            System.out.println("El caracol baja: " + caracolBaja);
            profundidadCaracol = profundidadCaracol + caracolBaja;

            System.out.println("Al final del dia está en " + profundidadCaracol);
            inputUsuario = scanner.nextLine();

            if (dia >= 50) {
                estaVivo = false;
            }
        }

        String estadoCaracol = estaVivo ? "vivo" : "muerto";
        estadoCaracol = estadoCaracol + " y " + (estaDentro ? "dentro" : "fuera");
        
        System.out.println("La simulacion ha terminado");
        System.out.println("El caracol al final esta " + estadoCaracol);

    }
}