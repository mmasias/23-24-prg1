package roseteEirik.retos.ExamenParcial;

class OtroEdificio {
    public static void main(String[] args) {

        String message = "";
        String energyConsumed = "";
        int energyAverage = 0;
        
        for(int day = 1; day <= 7; day++){
            String noEnergyMessage = "";
            int column = 0;
            int row = 0;
            int stadistic = 0;

            boolean maintenance = Math.random() < 0.05;

            if(maintenance){
                row = (int)(Math.random()*(7)+1);
                noEnergyMessage = "\nPlanta " + row + " en mantenimiento";
            }

            for(int hour = 0; hour <= 23; hour++){
                
                System.out.println(energyConsumed);
                pause(3);
                cleanScreen();
                          
                boolean lightning = Math.random() < 0.20;
                
                if (column != 0){
                    lightning = false;
                } else if(lightning){
                    column = (int)(Math.random()*(6)+1);
                    noEnergyMessage = noEnergyMessage + "\nUn rayo ha inutilizado la columna " + column;
                }
                
                int lightPerHour = 0;
                drawBuildingTop();
                for(int floor = 7; floor >= 1; floor--){

                    for (int window = 1; window <= 6; window++){
                        boolean blindOpen = Math.random() < 0.70;
                        boolean lightOn = Math.random() < 0.60;
                        if(column == window){
                            System.out.print(":[X]:");
                        } else if (row == floor){
                            System.out.print(":[#]:");
                        } else {
                            if (lightOn){lightPerHour++;}
                            windowDraw(blindOpen, lightOn, lightning);
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
        energyAverage = energyAverage / 7;
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