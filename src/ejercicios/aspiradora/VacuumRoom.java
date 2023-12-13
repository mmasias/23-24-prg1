package ejercicios.aspiradora;

import java.util.Scanner;

public class VacuumRoom {
    static final int EJE_X = 0;
    static final int EJE_Y = 1;

    public static void main(String[] args) {

        int[][] office = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        int[] vacuumPosition = { 5, 10 };
        int movements = 0;

        boolean momSaysIsDirty = true;

        do {
            movements++;
            moveVacuum(vacuumPosition, office);
            cleanWorld(office, vacuumPosition);
            renderWorld(office, vacuumPosition, movements);
            momSaysIsDirty = calculateMugreLevel(office) == 0 ? false : true;
        } while (momSaysIsDirty);
    }

    private static int calculateMugreLevel(int[][] world) {

        int mugreLevel = 0;

        for (int ejeY = 0; ejeY < world.length; ejeY++) {
            for (int ejeX = 0; ejeX < world[ejeY].length; ejeX++) {
                mugreLevel = mugreLevel + world[ejeY][ejeX];
            }
        }
        return mugreLevel;
    }

    private static void cleanWorld(int[][] office, int[] vacuumPosition) {

        office[vacuumPosition[EJE_Y]][vacuumPosition[EJE_X]]--;

        if (office[vacuumPosition[EJE_Y]][vacuumPosition[EJE_X]] < 0) {
            office[vacuumPosition[EJE_Y]][vacuumPosition[EJE_X]] = 0;
        }
    }

    private static void moveVacuum(int[] vacuumPosition, int[][] office) {

        System.out.println("w/a/s/d");
        String movimiento = new Scanner(System.in).nextLine();

        if (movimiento.equalsIgnoreCase("w")) {
            vacuumPosition[EJE_Y]--;
        } else if (movimiento.equalsIgnoreCase("s")) {
            vacuumPosition[EJE_Y]++;
        } else if (movimiento.equalsIgnoreCase("a")) {
            vacuumPosition[EJE_X]--;
        } else if (movimiento.equalsIgnoreCase("d")) {
            vacuumPosition[EJE_X]++;
        }
    }

    static void renderWorld(int[][] world, int[] vacuumPosition, int movements) {
        final int VACUUM_TILE = 6;
        final int LINE_TILE = 7;
        cleanScreen();
        System.out.println(showTile(LINE_TILE).repeat(world[0].length));
        for (int row = 0; row < world.length; row++) {
            for (int column = 0; column < world[row].length; column++) {
                if (row == vacuumPosition[1] && column == vacuumPosition[0]) {
                    System.out.print(showTile(VACUUM_TILE));
                } else {
                    System.out.print(showTile(world[row][column]));
                }
            }
            System.out.println();
        }
        showStatus(world, vacuumPosition, movements);
    }

    static void showStatus(int[][] world, int[] vacuumPosition, int movements) {
        System.out.println("===".repeat(world[0].length));
        System.out.println("Mundo de [" + world[0].length + "]x[" + world.length + "]");
        System.out.print("Aspiradora en [" + vacuumPosition[0] + "][" + vacuumPosition[1] + "] / Pasos: " + movements);
        System.out.println("/ Suciedad detectada " + showTile(world[vacuumPosition[1]][vacuumPosition[0]]));
        System.out.println("Nivel de mugre:" + calculateMugreLevel(world));
        System.out.println("===".repeat(world[0].length));
    }

    static String showTile(int tile) {
        String[] tiles = { " . ", "...", "ooo", "OOO", "000", "***", "(O)", "---" };
        return tiles[tile];
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(int segundos) {
        try {
            Thread.sleep(500 * segundos);
        } catch (InterruptedException e) {
        }
    }

}
