package ejercicios.aspiradora;

public class VacuumRomm {
    public static void main(String[] args) {

        int[][] office = {
                { 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 2, 3, 0, 0, 3, 3, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 2, 3, 0, 3, 3, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 2, 3, 0, 3, 3, 3, 0, 2, 3, 3, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 2, 3, 0, 3, 3, 3, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 2, 3, 0, 3, 3, 3, 0, 0, 4, 5, 2, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 2, 3, 0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        int aspiradoraX = office[0].length/2;
        int aspiradoraY = office.length/2;

        for (int i = 1; i <= 40; i++) {

            if(Math.random()<0.5) aspiradoraY=aspiradoraY+(Math.random()<0.5?1:-1);
            if(Math.random()<0.5) aspiradoraX=aspiradoraX+(Math.random()<0.5?1:-1);

            renderWorld(office, aspiradoraX, aspiradoraY);
            pause(1);
            System.out.println("Tiempo = " + i);
        }
    }

    static void renderWorld(int[][] world, int xVacuum, int yVacuum) {
        final int VACUUM_TILE = 6;
        cleanScreen();
        System.out.println("===".repeat(world[0].length));
        for (int row = 0; row < world.length; row++) {
            for (int column = 0; column < world[row].length; column++) {
                if (row == yVacuum && column == xVacuum) {
                    System.out.print(showTile(VACUUM_TILE));
                } else {
                    System.out.print(showTile(world[row][column]));
                }
            }
            System.out.println();
        }
        showStatus(world, xVacuum, yVacuum);
    }

    private static void showStatus(int[][] world, int xVacuum, int yVacuum) {
        System.out.println("===".repeat(world[0].length));
        System.out.println("Mundo de ["+world[0].length+"]x["+world.length+"]");
        System.out.print("Aspiradora en [" + xVacuum + "][" + yVacuum + "] ");
        System.out.println("/ Suciedad detectada "       + showTile(world[yVacuum][xVacuum]));
        System.out.println("===".repeat(world[0].length));        
    }

    static String showTile(int tile) {
        String[] tiles = { " . ", "...", "ooo", "OOO", "XXX", "***", "(O)" };
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
