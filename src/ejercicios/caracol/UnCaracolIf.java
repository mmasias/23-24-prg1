package ejercicios.caracol;

import java.util.Scanner;

class UnCaracolIf {
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

            if (dia > 20) {
                subidaMaxima = 2;
            } else if (dia > 10) {
                subidaMaxima = 3;
            } else {
                subidaMaxima = 4;
            }

            double probabilidadClima = Math.random();
            if (probabilidadClima < 0.05) {
                profundidadAgua = profundidadAgua - 5;
            } else if (probabilidadClima < 0.15) {
                profundidadAgua = profundidadAgua - 2;
            }
            System.out.println("La profundidad del agua es " + profundidadAgua);

            if (profundidadCaracol > profundidadAgua) {
                profundidadCaracol = profundidadAgua;
            }

            double caracolSube = Math.random() * (subidaMaxima - subidaMinima) + subidaMinima;
            System.out.println("El caracol sube: " + caracolSube);

            profundidadCaracol = profundidadCaracol - caracolSube;

            if (profundidadCaracol > 0) {
                estaDentro = true;
            } else {
                estaDentro = false;
            }

            if (estaDentro) {
                double caracolBaja = Math.random() * (bajadaMaxima - bajadaMinima) + bajadaMinima;
                System.out.println("El caracol baja: " + caracolBaja);
                profundidadCaracol = profundidadCaracol + caracolBaja;

                double pasaCoche = Math.random();
                if (pasaCoche < PROBABILIDAD_COCHE) {
                    System.out.println("Pasa un coche");
                    profundidadCaracol = profundidadCaracol + 2;
                }
            }

            System.out.println("Al final del dia está en " + profundidadCaracol);
            inputUsuario = scanner.nextLine();

            if (dia >= 50) {
                estaVivo = false;
            } else {
                estaVivo = true;
            }
        }

        String estadoCaracol;

        if (estaVivo) {
            estadoCaracol = "vivo";
        } else {
            estadoCaracol = "muerto";
        }

        if (estaDentro) {
            estadoCaracol = estadoCaracol + " y dentro";
        } else {
            estadoCaracol = estadoCaracol + " y fuera";
        }

        System.out.println("La simulacion ha terminado");
        System.out.println("El caracol al final esta " + estadoCaracol);
    }
}
