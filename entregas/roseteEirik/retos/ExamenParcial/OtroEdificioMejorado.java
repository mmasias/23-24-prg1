package roseteEirik.retos.ExamenParcial;

class OtroEdificioMejorado {
    public static void main(String[] args) {

        String message = "";
        String energyConsumed = "";
        int energyAverage = 0;
        
        final int DAYS_PER_WEEK = 7;
        
        for(int day = 1; day <= DAYS_PER_WEEK; day++){
            String noEnergyMessage = "";
            
            final int MAX_ROWS = 7;
            int row = 0;
            final int MAX_COLUMNS = 6;
            int column = 0;
            int stadistic = 0;
            
            boolean maintenanceProbability = Math.random() < 0.05;
            
            if(maintenanceProbability){
                row = (int)(Math.random()*(MAX_ROWS)+1);
                noEnergyMessage = "\nPlanta " + row + " en mantenimiento";
            }
            
            final int MAX_HOURS_DAY = 23;
            
            for(int hour = 0; hour <= MAX_HOURS_DAY; hour++){
                
                System.out.println(energyConsumed);
                pause(3);
                cleanScreen();
                          
                boolean lightningProbability = Math.random() < 0.20;
                
                if (column != 0){
                    lightningProbability = false;
                } else if(lightningProbability){
                    column = (int)(Math.random()*(MAX_COLUMNS)+1);
                    noEnergyMessage = noEnergyMessage + "\nUn rayo ha inutilizado la columna " + column;
                }
                
                int lightPerHour = 0;
                final int BOTTOM_FLOOR = 1;

                drawBuildingTop();
                for(int floor = 7; floor >= BOTTOM_FLOOR; floor--){

                    final int WINDOWS_PER_FLOOR = 6;

                    for (int window = 1; window <= WINDOWS_PER_FLOOR; window++){
                        boolean blindOpen = Math.random() < 0.70;
                        boolean lightOn = Math.random() < 0.60;
                        if(column == window){
                            System.out.print(":[X]:");
                        } else if (row == floor){
                            System.out.print(":[#]:");
                        } else {
                            if (lightOn){lightPerHour++;}
                            windowDraw(blindOpen, lightOn, lightningProbability);
                        }

                        boolean elevator = 3 == window % 6;
                        System.out.print(elevator ? "[    ]":"");
                    }
                    System.out.println(" - P" + floor);
                }
                drawBuildingBottom();
                System.out.println();

                stadistic = stadistic + lightPerHour;
                message = 
                    "Dia " + day + " - " + hour + ":00h - Consumo hora: " + lightPerHour + 
                    noEnergyMessage + 
                    "\nCONSUMOS: ";
                System.out.print(message);
            }
            energyAverage = energyAverage + stadistic;
            energyConsumed = energyConsumed + "D" + day + " " + stadistic + " | ";
        }
        energyAverage = energyAverage / DAYS_PER_WEEK;
        System.out.println(energyConsumed);
        System.out.println("Media de consumo semanal: " + energyAverage);

        pause(4);
        cleanScreen();
    }

    static void drawBuildingTop(){
        final String TOP = """
                         __/\\__
            |    |    |  |####|  |    |    |  
          ===================================="""; 
        System.out.println(TOP);
    }

    static void windowDraw(boolean blindOpen, boolean lightOn, boolean lightning){
        String windowDraw = ":[ ]:";
        
        if (blindOpen && lightOn){
            windowDraw = ":[*]:";
        } else if (blindOpen){
            windowDraw = ":[']:";
        }
        System.out.print(windowDraw);
    }

    static void drawBuildingBottom(){
        final String BOTTOM = """
        ------------------------------------
             ==========================
           ==============================
         =================================="""; 
        System.out.println(BOTTOM);
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