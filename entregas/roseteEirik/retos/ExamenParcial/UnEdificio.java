package roseteEirik.retos.ExamenParcial;

class UnEdificio {
    public static void main(String[] args) {
        int hours = 0;
        int day = 1;
        int statistics = 0;
        boolean weekCompleted = false;

        final String INTRO = "\n";
        String message = "";

        do {
            hours++;
            if (dayCompleted(hours)){
                day++;
                hours = 0;
            }

            message = 
                drawBuildingTop() +
                drawBuilding() + INTRO +
                drawBuildingBottom() + INTRO + INTRO +
                "Dia " + day + " - " + hours + ":00h - Consumido: ";
            System.out.println(message);
            
            pause(5);
            cleanScreen();
            
            weekCompleted = 0 == (day / 8) - 1;
        } while (!weekCompleted);
    }

    static boolean dayCompleted(int hours){
        if (0 == hours % 24){
            return true;
        } else {
            return false;
        }
    }

    static boolean openWindowBlind(){
        final double OPEN_BLIND_PROBABILITY = 0.7;
        double openBlind = Math.random();

        if (openBlind < OPEN_BLIND_PROBABILITY){
            return true;
        } else {
            return false;
        }
    }

    static boolean lightOn(){
        final double LIGHT_ON_PROBABILITY = 0.6;
        double lightOn = Math.random();

        if (lightOn < LIGHT_ON_PROBABILITY){
            return true;
        } else {
            return false;
        }        
    }

    static String drawBuildingTop(){
        final String TOP = """
                         __/\\__
            |    |    |  |####|  |    |    |  
          ===================================="""; 
        return TOP;
    }

    static String drawBuilding(){

        final int MAX_ROWS = 7;
        final int MAX_COLUMNS = 6;

        final String INTRO = "\n";

        final String CLOSED_WINDOW = ":[ ]:";
        final String LIGHT_ON = ":[']:";
        final String LIGHT_OFF = ":[*]:";
        final String ELEVATOR = "[    ]";

        String draw = "";
        int position = 0;
        
        for (int totalRows = 0; totalRows < MAX_ROWS; totalRows++){
            draw = draw + INTRO;
            for (int totalColumns = 0; totalColumns < MAX_COLUMNS; totalColumns++){
                position++;
                if (openWindowBlind()){
                    if (lightOn()){
                        draw = draw + LIGHT_ON;
                    } else {
                        draw = draw + LIGHT_OFF;
                    }
                } else {
                    draw = draw + CLOSED_WINDOW;
                }

                if (0 == position % 3 && 0 != position % 6){
                    draw = draw + ELEVATOR;
                }
            }
        }
        return draw;
    }

    static String drawBuildingBottom(){
        final String BOTTOM = """
        ------------------------------------
             ==========================
           ==============================
         =================================="""; 
        return BOTTOM;
    }

    static void pause(int segundos) {
        try {
            Thread.sleep(1000 * segundos);
        } catch (InterruptedException e) {
        }
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}