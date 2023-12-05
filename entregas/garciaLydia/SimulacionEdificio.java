package entregas.garciaLydia;

import java.util.Random;

public class SimulacionEdificio {

    public static void main(String[] args) {
        int numPlantas = 7;
        int numHabitaciones = 6;
        int horasPorDia = 24;
        int diasSimulacion = 7;

        String[][] edificio = new String[numPlantas][numHabitaciones];
        Random rand = new Random();

        for (int dia = 1; dia <= diasSimulacion; dia++) {
            System.out.println("Día " + dia);

            for (int hora = 1; hora <= horasPorDia; hora++) {
                System.out.println("Hora " + hora + ":00h");
                for (int planta = numPlantas - 1; planta >= 0; planta--) {
                    for (int habitacion = 0; habitacion < numHabitaciones; habitacion++) {
                        boolean persianaAbierta = rand.nextDouble() < 0.7;
                        boolean luzEncendida = rand.nextDouble() < 0.6;

                        char estadoVentana = persianaAbierta ? '#' : ':';
                        char estadoFoco = luzEncendida ? '*' : ' ';

                        edificio[planta][habitacion] = "[" + estadoVentana + "]:" + "[" + estadoFoco + "]";
                    }
                    System.out.println(":" + String.join("::", edificio[planta]) + ": - P" + (planta + 1));
                }
                System.out.println("------------------------------------");
            }
            System.out.println("     ==========================");
        }
        System.out.println("   ==============================");
        System.out.println(" ==================================");
    }
}