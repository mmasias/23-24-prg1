package roseteEirik.retos.ExamenParcial;

class OtroEdificioMejorado{
    public static void main(String[] args) {

        String message = "";
        String energyConsumed = "";
        int energyAverage = 0;

        final int DAYS_PER_WEEK = 7;
        for(int day = 1; day <= DAYS_PER_WEEK; day++){
            String noEnergyMessage = "";

            final int WINDOWS_PER_FLOOR = 6;
            int damagedColumn = 0;
            final int TOTAL_BUILDING_FLOORS = 7;
            int floorUnderMaintenance = 0;
            
            int stadistic = 0;
            
            for(int hour = 0; hour <= 23; hour++){
                
                System.out.println(energyConsumed);
                pause(3);
                cleanScreen();
                
                final double LIGHTNING_STRIKE_PROBABILITY = 0.20;
                boolean lightning = Math.random() < LIGHTNING_STRIKE_PROBABILITY;
                if (damagedColumn != 0){
                    lightning = false;
                } else if(lightning){
                    damagedColumn = (int)(Math.random()*(WINDOWS_PER_FLOOR)+1);
                    noEnergyMessage = "\nUn rayo ha inutilizado la columna " + damagedColumn;
                }
                
                final double MAINTENANCE_PROBABILITY = 0.05;
                boolean maintenance = Math.random() < MAINTENANCE_PROBABILITY;
                if (floorUnderMaintenance != 0){
                    maintenance = false;
                } else if(maintenance){
                    floorUnderMaintenance = (int)(Math.random()*(TOTAL_BUILDING_FLOORS)+1);
                    noEnergyMessage = noEnergyMessage + "\nPlanta " + floorUnderMaintenance + " en mantenimiento";
                }
                
                int lightPerHour = 0;
                drawBuildingTop();
                for(int floor = TOTAL_BUILDING_FLOORS; floor >= 1; floor--){
                    
                    for (int window = 1; window <= WINDOWS_PER_FLOOR; window++){

                        final double BLIND_OPEN_PROBABILITY = 0.70;
                        boolean blindOpen = Math.random() < BLIND_OPEN_PROBABILITY;

                        final double LIGHT_ON_PROBABILITY = 0.60;
                        boolean lightOn = Math.random() < LIGHT_ON_PROBABILITY;

                        boolean windowDamagedLight = window == damagedColumn;
                        boolean windowUnderMaintenance = floor == floorUnderMaintenance;

                        if(!(windowDamagedLight || windowUnderMaintenance)){
                            if (lightOn){lightPerHour++;}
                        }
                        
                        windowDraw(blindOpen, lightOn, windowDamagedLight, windowUnderMaintenance);

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

    static void windowDraw(boolean blindOpen, boolean lightOn, boolean windowDamagedLight, boolean windowUnderMaintenance){
        String windowDraw = ":[ ]:";
        
        if (windowUnderMaintenance){
            windowDraw = ":[#]:";
        } else if (windowDamagedLight){
            windowDraw = ":[X]:";
        } else if (blindOpen && lightOn){
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
