package roseteEirik.retos.retoLimpieza;

class limpiezaOficina {
    public static void main(String[] args) {
        
        int[][] theOffice = {
            {0,0,1,0,2,0,3,0,4,0,5},
            {5,0,0,0,1,0,2,0,3,0,4},
            {4,0,5,0,0,0,1,0,2,0,3},
            {3,0,4,0,5,0,0,0,1,0,2},
            {2,0,3,0,4,0,5,0,0,0,1},
            {1,0,2,0,3,0,4,0,5,0,0},
        };

        renderWorld(theOffice);

    }

    private static void renderWorld(int[][] theOffice){
        cleanScreen();
        for (int row = 0; row<theOffice.length; row ++){
            for (int column = 0; column<theOffice[row].length; column ++){
                System.out.print(showTile(theOffice[row][column]));
            }
            System.out.println();
        }
    }

    private static String showTile(int tile) {
        String[] tiles = {" . ","...","ooo","OOO","XXX","***",}; 
        return tiles[tile];
    }

    private static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
