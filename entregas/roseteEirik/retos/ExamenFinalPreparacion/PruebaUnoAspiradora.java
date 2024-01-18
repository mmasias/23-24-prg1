package roseteEirik.retos.ExamenFinalPreparacion;

class PruebaUnoAspiradora {
    public static void main(String[] args) {

        int[][] surface = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,}
        };

        int vacuumPosition[] = { 0, 0 };
        contaminate(surface);
        
        do {
            moveVacuum(vacuumPosition, surface);
            
            printSurface(surface);
            totalDirt(surface);
            pause(0.5);
        } while (isDirty(surface));

    }

    static void moveVacuum(int[] vacuumPosition, int[][] surface) {

    }

    static void printSurface(int[][] surface) {
        cleanScreen();
        System.out.println("+" + "---".repeat(surface[0].length) + "+");
        for (int row = 0; row < surface.length; row++){
            System.out.print("|");
            for (int column = 0; column < surface[row].length; column++){
                System.out.print(drawDirtiness(surface[row][column]));
            }
            System.out.println("|");
        }
        System.out.println("+" + "---".repeat(surface[0].length) + "+");
    }

    static String drawDirtiness(int value) {

        String[] draw = {" . ","...","ooo","OOO","***"};

        return draw[value];
    }

    static boolean isDirty(int[][] surface) {

        for (int row = 0; row < surface.length; row++){
            for (int column = 0; column < surface[row].length; column++){
                if (surface[row][column] != 0){
                    return true;
                }
            }
        }

        return false;
    }

    static void contaminate(int[][] surface) {
        for (int row = 0; row < surface.length; row++){
            for (int column = 0; column < surface[row].length; column++){ 
                surface[row][column] = Math.random() < 0.6 ? 0 : (int) (Math.random()*4) + 1;
            }
        }
    }

    static void totalDirt(int[][] surface){

        int totalDirt = 0;
    
        for (int row = 0; row < surface.length; row++){
            for (int column = 0; column < surface[row].length; column++){
                totalDirt = totalDirt + surface[row][column];
            }
        }

        System.out.print(totalDirt);;

    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(double seconds) {
        try {
            Thread.sleep((int) (1000 * seconds));
        } catch (InterruptedException e) {
        }
    }
}

