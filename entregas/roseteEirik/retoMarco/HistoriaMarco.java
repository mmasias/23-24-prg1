package roseteEirik.retoMarco;
import java.util.Scanner;

class HistoriaMarco{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String inputUser;
        String dailyReport;

        final double INITIAL_DISTANCE_MOTHER = 350;
        final double ROUND = 1000d;

        String marcoWeatherDraw = "";
        String historyDraw = "";
        String motherWeatherDraw = "";
        String displayDraw = "";
        boolean monkeyScaped = false;        
        boolean monkeyTired = false;        

        int day = 0;
        boolean grannyAppear = false;
        boolean motherFound = false;
        boolean differentWeather = true;
        double distanceMotherMarco = INITIAL_DISTANCE_MOTHER;
        double travelStatistics = INITIAL_DISTANCE_MOTHER;

        final int COUNT = 15;
        final String DAY_LINE = "-=-o";
        final String MOM_FOUNDED_LINE = "-<>-";
        final String DAY_MARK = DAY_LINE.repeat(COUNT);
        final String FINISH_MARK = MOM_FOUNDED_LINE.repeat(COUNT);
        final String INTRO = "\n";
        final String PARAGRAPH = INTRO + INTRO;
        final String RESET = "";

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

        System.out.println(INTRO + "EL DIARIO DE MI VIAJE" + INTRO);
        System.out.println(DAY_MARK + INTRO);

