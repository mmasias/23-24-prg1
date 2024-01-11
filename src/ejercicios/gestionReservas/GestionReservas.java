package ejercicios.gestionReservas;

import java.util.Scanner;

class GestionReservas {

    public static void main(String[] args) {

        int opcionElegida;
        boolean salirSistema = false;
        boolean[] estadoAulas = new boolean[6];
        String[] alumnoResponsable = new String[6];
        String[] alumnosAsistentes = new String[6];

        inicializarSistema(estadoAulas, alumnoResponsable, alumnosAsistentes);

        while (salirSistema != true) {

            opcionElegida = mostrarMenu();

            if (opcionElegida == 1) {
                mostrarEstado(estadoAulas, alumnoResponsable);
            } else if (opcionElegida == 2) {
                reservarAula(estadoAulas, alumnoResponsable, alumnosAsistentes);
            } else if (opcionElegida == 3) {
                liberarAulas(estadoAulas, alumnoResponsable, alumnosAsistentes);
            } else if (opcionElegida == 4) {
                System.out.println("Gracias por usar el Sistema de reservas de aulas");
                salirSistema = true;
            }
        }

    }

    private static void inicializarSistema(boolean[] estadoAulas, String[] alumnoResponsable, String[] alumnosAsistentes) {
        for (int i = 0; i < 6; i = i + 1) {
            estadoAulas[i] = true;
            alumnoResponsable[i] = "";
            alumnosAsistentes[i] = "";
        }
    }

    private static void liberarAulas(boolean[] estadoAulas, String[] alumnoResponsable, String[] alumnosAsistentes) {
        Scanner entrada = new Scanner(System.in);
        int aulaElegida;
        System.out.println("Aula a liberar (0 para salir de reserva):");
        aulaElegida = entrada.nextInt();
        if (aulaElegida != 0) {
            if (estadoAulas[aulaElegida - 1] == false) {
                estadoAulas[aulaElegida - 1] = true;
                alumnoResponsable[aulaElegida - 1] = "";
                alumnosAsistentes[aulaElegida - 1] = "";
                System.out.println("Aula " + aulaElegida + " liberada correctamente.");
            } else {
                System.out.println("El aula no estaba ocupada");
            }
        }

    }

    private static void reservarAula(boolean[] estadoAulas, String[] alumnoResponsable, String[] alumnosAsistentes) {
        Scanner entrada = new Scanner(System.in);
        int aulaElegida;
        System.out.println("Aula a reservar (0 para salir de reserva):");
        aulaElegida = entrada.nextInt();
        entrada.nextLine();
        if (aulaElegida != 0) {
            if (estadoAulas[aulaElegida - 1] == true) {
                estadoAulas[aulaElegida - 1] = false;
                System.out.println("Alumno responsable de la solicitud:");
                alumnoResponsable[aulaElegida - 1] = entrada.nextLine();
                System.out.println("Alumnos asistentes:");
                alumnosAsistentes[aulaElegida - 1] = entrada.nextLine();
                System.out.println("Aula " + aulaElegida + " reservada correctamente.");
            } else {
                System.out.println("El aula está ocupada");
            }
        }
    }

    private static void mostrarEstado(boolean[] estadoAulas, String[] alumnoResponsable) {
        String miEstadoAula;
        for (int i = 0; i < 6; i = i + 1) {
            if (estadoAulas[i]) {
                miEstadoAula = "Libre";
            } else {
                miEstadoAula = "Ocupada";
            }
            System.out.println("Aula " + i + ": " + miEstadoAula + " - " + alumnoResponsable[i]);
        }
    }

    static int mostrarMenu() {
        Scanner entrada = new Scanner(System.in);        
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Listar aulas");
        System.out.println("2 - Reservar un aula");
        System.out.println("3 - Liberar un aula");
        System.out.println("4 - Salir del sistema");
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese una opción");
        return entrada.nextInt();
    }

}