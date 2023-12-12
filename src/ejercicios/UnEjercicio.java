package ejercicios;
public class UnEjercicio {
    public static void main(String[] args) {
        
        int[][] office = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,2,3,0,0,3,3,0,0,0,1,0,0,0,0,0,0,0},
            {0,0,1,2,3,0,3,3,3,0,0,0,2,0,0,0,0,0,0,0},
            {0,0,1,2,3,0,3,3,3,0,2,3,3,1,0,0,0,0,0,0},
            {0,0,1,2,3,0,3,3,3,0,0,2,4,1,0,0,0,0,0,0},
            {0,0,1,2,3,0,3,3,3,0,0,4,5,2,0,0,0,0,0,0},
            {0,0,1,2,3,0,0,0,2,1,4,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
    }; 
        int aspiradoraX = 6;
        int aspiradoraY = 10;
        
        for(int i=1;i<=20;i++){
            
            if(Math.random()<0.7) aspiradoraY=aspiradoraY+(Math.random()<0.5?1:-1);
            if(Math.random()<0.2) aspiradoraX=aspiradoraX+(Math.random()<0.5?1:-1);

            renderWorld(office, aspiradoraX, aspiradoraY);
            pause(1);
            System.out.println("Tiempo = "+i);
        }
        



    }
    private static void renderWorld(int[][] world, int xVacuum,int yVacuum) {
        final int VACUUM_TILE = 6;
        cleanScreen();
        for (int row=0; row<world.length; row++){
            for (int column=0; column<world[row].length; column++) {
                if (row==xVacuum && column==yVacuum) {
                    System.out.print(showTile(VACUUM_TILE));
                } else {
                    System.out.print(showTile(world[row][column]));
                }
            }
            System.out.println();
        }   
        System.out.println("Aspiradora en ["+xVacuum+"]["+yVacuum+"] / Suciedad detectada " + showTile(world[xVacuum][yVacuum]));
    }
    private static String showTile(int tile) {
        String[] tiles = {" . ","...","ooo","OOO","XXX","***","(O)"};
        return tiles[tile];
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }    

    static void pause(int segundos) {
        try {
            Thread.sleep(1000 * segundos);
        } catch (InterruptedException e) {
        }
    }

}
