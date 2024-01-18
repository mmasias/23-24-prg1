package roseteEirik.retos.retoLimpieza;

class limpiezaOficina {
    public static void main(String[] args) {

        int rowVacuum = 9;
        int columnVacuum = 16;

        
        int[][] theOffice = {
            {0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5},
            {5,0,0,0,1,0,2,0,3,0,4,5,0,0,0,1,0,2,0,3,0,4,5,0,0,0,1,0,2,0,3,0,4},
            {4,0,5,0,0,0,1,0,2,0,3,4,0,5,0,0,0,1,0,2,0,3,4,0,5,0,0,0,1,0,2,0,3},
            {3,0,4,0,5,0,0,0,1,0,2,3,0,4,0,5,0,0,0,1,0,2,3,0,4,0,5,0,0,0,1,0,2},
            {2,0,3,0,4,0,5,0,0,0,1,2,0,3,0,4,0,5,0,0,0,1,2,0,3,0,4,0,5,0,0,0,1},
            {1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0},
            {0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5},
            {5,0,0,0,1,0,2,0,3,0,4,5,0,0,0,1,0,2,0,3,0,4,5,0,0,0,1,0,2,0,3,0,4},
            {4,0,5,0,0,0,1,0,2,0,3,4,0,5,0,0,0,1,0,2,0,3,4,0,5,0,0,0,1,0,2,0,3},
            {3,0,4,0,5,0,0,0,1,0,2,3,0,4,0,5,0,0,0,1,0,2,3,0,4,0,5,0,0,0,1,0,2},
            {2,0,3,0,4,0,5,0,0,0,1,2,0,3,0,4,0,5,0,0,0,1,2,0,3,0,4,0,5,0,0,0,1},
            {1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0},
            {0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5},
            {5,0,0,0,1,0,2,0,3,0,4,5,0,0,0,1,0,2,0,3,0,4,5,0,0,0,1,0,2,0,3,0,4},
            {4,0,5,0,0,0,1,0,2,0,3,4,0,5,0,0,0,1,0,2,0,3,4,0,5,0,0,0,1,0,2,0,3},
            {3,0,4,0,5,0,0,0,1,0,2,3,0,4,0,5,0,0,0,1,0,2,3,0,4,0,5,0,0,0,1,0,2},
            {2,0,3,0,4,0,5,0,0,0,1,2,0,3,0,4,0,5,0,0,0,1,2,0,3,0,4,0,5,0,0,0,1},
            {1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0,1,0,2,0,3,0,4,0,5,0,0},
        };
        
        for (int time = 1; time <= 20; time++){
            if(Math.random()<.20){rowVacuum = rowVacuum+((Math.random()<.50)?1:-1);}
            if(Math.random()<.70){columnVacuum = columnVacuum+((Math.random()<.50)?1:-1);}
            renderWorld(theOffice, rowVacuum, columnVacuum);
            showStatus(theOffice, rowVacuum, columnVacuum);
            System.out.println("Tiempo: " + time);
        }

    }

    private static void renderWorld(int[][] theOffice, int rowVacuum, int columnVacuum){
        final int VACUUM_TILE = 6;
        final int LINE_TILE = 7;
        
        pause(1);
        cleanScreen();
        System.out.println(showTile(LINE_TILE).repeat(theOffice[0].length + 2));
        for (int row = 0; row<theOffice.length; row ++){
            System.out.print("|| ");
            for (int column = 0; column<theOffice[row].length; column ++){
                if (row == rowVacuum && column == columnVacuum){
                    System.out.print(showTile(VACUUM_TILE));
                    theOffice[rowVacuum][columnVacuum] += theOffice[rowVacuum][columnVacuum] == 0 ? 0 : -1;
                } else {
                    System.out.print(showTile(theOffice[row][column]));
                }
            }
            System.out.print(" ||");
            System.out.println();
        }
    }
    
    private static void showStatus(int[][] theOffice, int rowVacuum, int columnVacuum) {
        final int LINE_TILE = 7;
        
        System.out.println(showTile(LINE_TILE).repeat(theOffice[0].length + 2));
        System.out.println("Mundo de ["+ theOffice.length +"]["+ theOffice[0].length +"]");
        System.out.println("Aspiradora en [" + rowVacuum + "][" + columnVacuum + "] | Suciedad detectada: " + showTile(theOffice[rowVacuum][columnVacuum]));
        System.out.println(showTile(LINE_TILE).repeat(theOffice[0].length + 2));
    }

    private static String showTile(int tile) {
        String[] tiles = {" . ","...","ooo","OOO","XXX","***","(0)", "==="}; 
        return tiles[tile];
    }
    
    private static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void pause(int segundos) {
        try {
            Thread.sleep(1000 * segundos);
        } catch (InterruptedException e) {
        }
    }
}
