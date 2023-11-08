package roseteEirik.retoMarco;
import java.util.Scanner;

class HistoriaDeMarco{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String inputUser;

        final double INITIAL_DISTANCE_MOTHER = 350;
        final double ROUND = 1000d;

        int day = 0;
        boolean motherNotFound = true;
        boolean differentWeather = true;
        double distanceMotherMarco = INITIAL_DISTANCE_MOTHER;
        double motherStatistics = INITIAL_DISTANCE_MOTHER;
        double marcoStatistics = 0;

        final int COUNT = 15;
        final String DAY_LINE = "-=-o";
        final String MOM_FOUNDED_LINE = "-<>-";
        final String DAY_MARK = DAY_LINE.repeat(COUNT);
        final String FINISH_MARK = MOM_FOUNDED_LINE.repeat(COUNT);
        final String INTRO = "\n";

        final double DISTANCE_REQUIRED_SAME_WEATHER = 100;
        final double DISTANCE_REQUIRED_JOYFUL_RUN = 50;
        final double JOYFUL_RUN_PROBABILITY = 0.5;
        final double DISTANCE_TRAVELED_JOYFUL_RUN = 25;

        final double STRONG_RAIN_PROBABILITY = 0.1;
        final double NORMAL_RAIN_PROBABILITY = 0.4;
        final double TIRED_MONKEY_PROBABILITY = 0.25;
        final double ESCAPE_MONKEY_PROBABILITY = 0.15;

        final double NORMAL_RAIN_SLOW_DOWN = 0.75;
        final double STRONG_RAIN_SLOW_DOWN = 0.25;
        final double STRONG_RAIN_CARRIAGE_SLOW_DOWN = 0.5;
        final double TIRED_MONKEY_SLOW_DOWN = 0.9;
        final double ESCAPE_MONKEY_HOURS_LOST = 2;

        System.out.println(INTRO + "DIARIO DEL VIAJE DE MARCO" + INTRO);
        System.out.println(DAY_MARK + INTRO);

