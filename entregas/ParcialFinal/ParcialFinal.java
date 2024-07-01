package entregas.ParcialFinal;


import java.util.Random;
import java.util.Scanner;

public class ParcialFinal {
    public static void main(String[] args) {
        System.out.println("Significado de los símbolos:");
        System.out.println("#: Ventana cerrada");
        System.out.println("º: Luz apagada");
        System.out.println("*: Luz encendida");
        System.out.println("[ ]: Persiana abierta");
        System.out.println("[:]: Separador utilizado para dar formato a la ventana abierta");
        System.out.println("::: Separador utilizado para dar formato a los elementos individuales de una habitación");
        System.out.println();

        String[] hotelOriginal = {
                """
               __/\\__
  |    |    |  |####|  |    |    |
====================================
:[º]::[*]::[X]:[    ]:[º]::[*]::[º]: - P7
:[º]::[º]::[X]:[    ]:[ ]::[ ]::[º]: - P6
:[#]::[#]::[X]:[    ]:[#]::[#]::[#]: - P5
:[*]::[*]::[X]:[    ]:[*]::[*]::[ ]: - P4
:[º]::[ ]::[X]:[    ]:[ ]::[*]::[*]: - P3
:[º]::[ ]::[X]:[    ]:[ ]::[*]::[*]: - P2
:[*]::[ ]::[X]:[    ]:[*]::[º]::[*]: - P1
------------------------------------
     ==========================
   ==============================
 ==================================
""",
        };

        int numPlantas = 7;
        int numHabitaciones = 6;
        int horasPorDia = 24;
        int diasSimulacion = 7;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] consumosDiarios = new int[diasSimulacion];

        for (int dia = 1; dia <= diasSimulacion; dia++) {
            System.out.println("Día " + dia);

            imprimirEdificio(hotelOriginal);

            int consumoTotalDiario = 0;

            boolean rayoInutilizoColumna = false;
            int plantaEnMantenimiento = -1;

            for (int hora = 1; hora <= horasPorDia; hora++) {
                System.out.println("Hora " + hora + ":00h");

                if (!rayoInutilizoColumna && rand.nextDouble() < 0.2) {
                    int columnaAfectada = rand.nextInt(numHabitaciones);
                    System.out.println("Un rayo ha inutilizado la columna " + (columnaAfectada + 1));
                    rayoInutilizoColumna = true;
                }

                if (plantaEnMantenimiento == -1 && rand.nextDouble() < 0.05) {
                    plantaEnMantenimiento = rand.nextInt(numPlantas);
                    System.out.println((plantaEnMantenimiento + 1) + "º planta en mantenimiento");
                }

                int consumoHora = actualizarConsumo(numPlantas, numHabitaciones, rayoInutilizoColumna, plantaEnMantenimiento);

                consumoTotalDiario += consumoHora;
                System.out.println("Consumo hora: " + consumoHora);
                System.out.print("Presiona Enter para avanzar a la siguiente hora...");
                scanner.nextLine();

                imprimirEdificio(hotelOriginal);
            }

            consumosDiarios[dia - 1] = consumoTotalDiario;

            System.out.println("CONSUMOS: D1: " + consumosDiarios[0] + " | D2: " + consumosDiarios[1] +
                    " | D3: " + consumosDiarios[2] + " | D4: " + consumosDiarios[3] +
                    " | D5: " + consumosDiarios[4] + " | D6: " + consumosDiarios[5] +
                    " | D7: " + consumosDiarios[6]);
        }

        int sumaConsumos = 0;
        for (int consumoDiario : consumosDiarios) {
            sumaConsumos += consumoDiario;
        }

        int mediaConsumoSemanal = sumaConsumos / diasSimulacion;

        System.out.println("\nMedia de consumo semanal: " + mediaConsumoSemanal);

        scanner.close();
    }

    private static void imprimirEdificio(String[] hotel) {
        for (String line : hotel) {
            System.out.println(line);
        }
        System.out.println();
    }

    private static int actualizarConsumo(int numPlantas, int numHabitaciones, boolean rayoInutilizoColumna, int plantaEnMantenimiento) {
        Random rand = new Random();
        int consumoHora = 0;

        for (int planta = 0; planta < numPlantas; planta++) {
            for (int habitacion = 0; habitacion < numHabitaciones; habitacion++) {
                boolean luzEncendida = rand.nextDouble() < 0.6;

                if (luzEncendida) {
                    consumoHora++;
                }
            }
        }

        if (rayoInutilizoColumna) {
            consumoHora -= numPlantas;
        }

        if (plantaEnMantenimiento != -1) {
            consumoHora -= numHabitaciones;
        }

        return consumoHora;
    }
}

