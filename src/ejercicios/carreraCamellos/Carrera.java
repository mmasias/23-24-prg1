package ejercicios.carreraCamellos;

import java.util.Scanner;

class Carrera {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String entradaUsuario;
        boolean winner = false;
        int turno = 0;
        int posicionCamello = 0;
        int posicionCamelloOrdenador = 0;

        while (!winner) {
            turno++;
            posicionCamello = posicionCamello + calculaAvance("Juan");
            posicionCamelloOrdenador = posicionCamelloOrdenador + calculaAvance("Miguel");

            imprimeTablero(posicionCamello);
            imprimeTablero(posicionCamelloOrdenador);

            System.out.println("Turno " + turno + " Camello en " + posicionCamello);
            if (posicionCamello >= 60) {
                winner = true;
            }
        }
        System.out.println("Gano en el turno " + turno);

    }

    private static void imprimeTablero(int posicionCamello) {
        System.out.println("-".repeat(posicionCamello) + ",=,'");
    }

    private static int calculaAvance(String nombre) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(nombre + ": elige el agujero (1 a 4)");
        int agujeroElegido = entrada.nextInt();

        if (agujeroElegido == 1 && Math.random() < 0.6) {
            return 1;
        } else if (agujeroElegido == 2 && Math.random() < 0.4) {
            return 2;
        } else if (agujeroElegido == 3 && Math.random() < 0.3) {
            return 4;
        } else if (agujeroElegido == 4 && Math.random() < 0.1) {
            return 6;
        }
        return 0;
    }

}