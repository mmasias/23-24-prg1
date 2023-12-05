import java.util.Random;

public class ParcialResueltoPrg {

  static final int NUM_PLANTAS = 8;
  static final int NUM_HABITACIONES = 6;

  static boolean[][] persianas = new boolean[NUM_PLANTAS][NUM_HABITACIONES];
  static boolean[][] luces = new boolean[NUM_PLANTAS][NUM_HABITACIONES];

  static int[] consumoPorHora = new int[24];
  static int[] consumoPorDia = new int[7];

  static Random random = new Random();

  public static void main(String[] args) {
    simularSemana();
    mostrarResultados();
  }

  static void simularSemana() {
    for (int dia = 1; dia <= 7; dia++) {
      simularDia(dia);
    }
  }

  static void simularDia(int dia) {
    boolean lluvia = random.nextDouble() < 0.2;

    for (int hora = 0; hora < 24; hora++) {
      simularHora(hora, lluvia);
      consumoPorHora[hora] += contarLucesEncendidas();
    }

    consumoPorDia[dia - 1] = sumarConsumoDiario();
  }

  static void simularHora(int hora, boolean lluvia) {
    for (int planta = 0; planta < NUM_PLANTAS; planta++) {
      for (int habitacion = 0; habitacion < NUM_HABITACIONES; habitacion++) {
        simularVentana(planta, habitacion, lluvia);
        simularLuz(planta, habitacion);
      }
    }

    if (lluvia) {
      int columnaAveriada = random.nextInt(NUM_HABITACIONES);
      inutilizarColumna(columnaAveriada);
    }

    int plantaMantenimiento = random.nextInt(NUM_PLANTAS);
    if (random.nextDouble() < 0.05) {
      ponerEnMantenimiento(plantaMantenimiento);
    }
  }

  static void simularVentana(int planta, int habitacion, boolean lluvia) {
    if (lluvia) {
      persianas[planta][habitacion] = false; // Si llueve, las persianas están abiertas.
    } else {
      persianas[planta][habitacion] = random.nextDouble() < 0.7;
    }
  }

  static void simularLuz(int planta, int habitacion) {
    luces[planta][habitacion] = random.nextDouble() < 0.6;
  }

  static void inutilizarColumna(int columna) {
    for (int planta = 0; planta < NUM_PLANTAS; planta++) {
      persianas[planta][columna] = false;
      luces[planta][columna] = false;
    }
  }

  static void ponerEnMantenimiento(int planta) {
    for (int habitacion = 0; habitacion < NUM_HABITACIONES; habitacion++) {
      persianas[planta][habitacion] = false;
      luces[planta][habitacion] = false;
    }
  }

  static int contarLucesEncendidas() {
    int contador = 0;
    for (int planta = 0; planta < NUM_PLANTAS; planta++) {
      for (int habitacion = 0; habitacion < NUM_HABITACIONES; habitacion++) {
        if (luces[planta][habitacion]) {
          contador++;
        }
      }
    }
    return contador;
  }

  static int sumarConsumoDiario() {
    int suma = 0;
    for (int hora : consumoPorHora) {
      suma += hora;
    }
    return suma;
  }

  static void mostrarResultados() {
    mostrarEdificio();
    mostrarConsumoPorDia();
  }

  static void mostrarEdificio() {
    System.out.println("               __/\\__");
    System.out.println("  |    |    |  |####|  |    |    |");
    System.out.println("====================================");

    for (int planta = NUM_PLANTAS - 1; planta >= 0; planta--) {
      for (int habitacion = 0; habitacion < NUM_HABITACIONES; habitacion++) {
        char ventana = persianas[planta][habitacion] ? '*' : 'º';
        char luz = luces[planta][habitacion] ? '*' : ' ';
        System.out.print("[" + ventana + "]:" + "[" + luz + "]");
      }
      System.out.println(": - P" + (planta + 1));
    }

    System.out.println("------------------------------------");
    System.out.println("     ==========================");
    System.out.println("   ==============================");
    System.out.println(" ===============================");
  }

  static void mostrarConsumoPorDia() {
    int totalConsumoSemanal = 0;

    System.out.println("\nCONSUMOS:");

    for (int dia = 1; dia <= 7; dia++) {
      System.out.print("D" + dia + ": " + consumoPorDia[dia - 1] + " | ");
      totalConsumoSemanal += consumoPorDia[dia - 1];
    }

    double mediaConsumoSemanal = totalConsumoSemanal / 7.0;
    System.out.println("\n\nMedia de consumo semanal: " + mediaConsumoSemanal);
  }
}