        do {

            day++;

            System.out.println("[DIA " + day +"]" + INTRO);

            double marcoHours = Math.random() * 2 + 8;
            double marcoSpeed = Math.random() * 5 + 10;

            if (distanceMotherMarco <= DISTANCE_REQUIRED_SAME_WEATHER){
                differentWeather = false;
                System.out.println("Marco se ha acercado lo suficiente a su madre y ahora el clima les afecta por igual" + INTRO);
            }else {
                differentWeather = true;
            }

            double marcoWeather = Math.random();
            if (marcoWeather <= STRONG_RAIN_PROBABILITY){
                marcoSpeed = marcoSpeed * STRONG_RAIN_SLOW_DOWN;
                System.out.println("Ha llovido muchisimo! La velocidad de Marco se redujo al 25%");
            }else if (marcoWeather <= NORMAL_RAIN_PROBABILITY){
                marcoSpeed = marcoSpeed * NORMAL_RAIN_SLOW_DOWN;
                System.out.println("Ha llovido y la velocidad de Marco se redujo 25%");
            }else {
                System.out.println("El Sol brilla y hace un buen clima");
            }
            
            double monkeyPhysicalCondition = Math.random();
            if (monkeyPhysicalCondition <= TIRED_MONKEY_PROBABILITY){
                marcoSpeed = marcoSpeed * TIRED_MONKEY_SLOW_DOWN;
                System.out.println("Amedio se ha cansado y la velocidad de Marco se redujo 25%");
            }
            double monkeyScapeDesire = Math.random();
            if (monkeyScapeDesire <= ESCAPE_MONKEY_PROBABILITY){
                marcoHours = marcoHours - ESCAPE_MONKEY_HOURS_LOST;
                System.out.println("Amedio se ha escapado y Marco ha perdido dos horas buscandolo!");
            }

            marcoHours = Math.round((marcoHours) * ROUND) / ROUND;
            marcoSpeed = Math.round((marcoSpeed) * ROUND) / ROUND;
            double marcoTraveled = Math.round((marcoHours * marcoSpeed) * ROUND) / ROUND;
            marcoStatistics = marcoStatistics + marcoTraveled;
            
            System.out.println("Avance ["+ marcoHours +" horas] a ["+ marcoSpeed +" km/h] recorriendo ["+ marcoTraveled +" km]" + INTRO);

            double motherHours = Math.random() * 3 + 6;
            double motherSpeed = Math.random() * 3 + 6;

            double motherWeather = 0;
            if (differentWeather){
                motherWeather = Math.random();
            }else {
                motherWeather = marcoWeather;
            }
            
            if (motherWeather <= STRONG_RAIN_PROBABILITY){
                motherSpeed = motherSpeed * STRONG_RAIN_CARRIAGE_SLOW_DOWN;
                System.out.println("Ha llovido muchisimo en la zona de mama! La velocidad del carruaje se redujo al 25%");
            }else if (motherWeather <= NORMAL_RAIN_PROBABILITY){
                marcoSpeed = marcoSpeed * NORMAL_RAIN_SLOW_DOWN;
                System.out.println("Ha llovido y la velocidad del carruaje de mama se redujo 25%");
            }else {
                System.out.println("El Sol brilla y hace un buen clima para mama");
            }

            motherHours = Math.round((motherHours) * ROUND) / ROUND;
            motherSpeed = Math.round((motherSpeed) * ROUND) / ROUND;
            double motherTraveled = Math.round((motherHours * motherSpeed) * ROUND) / ROUND;
            distanceMotherMarco = distanceMotherMarco + motherTraveled;
            motherStatistics = motherStatistics + motherTraveled;
        
            System.out.println("Mama avanzo ["+ motherHours +" horas] a ["+ motherSpeed +" km/h] recorriendo ["+ motherTraveled +" km]" + INTRO);

            distanceMotherMarco = Math.round((distanceMotherMarco - marcoTraveled) * ROUND) / ROUND;

            System.out.println("La distancia que separa a Marco de su madre es de [" + distanceMotherMarco + " km]");
            System.out.println("Al final del dia "+ day +" Marco aun no ha encontrado a su madre" + INTRO);

            double runningMarco = Math.random();
            if (distanceMotherMarco <= DISTANCE_REQUIRED_JOYFUL_RUN){
                if (distanceMotherMarco <= 0){
                    continue;
                }else if (runningMarco <= JOYFUL_RUN_PROBABILITY){
                    String runResult =
                        "Una anciana le dijo a Marco que ha visto a su mama..." + INTRO +
                        "Y rompe a correr!!!" + INTRO +
                        "Avanzo ["+ DISTANCE_TRAVELED_JOYFUL_RUN +" km] en un abrir y cerrar de ojos";
                    System.out.println(runResult);
                    distanceMotherMarco = distanceMotherMarco - DISTANCE_TRAVELED_JOYFUL_RUN;
                    marcoStatistics = marcoStatistics + DISTANCE_TRAVELED_JOYFUL_RUN;
                    System.out.println("Y ahora esta a ["+ distanceMotherMarco +" km] de su mama" + INTRO);
                }
            }

            if (distanceMotherMarco <= 0){
                motherNotFound = false;
                continue;
            }

            System.out.println(DAY_MARK);
            
            inputUser = scanner.nextLine();

        } while (motherNotFound);

        String happyFinal =
            INTRO + FINISH_MARK + INTRO +
            INTRO + "Al final del dia "+ day +" Marco encuentra a su madre!!" + INTRO +
            INTRO + "Marco ha recorrido ["+ marcoStatistics +" km] en total" + 
            INTRO + "Su madre ha recorrido ["+ motherStatistics +" km] en total" + INTRO +
            INTRO + FINISH_MARK + INTRO;
        System.out.println(happyFinal);
    }
}