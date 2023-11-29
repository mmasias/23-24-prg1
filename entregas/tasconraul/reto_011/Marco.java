package reto_011;

import java.util.Scanner;
public class Marco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            int dia = 0;
            boolean buscandoMadre = true;
            double distanciaMarcoMadre = 350;
            final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
            final double RALENTIZACION_LLUVIA_FUERTE = 0.25;
            final double RALENTIZACION_LLUVIA_FUERTE_MADRE = 0.5;
            final double PROBABILIDAD_LLUVIA_DEBIL = 0.4;
            final double RALENTIZACION_LLUVIA_DEBIL = 0.75;
            final double PROBABILIDAD_MONO_CANSADO = 0.25;
            final double RALENTIZACION_MONO_CANSADO = 0.1;
            final double PROBABILIDAD_MONO_ECAPADO = 0.15;
            final double RALENTIZACION_MONO_ECAPADO = -2; 
            do {
                dia++;
                System.out.println("Dia [" + dia + "]");

                double horasMarco = Math.random() * 2 + 8;
                double velocidadMarco = Math.random() * 5 + 10;
                double horasMadre = Math.random() * 3 + 6;
                double velocidadMadre = Math.random() * 3 + 6;

                double probabilidadLluviaMadre = Math.random();

                if (probabilidadLluviaMadre <= PROBABILIDAD_LLUVIA_FUERTE) {
                    System.out.println("LLUVIA FUERTE! de la Madre");
                    velocidadMadre = velocidadMadre * RALENTIZACION_LLUVIA_FUERTE_MADRE;
                } else if (probabilidadLluviaMadre <= PROBABILIDAD_LLUVIA_DEBIL) {
                    System.out.println("LLUVIA NORMAL de la Madre");
                    velocidadMadre = velocidadMadre * RALENTIZACION_LLUVIA_DEBIL;
                } else {
                    System.out.println("BUEN CLIMA de la Madre :) <3");
                }

                double probabilidadLluvia = Math.random();

                if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                    System.out.println("LLUVIA FUERTE! a Marco");
                    velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_FUERTE;
                } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_DEBIL) {
                    System.out.println("LLUVIA NORMAL a Marco");
                    velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_DEBIL;
                } else {
                    System.out.println("BUEN CLIMA a Marco :) <3.");
                }

                double probabilidadMonoCansa = Math.random();

                if (probabilidadMonoCansa <= PROBABILIDAD_MONO_CANSADO) {
                    System.out.println("¡Ho no el mono se a cansado, hay que llevarlo a cuestas!");
                    velocidadMarco = velocidadMarco * RALENTIZACION_MONO_CANSADO;
                }

                double probabilidadMonoEscapa = Math.random();
                if (probabilidadMonoEscapa <= PROBABILIDAD_MONO_ECAPADO) {
                    System.out.println("¡No puede ser el mono se ha escapado, hay que encontrarlo");
                    horasMarco = horasMarco + RALENTIZACION_MONO_ECAPADO;
                }

                double avanceMadre = velocidadMadre * horasMadre; 

                double avanceMarco = velocidadMarco * horasMarco;
                

                

                distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

                if (distanciaMarcoMadre <= 0) {
                    buscandoMadre = !buscandoMadre;
                }
                System.out.println("Hoy Marco avanzo [" + avanceMarco + " km]" );
                System.out.println(" Tiempo: [" + horasMarco + " Horas] Velocidad: [" + velocidadMarco + " Km/h]");
                System.out.println("Hoy la Mama de Marco avanzo [" + avanceMadre + " Km]" );
                System.out.println(" Tiempo: [" + horasMadre + " Horas] Velocidad: [" + velocidadMadre + " Km/h]");
                System.out.println("Se encuentran a [" + distanciaMarcoMadre + " Km] de distancia");
                System.out.println((buscandoMadre ? "No ha" : "Ha") + " encontrado a su madre");

                scanner.nextLine();

            } while (buscandoMadre);
        }
    }
}