        do {

            day++;

            dailyReport = "[DIA " + day +"]" + PARAGRAPH;

            double marcoHours = Math.random() * 2 + 8;
            double marcoSpeed = Math.random() * 5 + 10;

            if (distanceMotherMarco <= DISTANCE_REQUIRED_SAME_WEATHER){
                differentWeather = false;
                dailyReport = dailyReport + "Marco se ha acercado a su mama y ahora el clima les afecta por igual" + INTRO;
            } else {
                differentWeather = true;
            }

            double marcoWeather = Math.random();
            if (marcoWeather <= STRONG_RAIN_PROBABILITY){
                marcoSpeed = marcoSpeed * STRONG_RAIN_SLOW_DOWN;
                dailyReport = dailyReport + "Ha llovido muchisimo! Me muevo muy lento (al 25%)" + INTRO;
                marcoWeatherDraw = "strongRain";
            } else if (marcoWeather <= NORMAL_RAIN_PROBABILITY){
                marcoSpeed = marcoSpeed * NORMAL_RAIN_SLOW_DOWN;
                dailyReport = dailyReport + "Ha llovido y me retraso un poco (un 25%)" + INTRO;
                marcoWeatherDraw = "normalRain";
            } else {
                dailyReport = dailyReport + "El Sol brilla y hace un buen clima" + INTRO;
                marcoWeatherDraw = "shinySun";
            }
            
            double monkeyScapeDesire = Math.random();
            if (monkeyScapeDesire <= ESCAPE_MONKEY_PROBABILITY){
                marcoHours = marcoHours - ESCAPE_MONKEY_HOURS_LOST;
                dailyReport = dailyReport + "Amedio se ha escapado y perdi dos horas buscandolo!" + INTRO;
                monkeyScaped = true;
            } else {
                monkeyScaped = false;
            }
            double monkeyPhysicalCondition = Math.random();
            if (monkeyPhysicalCondition <= TIRED_MONKEY_PROBABILITY){
                marcoSpeed = marcoSpeed * TIRED_MONKEY_SLOW_DOWN;
                dailyReport = dailyReport + "Amedio se ha cansado y tuve que cargarlo, me retrase un poco (un 25%)" + INTRO;
                monkeyTired = true;
            } else {
                monkeyTired = false;
            }

            displayDraw = "marco";
            historyDraw = drawings(INTRO, marcoWeatherDraw, motherWeatherDraw, PARAGRAPH, PARAGRAPH, RESET, monkeyScaped, monkeyTired, differentWeather, differentWeather, distanceMotherMarco);
            System.out.print(historyDraw);

            double marcoTraveled = Math.round((marcoHours * marcoSpeed) * ROUND) / ROUND;
            marcoHours = Math.round((marcoHours) * ROUND) / ROUND;
            marcoSpeed = Math.round((marcoSpeed) * ROUND) / ROUND;
            
            dailyReport = dailyReport + "Avance ["+ marcoHours +" horas] a ["+ marcoSpeed +" km/h] recorriendo ["+ marcoTraveled +" km]" + PARAGRAPH;

            double motherHours = Math.random() * 3 + 6;
            double motherSpeed = Math.random() * 3 + 6;

            double motherWeather = 0;
            motherWeather = differentWeather ?  Math.random() : marcoWeather;
            
            if (motherWeather <= STRONG_RAIN_PROBABILITY){
                motherSpeed = motherSpeed * STRONG_RAIN_CARRIAGE_SLOW_DOWN;
                dailyReport = dailyReport + "Ha llovido muchisimo en la zona de mama! La velocidad del su carruaje ira lento (al 50%)" + INTRO;
                motherWeatherDraw = "strongRain";
            } else if (motherWeather <= NORMAL_RAIN_PROBABILITY){
                motherSpeed = motherSpeed * NORMAL_RAIN_SLOW_DOWN;
                dailyReport = dailyReport + "Ha llovido y la velocidad del carruaje de mama sera un poco mas lento (un 25%)" + INTRO;
                motherWeatherDraw = "normalRain";
            } else {
                dailyReport = dailyReport + "El Sol brilla y hace un buen clima para mama" + INTRO;
                motherWeatherDraw = "shinySun";
            }

            displayDraw = "mother";
            historyDraw = drawings(INTRO, marcoWeatherDraw, motherWeatherDraw, PARAGRAPH, PARAGRAPH, RESET, monkeyScaped, monkeyTired, differentWeather, differentWeather, distanceMotherMarco);
            System.out.print(historyDraw);

            double motherTraveled = Math.round((motherHours * motherSpeed) * ROUND) / ROUND;
            motherHours = Math.round((motherHours) * ROUND) / ROUND;
            motherSpeed = Math.round((motherSpeed) * ROUND) / ROUND;
            distanceMotherMarco = distanceMotherMarco + motherTraveled;
            travelStatistics = travelStatistics + motherTraveled;
        
            dailyReport = dailyReport + "Mama avanzo ["+ motherHours +" horas] a ["+ motherSpeed +" km/h] recorriendo ["+ motherTraveled +" km]" + INTRO;

            distanceMotherMarco = Math.round((distanceMotherMarco - marcoTraveled) * ROUND) / ROUND;

            displayDraw = "landscape";
            historyDraw = drawings(INTRO, marcoWeatherDraw, motherWeatherDraw, PARAGRAPH, PARAGRAPH, RESET, monkeyScaped, monkeyTired, differentWeather, differentWeather, distanceMotherMarco);
            System.out.print(historyDraw);

            dailyReport = dailyReport + "La distancia que separa a Marco de su madre es de [" + distanceMotherMarco + " km]";

            if (distanceMotherMarco <= DISTANCE_REQUIRED_JOYFUL_RUN){
                double runningMarco = Math.random();
                if (distanceMotherMarco <= 0){
                    grannyAppear = false;
                    System.out.print("");
                 } else if (runningMarco <= JOYFUL_RUN_PROBABILITY){
                    grannyAppear = true;
                    String runResult =
                        PARAGRAPH +
                        "Una anciana me dijo que vio a mi mama..." + INTRO +
                        "No tengo tiempo que perder!!!" + INTRO +
                        "Avance unos ["+ DISTANCE_TRAVELED_JOYFUL_RUN +" km] en un abrir y cerrar de ojos";
                    dailyReport = dailyReport + runResult;
                    distanceMotherMarco = distanceMotherMarco - DISTANCE_TRAVELED_JOYFUL_RUN;
                    dailyReport = dailyReport + "Y ahora esta a ["+ distanceMotherMarco +" km] de su mama";
                    displayDraw = "granny";
                    historyDraw = drawings(INTRO, marcoWeatherDraw, motherWeatherDraw, PARAGRAPH, PARAGRAPH, RESET, monkeyScaped, monkeyTired, differentWeather, differentWeather, distanceMotherMarco);
                    System.out.print(historyDraw);
                }
            }

            if (distanceMotherMarco <= 0){
                motherFound = true;
            }

            if (!motherFound){
                dailyReport = dailyReport + PARAGRAPH + "Al final del dia "+ day +" Marco aun no ha encontrado a su madre" + PARAGRAPH;
                dailyReport = dailyReport + DAY_MARK;
            }
           
            historyDraw = drawings(INTRO, marcoWeatherDraw, motherWeatherDraw, PARAGRAPH, PARAGRAPH, RESET, monkeyScaped, monkeyTired, differentWeather, differentWeather, distanceMotherMarco);
            System.out.print(dailyReport);
            System.out.print(historyDraw);
            inputUser = scanner.nextLine();

        } while (!motherFound);

