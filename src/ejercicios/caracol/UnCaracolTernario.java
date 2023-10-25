package ejercicios.caracol;

import java.util.Scanner;

class UnCaracolTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputUsuario;

        double profundidadCaracol = (Math.random() * 10) + 10;
        int dia = 0;
        boolean estaDentro = true;
        boolean estaVivo = true;
        System.out.println("El dia [" + dia + "] el caracol cayo hasta [" + profundidadCaracol + "] m");

        double subidaMaxima = 4.0;
        double subidaMinima = 1.0;

        double bajadaMaxima = 2.0;
        double bajadaMinima = 0;

        final double PROBABILIDAD_COCHE = 0.35;

        double profundidadAgua = 20;

        while (estaDentro && estaVivo) {
            dia++;
            System.out.println("Dia " + dia);

            subidaMaxima = dia > 20 ? 2 : dia > 10 ? 3 : 4;

            double probabilidadClima = Math.random();
            profundidadAgua = profundidadAgua - (probabilidadClima < 0.05 ? 5 : probabilidadClima < 0.15 ? 2 : 0);
            System.out.println("La profundidad del agua es " + profundidadAgua);

            profundidadCaracol = profundidadCaracol > profundidadAgua ? profundidadAgua : profundidadCaracol;

            double caracolSube = Math.random() * (subidaMaxima - subidaMinima) + subidaMinima;
            System.out.println("El caracol sube: " + caracolSube);

            profundidadCaracol = profundidadCaracol - caracolSube;

            estaDentro = profundidadCaracol > 0 ? true : false;

            if (estaDentro) {
                double caracolBaja = Math.random() * (bajadaMaxima - bajadaMinima) + bajadaMinima;
                System.out.println("El caracol baja: " + caracolBaja);
                profundidadCaracol = profundidadCaracol + caracolBaja;

                boolean pasaCoche = Math.random() < PROBABILIDAD_COCHE ? true : false;
                if (pasaCoche) {
                    System.out.println("Pasa un coche");
                    profundidadCaracol = profundidadCaracol + 2;
                }
            }

            System.out.println("Al final del dia está en " + profundidadCaracol);
            inputUsuario = scanner.nextLine();

            estaVivo = dia >= 50 ? false : true;
        }

        String estadoCaracol = estaVivo ? "vivo" : "muerto";
        estadoCaracol = estadoCaracol + " y " + (estaDentro ? "dentro" : "fuera");

        System.out.println("La simulacion ha terminado");
        System.out.println("El caracol al final esta " + estadoCaracol);
    }
}