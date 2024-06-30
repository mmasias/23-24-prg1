package entregas.alejandroAteca.examenParcial;

public class examenEdificio {

  public static void main(String[] args) {
    final String WINDOW_CLOSED = ":[ ]:";
    final String WINDOW_CLOSED_ON = ":[ ]:";
    final String WINDOW_DAMAGED = ":[X]:";
    final String WINDOW_UNDER_MAINTENANCE = ":[0]:";
    final String WINDOW_OPENED_ON = ":[*]:";
    final String WINDOW_OPENED_OFF = ":[º]:";
    final String CENTRAL_GAP = "[    ]";

    int thunderLanding;
    int maintenanceFloor;

    for (int day = 1; day <= 7; day++) {
      int daylights = 0;

      for (int hour = 0; hour <= 23; hour++) {
        clearScreen();

        System.out.println("Día: " + day + ", Hora: " + hour + ":00");

        int hourLights = 0;
        boolean raining = Math.random() < 0.4;
        boolean thunder = Math.random() < 0.2;
        boolean maintenance = Math.random() < 0.05;

        printCeiling();

        thunderLanding = (int) (Math.random() * 6) + 1;
        maintenanceFloor = (int) (Math.random() * 6) + 1;

        for (int floor = 7; floor >= 1; floor--) {
          for (int room = 1; room < 8; room++) {
            if (room == thunderLanding && raining && thunder && room != 8 / 2) {
              System.out.print(WINDOW_DAMAGED);
            } else if (room == 8 / 2) {
              System.out.print(CENTRAL_GAP);
            } else if (
              floor == maintenanceFloor && maintenance && room != 8 / 2
            ) {
              System.out.print(WINDOW_UNDER_MAINTENANCE);
            } else {
              boolean lightOn = Math.random() < 0.5;
              boolean windowOpened = Math.random() < 0.5;
              String windowState =
                (lightOn ? (windowOpened ? WINDOW_OPENED_ON : WINDOW_CLOSED_ON) : (windowOpened ? WINDOW_OPENED_OFF : WINDOW_CLOSED));

              System.out.print(windowState);

              if (
                windowState.equals(WINDOW_OPENED_ON) || windowState.equals(WINDOW_CLOSED_ON)) {
                hourLights++;
              }
            }
          }

          System.out.println();
        }

        printBasement();

        System.out.println("El consumo por hora es de: " + hourLights);

        pause(3);

        daylights = daylights + hourLights;
      }

      System.out.println("El consumo total del día ha sido de: " + daylights);
    }
  }

  static void printCeiling() {
    final String TIP = "     ".repeat(3) + "__/\\__";
    final String HEADER = "|####|";
    final String ANTENNA = "  |  ";
    final String ROOF = "=".repeat(36);

    System.out.println(TIP);
    System.out.println(ANTENNA.repeat(3) + HEADER + ANTENNA.repeat(3));
    System.out.println(ROOF);
  }

  static void printBasement() {
    System.out.println(
      """
                            :[       ]::::|      |::::[       ]:
                            ------------------------------------
                                 ==========================
                               ==============================
                             ==================================
                            """
    );
  }

  static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  static void pause(int seconds) {
    try {
      Thread.sleep(1000 * seconds);
    } catch (InterruptedException e) {}
  }
}
