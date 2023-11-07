package roseteEirik.retoMarco;
import java.util.Scanner;

class HistoriaDeMarco{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String inputUser;

        int day = 0;
        boolean motherNotFound = true;
        double distanceMotherMarco = 350;

        final double STRONG_RAIN_PROBABILITY = 0.1;
        final double NORMAL_RAIN_PROBABILITY = 0.4;
        final double TIRED_MONKEY_PROBABILITY = 0.25;
        final double ESCAPE_MONKEY_PROBABILITY = 0.15;

        final double NORMAL_RAIN_SLOW_DOWN = 0.75;
        final double STRONG_RAIN_SLOW_DOWN = 0.25;
        final double TIRED_MONKEY_SLOW_DOWN = 0.1;
        final double ESCAPE_MONKEY_SLOW_DOWN = - 2;

        do {

            day++;

            System.out.println("Dia [" + day +"]");

            double marcusSpeed = Math.random() * 5 + 10;
            double marcusHours = Math.random() * 2 + 8;

            double monkeyPhysicalCondition = Math.random();
            double monkeyScapeDesire = Math.random();

            if (){

            }

            double marcusTraveled = Math.round(marcusSpeed * marcusHours);

            double statusWeather = Math.random();

            if (statusWeather <= STRONG_RAIN_PROBABILITY){
                marcusTraveled = marcusTraveled * STRONG_RAIN_SLOW_DOWN;
                System.out.println("Ha llovido fuertemente y la velocidad de marco se redujo al 25%");
            }else if (statusWeather <= NORMAL_RAIN_PROBABILITY){
                marcusTraveled = marcusTraveled * NORMAL_RAIN_SLOW_DOWN;
                System.out.println("Ha llovido y la velocidad de marco se redujo 25%");
            }else {
                System.out.println("Buen Clima");
            }
            

            if (distanceMotherMarco <= 0){
                motherNotFound = false;
                continue;
            }

            System.out.println("[" + distanceMotherMarco + "]");
            System.out.println("Marco aun no ha encontrado a su madre");

        } while (motherNotFound);

    }
}