        travelStatistics = Math.round((travelStatistics) * ROUND) / ROUND;

        String happyFinal =
            FINISH_MARK + PARAGRAPH +
            "Al final del dia "+ day +" Marco encuentra a su madre!!" + PARAGRAPH +
            "Marco ha recorrido ["+ travelStatistics +" km] en total!" + PARAGRAPH +
            FINISH_MARK + INTRO;
        System.out.println(happyFinal);
    }

    static String drawings(String displayDraw, final String RESET, final String INTRO, String marcoWeatherDraw, String motherWeatherDraw, String historyDraw, boolean monkeyScaped, boolean monkeyTired, boolean differentWeather, boolean grannyAppear, double distanceMotherMarco){
        
        String marcoAndMonkeyBody = "";

        final String AIR = " ";
        final String ROAD = "_";
        final String GRASS = "^v^V";
        String weatherScene;
        String motherWeatherScene = "";
        String landscape;
        String distanceDisplayed;
        String spaceForMinis;
        int distanceKilometers;

        final String BIG_CLOUD = """
              ,- -.- -.-, -.-.       .- -.-. -,- -.
             (     .   ;  .    )   (    :    ;   . )
           ,- -.- -.-, -.-,- -.- -.-,-,- -,-. -.-. -,- -.
          (     .   ;  .  (    :.    :   ;  . ) :    ;  . )    
         (  '_    _' '_ ;(  '_  '_    '_    ;  )  '_     ;  ) 
          '- - ( _ . _ .  : .  . ; ._ '  :  ;  . _ '_ ) - -'
           ` `  '- -~- -~-'' -~-'- -~- -'- -~-~ -'- -' ` `
        """;

        final String SHINY_SUN = """

                             ;   :   ;
                          .   \\_,!,_/   ,
                           `.,'     `.,'
                            /         \\
                       ~ -- :         : -- ~
                            \\         /
                           ,'`._   _.'`.
                          '   / `!` \\   `
                             ;   :   ;         
        """;

        final String MOM_CARRIAGE = """
                                      ,--.----.----.
              ''.                   o'    '    '    '
              /´) '.___.-._.        /||    |    |    |
              '°~)-~-~-~-~)\\-~-~-~´<-_'._,_'._,_'.__,'
                  ( .__.( /( \\'   \\   ,-.      ,-.   /
                  /'\\_. /´ '> '    '-( o )----( o )-'
                 /     /   ´          `-'      `-'  
        """;
        String GRANNY = """
            <--------
              ,,,,
              %"-"%
             ;--/ \\>
             | /___\\
             | _/ |_        
        """;
        final String HAPPY_ENDING = """
              _____ ___ _   _    _    _          _____ _____ _     ___ _____  _ 
             |  ___|_ _| \\ | |  / \\  | |        |  ___| ____| |   |_ _|__  / | |
             | |_   | ||  \\| | / _ \\ | |        | |_  |  _| | |    | |  / /  | |
             |  _|  | || |\\  |/ ___ \\| |___     |  _| | |___| |___ | | / /_  |_|
             |_|   |___|_| \\_/_/   \\_\\_____|    |_|   |_____|_____|___/____| (_) 
    
                             ,-~´´ `'-.
                            ; /'--.__.;.
                            . C| ^ ,^|J.
                            : '\\ '-- / ;
                            ;   ';-:' .' 
                            ;.-~´' '`~-.
                            //(       )\\\\
                           //  \\     /  \\\\
                           \\\\  )     (   \\\\
                            () =+=====    ()  CCCCCCO
              (_)             /  |.   \\     \\( ^ c ^ )   _,,,,,_  
            (_)@(_)  wWWWw   |   |.    |       ||:||\\  (d ^   ^ b)  vVVVv    (_)  
              (_)\\   (___)   |   |.    |       | _ | °   ( (Y) )    (___)  (_)@(_)
                 |     Y     |   |.    |       || ||      |   |       Y     /(_)
                \\|/   \\|/    |__/_\\____|      (_)(_)    (")_(")_/    \\|/   \\|/               
        """;
        final String ENDING_GRASS = GRASS.repeat(19);
        final String THE_END = HAPPY_ENDING + ENDING_GRASS;

        final String MOUNTAINS = """
                               .-.                 _ 
                              /   \\              _/ \\
                 _        .--'\\/\\_ \\            /    \\      ___
                / \\_    _/ ^      \\/\\'__       /\\/\\  /\\  __/   \\
               /    \\  /    .'   _/  /  \\     /    \\/  \\/ .`'\\_/\\
              /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _
             /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\
           /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /    `._/  ^  \\
          /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.
         /        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\
        """;
        final String MINI_MOM_CARRIAGE_TOP = "        __ ";
        final String MINI_MOM_CARRIAGE_MIDDLE = "´?__,~~( ))";
        final String MINI_MOM_CARRIAGE_BOTTOM = "<!`´!  o--o";
        final String MINI_MARCO_HAIR = ",,,," + INTRO;
        final String MINI_MARCO_AND_MONKEY_FACES = "|^^|  @(\")@" + INTRO;
        final String MINI_MARCO_AND_MONKEY_BOTTOM = "<[:]>   H~" + INTRO;
        final String KILOMETERS = """

                   ..........1.........2.........3.........4.........5
                   012345678901234567890123456789012345678901234567890
                   000000000000000000000000000000000000000000000000000
        """;

        final String STRONG_RAIN_TOP_DRAW = "` \\ ` ` \\ ";
        final String STRONG_RAIN_BOTTOM_DRAW = "` ` ` \\ ` ";
        final String STRONG_RAIN_TOP_COMPLETE = AIR.repeat(3) + STRONG_RAIN_TOP_DRAW.repeat(5) + INTRO;
        final String STRONG_RAIN_BOTTOM_COMPLETE = AIR.repeat(3) + STRONG_RAIN_BOTTOM_DRAW.repeat(5) + INTRO;
        final String STRONG_RAIN_TOP_AND_BOTTOM = STRONG_RAIN_TOP_COMPLETE + STRONG_RAIN_BOTTOM_COMPLETE;
        final String STRONG_RAIN = STRONG_RAIN_TOP_AND_BOTTOM.repeat(3);
        final String NORMAL_RAIN_TOP_DRAW = "`     `   ";
        final String NORMAL_RAIN_BOTTOM_DRAW = "   `     `";
        final String NORMAL_RAIN_TOP_COMPLETE = AIR.repeat(3) + NORMAL_RAIN_TOP_DRAW.repeat(5) + INTRO;        
        final String NORMAL_RAIN_BOTTOM_COMPLETE = AIR.repeat(3) + NORMAL_RAIN_BOTTOM_DRAW.repeat(5) + INTRO;        
        final String NORMAL_RAIN_TOP_AND_BOTTOM = NORMAL_RAIN_TOP_COMPLETE + NORMAL_RAIN_BOTTOM_COMPLETE;
        final String NORMAL_RAIN = NORMAL_RAIN_TOP_AND_BOTTOM.repeat(3);
        final String SHINY_SUN_INTRO = INTRO.repeat(2);

        final String MARCO_HAIR = "  CCCCCCO";
        final String NORMAL_MARCO = " ( ^ c ^ )";
        final String ANGRY_MARCO = " ( °`c´°')";
        final String CARRY_MONKEY_MARCO = " ( ° c ° )";
        final String MARCO_CHEST = "  /||:||\\";
        final String MARCO_TRUNK = " ° | _ | °";
        final String MARCO_LEGS = "   || ||";
        final String MARCO_SHOES = "  (_)(_)";
        
        final String MONKEY_HAIR = "  _,,,,,_";
        final String NORMAL_MONKEY = "(d .   . b)";
        final String TIRED_MONKEY = "(d ~   ~ b)";
        final String NAUGHTY_MONKEY = "(d >   < b)";
        final String MONKEY_MOUTH = "  ( (Y) )";
        final String MONKEY_TRUNK = "       |   |";
        final String MONKEY_PAWS = "     \\_(\")_(\")";

        final String WEATHER_SPACE = AIR.repeat(8);
        final String MARCO_HAIR_SPACE = AIR.repeat(22);
        final String MARCO_FACE_SPACE = AIR.repeat(8);
        final String MARCO_CHEST_SPACE = AIR.repeat(6);
        final String MARCO_TRUNK_SPACE = AIR.repeat(8);
        final String MARCO_LEGS_SPACE = AIR.repeat(10);
        final String MARCO_SHOES_SPACE = AIR.repeat(8);
        final String MONKEY_HAIR_SPACE = AIR.repeat(5);
        final String MONKEY_FACE_SPACE = AIR.repeat(5);
        final String MONKEY_MOUTH_SPACE = AIR.repeat(5);

        final String CARRY_MONKEY_WEATHER_SPACE = AIR.repeat(22);
        
        boolean monkeyTiredAndEscaped = monkeyScaped && monkeyTired;

        if (!monkeyTiredAndEscaped){
            marcoAndMonkeyBody = 
                WEATHER_SPACE + MARCO_HAIR_SPACE + MARCO_HAIR + INTRO +
                WEATHER_SPACE + MONKEY_HAIR_SPACE + MONKEY_HAIR + MARCO_FACE_SPACE + NORMAL_MARCO + INTRO +
                WEATHER_SPACE + MONKEY_FACE_SPACE + NORMAL_MONKEY + MARCO_CHEST_SPACE + MARCO_CHEST + INTRO +
                WEATHER_SPACE + MONKEY_MOUTH_SPACE + MONKEY_MOUTH + MARCO_TRUNK_SPACE + MARCO_TRUNK + INTRO +
                WEATHER_SPACE + MONKEY_TRUNK + MARCO_LEGS_SPACE + MARCO_LEGS + INTRO +
                WEATHER_SPACE + MONKEY_PAWS + MARCO_SHOES_SPACE + MARCO_SHOES + INTRO;
            if (monkeyTired){
                marcoAndMonkeyBody = RESET;
                marcoAndMonkeyBody = 
                    CARRY_MONKEY_WEATHER_SPACE + MONKEY_HAIR + INTRO +
                    CARRY_MONKEY_WEATHER_SPACE + TIRED_MONKEY + INTRO +
                    CARRY_MONKEY_WEATHER_SPACE + MONKEY_MOUTH + INTRO+ 
                    CARRY_MONKEY_WEATHER_SPACE + MARCO_HAIR + INTRO +
                    CARRY_MONKEY_WEATHER_SPACE + CARRY_MONKEY_MARCO + INTRO +
                    CARRY_MONKEY_WEATHER_SPACE + MARCO_CHEST + INTRO +
                    CARRY_MONKEY_WEATHER_SPACE + MARCO_TRUNK + INTRO +
                    CARRY_MONKEY_WEATHER_SPACE + MARCO_LEGS + INTRO +
                    CARRY_MONKEY_WEATHER_SPACE + MARCO_SHOES + INTRO;
            } else if (monkeyScaped){
                marcoAndMonkeyBody = RESET;
                marcoAndMonkeyBody = 
                    WEATHER_SPACE + MARCO_HAIR_SPACE + MARCO_HAIR + INTRO +
                    WEATHER_SPACE + MONKEY_HAIR_SPACE + MONKEY_HAIR + MARCO_FACE_SPACE + ANGRY_MARCO + INTRO +
                    WEATHER_SPACE + MONKEY_FACE_SPACE + NAUGHTY_MONKEY + MARCO_CHEST_SPACE + MARCO_CHEST + INTRO +
                    WEATHER_SPACE + MONKEY_MOUTH_SPACE + MONKEY_MOUTH + MARCO_TRUNK_SPACE + MARCO_TRUNK + INTRO +
                    WEATHER_SPACE + MONKEY_TRUNK + MARCO_LEGS_SPACE + MARCO_LEGS + INTRO +
                    WEATHER_SPACE + MONKEY_PAWS + MARCO_SHOES_SPACE + MARCO_SHOES + INTRO;
            }
        } else {
            marcoAndMonkeyBody = 
                CARRY_MONKEY_WEATHER_SPACE + MONKEY_HAIR + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + NAUGHTY_MONKEY + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + MONKEY_MOUTH + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + MARCO_HAIR + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + ANGRY_MARCO + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + MARCO_CHEST + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + MARCO_TRUNK + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + MARCO_LEGS + INTRO +
                CARRY_MONKEY_WEATHER_SPACE + marcoAndMonkeyBody + MARCO_SHOES + INTRO;
        }
        
        weatherScene = "";
        if (marcoWeatherDraw == "strongRain"){
            weatherScene = INTRO + BIG_CLOUD + STRONG_RAIN + marcoAndMonkeyBody;
        } else if (marcoWeatherDraw == "normalRain"){
            weatherScene = INTRO + BIG_CLOUD + NORMAL_RAIN + marcoAndMonkeyBody;
        } else if (marcoWeatherDraw == "shinySun"){
            weatherScene = INTRO + SHINY_SUN + SHINY_SUN_INTRO + marcoAndMonkeyBody;
        }

        motherWeatherDraw = differentWeather ? motherWeatherDraw : marcoWeatherDraw;

        if (motherWeatherDraw == "strongRain"){
            motherWeatherScene = INTRO + BIG_CLOUD + STRONG_RAIN + MOM_CARRIAGE;
        } else if (motherWeatherDraw == "normalRain"){
            motherWeatherScene = INTRO + BIG_CLOUD + NORMAL_RAIN + MOM_CARRIAGE;
        } else if (motherWeatherDraw == "shinySun"){
            motherWeatherScene = INTRO + SHINY_SUN + SHINY_SUN_INTRO + MOM_CARRIAGE;
        }

        if (distanceMotherMarco < 0){
            distanceKilometers = 0;
        } else {
            distanceKilometers = (int) distanceMotherMarco / 10;
        }
        
        distanceDisplayed = ROAD.repeat(distanceKilometers);
        spaceForMinis = AIR.repeat(distanceKilometers);

        landscape = 
            MOUNTAINS + 
            MINI_MOM_CARRIAGE_TOP + spaceForMinis + MINI_MARCO_HAIR + 
            MINI_MOM_CARRIAGE_MIDDLE + spaceForMinis + MINI_MARCO_AND_MONKEY_FACES + 
            MINI_MOM_CARRIAGE_BOTTOM + distanceDisplayed + MINI_MARCO_AND_MONKEY_BOTTOM + 
            KILOMETERS;
        
        if (grannyAppear){
            GRANNY = RESET;
            GRANNY = GRANNY + INTRO + landscape;
        }

        if (displayDraw == "marco"){
            historyDraw = weatherScene;
        } else if (displayDraw == "mother"){
            historyDraw = motherWeatherScene;
        } else if (displayDraw == "landscape"){
            historyDraw = landscape;
        } else if (displayDraw == "granny"){
            historyDraw = GRANNY;
        } else if (displayDraw == "end"){
            historyDraw = THE_END;
        }

        return historyDraw;
    }
}