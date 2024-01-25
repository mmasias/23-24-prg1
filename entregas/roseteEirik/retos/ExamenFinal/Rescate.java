package roseteEirik.retos.ExamenFinal;

class Rescate {
    public static void main(String[] args) {
        int[][] ocean = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
        };

        addSoldiers(ocean);
        printOcean(ocean);
        
    }

    static void addSoldiers(int[][] ocean) {
        
        final int MAX_SOLDIERS = 16;
        final double SOLDIER_PROBABILITY = 0.015625;
        int soldiersInTheOcean = 0;

        
        do {
            for (int row = 0; row < ocean.length; row++){
                for (int column = 0; column < ocean[row].length; column++){
                    if (Math.random() < SOLDIER_PROBABILITY && soldiersInTheOcean < MAX_SOLDIERS && ocean[row][column] != 1){
                        ocean[row][column] = 1;
                        soldiersInTheOcean++;
                    }
                }
            }
        } while (soldiersInTheOcean < MAX_SOLDIERS);
    }
    
    static void printOcean(int[][] ocean) {
        int howManySoldiers = 0;
        for (int row = 0; row < ocean.length; row++){
            for (int column = 0; column < ocean[row].length; column++){
                System.out.print(ocean[row][column] + " ");
                howManySoldiers = howManySoldiers + ocean[row][column];
            }
            System.out.println();
        }
        System.out.println(howManySoldiers);
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
