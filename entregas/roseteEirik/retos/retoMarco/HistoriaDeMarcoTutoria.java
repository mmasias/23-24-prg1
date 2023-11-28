package roseteEirik.retos.retoMarco;
import java.util.Scanner;

class HistoriaDeMarco{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
       
        String inputUser;
        final String CLEAN_SCREEN = cleanScreen();

        final double INITIAL_DISTANCE_MOTHER = 350;
        final double ROUND = 1000d;
        final String RESET = "";
        final String AIR = " ";

        int marcoWeatherValue;
        int motherWeatherValue;
        
        String runResult = "";
        String dailyReport;
        String dailyReportMarco;
        String dailyReportMother;
        String dailyReportLandscape;
        String dailyReportGranny = "";
        String dailyReportMotherNotFound = "";

        String marcoDraw = "";
        String motherDraw = "";
        String grannyDraw = "";
        String landscapeDraw = "";
        String finalDraw = "";

        boolean monkeyScaped = false;        
        boolean monkeyTired = false;        

        int day = 0;
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
        System.out.println(DAY_MARK);

        do {

            day++;

            dailyReportMarco = "[DIA " + day +"]" + PARAGRAPH;

            double marcoHours = Math.random() * 2 + 8;
            double marcoSpeed = Math.random() * 5 + 10;

            if (distanceMotherMarco <= DISTANCE_REQUIRED_SAME_WEATHER){
                differentWeather = false;
                dailyReportMarco = dailyReportMarco + "Marco se ha acercado a su mama y ahora el clima les afecta por igual" + INTRO;
            } else {
                differentWeather = true;
            }

            double marcoWeather = Math.random();
            if (marcoWeather <= STRONG_RAIN_PROBABILITY){
                marcoSpeed = marcoSpeed * STRONG_RAIN_SLOW_DOWN;
                dailyReportMarco = dailyReportMarco + "Ha llovido muchisimo! Me muevo muy lento (al 25%)" + INTRO;
                marcoWeatherValue = 2;
            } else if (marcoWeather <= NORMAL_RAIN_PROBABILITY){
                marcoSpeed = marcoSpeed * NORMAL_RAIN_SLOW_DOWN;
                dailyReportMarco = dailyReportMarco + "Ha llovido y me retraso un poco (un 25%)" + INTRO;
                marcoWeatherValue = 1;
            } else {
                dailyReportMarco = dailyReportMarco + "El Sol brilla y hace un buen clima" + INTRO;
                marcoWeatherValue = 0;
            }
            
            double monkeyScapeDesire = Math.random();
            if (monkeyScapeDesire <= ESCAPE_MONKEY_PROBABILITY){
                marcoHours = marcoHours - ESCAPE_MONKEY_HOURS_LOST;
                dailyReportMarco = dailyReportMarco + "Amedio se ha escapado y perdi dos horas buscandolo!" + INTRO;
                monkeyScaped = true;
            } else {
                monkeyScaped = false;
            }
            double monkeyPhysicalCondition = Math.random();
            if (monkeyPhysicalCondition <= TIRED_MONKEY_PROBABILITY){
                marcoSpeed = marcoSpeed * TIRED_MONKEY_SLOW_DOWN;
                dailyReportMarco = dailyReportMarco + "Amedio se ha cansado y tuve que cargarlo, me retrase un poco (un 25%)" + INTRO;
                monkeyTired = true;
            } else {
                monkeyTired = false;
            }
            
            System.out.println(INTRO + dailyReportMarco);
            marcoDraw = 
                marcoCloudOrSun(marcoWeatherValue) +
                marcoRain(marcoWeatherValue, AIR, INTRO) +
                marcoWeatherDrawing(RESET, AIR, INTRO, monkeyScaped, monkeyTired);
            System.out.println(marcoDraw);

            double marcoTraveled = Math.round((marcoHours * marcoSpeed) * ROUND) / ROUND;
            marcoHours = Math.round((marcoHours) * ROUND) / ROUND;
            marcoSpeed = Math.round((marcoSpeed) * ROUND) / ROUND;
            
            String recapMarco = "Avance ["+ marcoHours +" horas] a ["+ marcoSpeed +" km/h] recorriendo ["+ marcoTraveled +" km]" + PARAGRAPH;
            System.out.println(recapMarco + DAY_MARK);
            inputUser = scanner.nextLine();
            System.out.println(CLEAN_SCREEN);

            double motherHours = Math.random() * 3 + 6;
            double motherSpeed = Math.random() * 3 + 6;

            double motherWeather = 0;
            motherWeather = differentWeather ?  Math.random() : marcoWeather;
            
            if (motherWeather <= STRONG_RAIN_PROBABILITY){
                motherSpeed = motherSpeed * STRONG_RAIN_CARRIAGE_SLOW_DOWN;
                dailyReportMother = "Ha llovido muchisimo en la zona de mama! La velocidad del su carruaje ira lento (al 50%)" + INTRO;
                motherWeatherValue = 2;
            } else if (motherWeather <= NORMAL_RAIN_PROBABILITY){
                motherSpeed = motherSpeed * NORMAL_RAIN_SLOW_DOWN;
                dailyReportMother = "Ha llovido y la velocidad del carruaje de mama sera un poco mas lento (un 25%)" + INTRO;
                motherWeatherValue = 1;
            } else {
                dailyReportMother = "El Sol brilla y hace un buen clima para mama" + INTRO;
                motherWeatherValue = 0;
            }

            System.out.println(dailyReportMother);
            motherDraw = 
                motherCloudOrSun(motherWeatherValue) +
                motherRain(motherWeatherValue, AIR, INTRO) +
                motherCarriage();
            System.out.println(motherDraw);            

            double motherTraveled = Math.round((motherHours * motherSpeed) * ROUND) / ROUND;
            motherHours = Math.round((motherHours) * ROUND) / ROUND;
            motherSpeed = Math.round((motherSpeed) * ROUND) / ROUND;
            distanceMotherMarco = distanceMotherMarco + motherTraveled;
            travelStatistics = travelStatistics + motherTraveled;
        
            String recapMother = "Mama avanzo ["+ motherHours +" horas] a ["+ motherSpeed +" km/h] recorriendo ["+ motherTraveled +" km]" + PARAGRAPH;
            System.out.println(recapMother + DAY_MARK);
            inputUser = scanner.nextLine();
            System.out.println(CLEAN_SCREEN);

            distanceMotherMarco = Math.round((distanceMotherMarco - marcoTraveled) * ROUND) / ROUND;
            
            landscapeDraw = landscape(AIR, INTRO, distanceMotherMarco);
            System.out.println(landscapeDraw);

            dailyReportLandscape = "La distancia que separa a Marco de su madre es de [" + distanceMotherMarco + " km]";
            System.out.println(dailyReportLandscape);
            
            inputUser = scanner.nextLine();
            System.out.println(CLEAN_SCREEN);
            
            if (distanceMotherMarco <= DISTANCE_REQUIRED_JOYFUL_RUN){
                double runningMarco = Math.random();
                if (distanceMotherMarco <= 0){
                    dailyReportGranny = "";
                 } else if (runningMarco <= JOYFUL_RUN_PROBABILITY){
                   
                    grannyDraw =
                        granny() + INTRO;
                        System.out.println(DAY_MARK + PARAGRAPH + grannyDraw);
                        
                    runResult =
                        "Una anciana me dijo que vio a mi mama..." + INTRO +
                        "No tengo tiempo que perder!!!" + INTRO +
                        "Avance unos ["+ DISTANCE_TRAVELED_JOYFUL_RUN +" km] en un abrir y cerrar de ojos";
                    System.out.println(runResult);

                    inputUser = scanner.nextLine();
                    System.out.println(CLEAN_SCREEN);

                    System.out.println(landscapeDraw);

                    distanceMotherMarco = distanceMotherMarco - DISTANCE_TRAVELED_JOYFUL_RUN;
                    dailyReportGranny = INTRO + "Ahora Marco esta a ["+ distanceMotherMarco +" km] de su mama" + INTRO;
                    System.out.println(dailyReportGranny);
                    
                    inputUser = scanner.nextLine();
                    System.out.println(CLEAN_SCREEN);
                }
            }
            
            if (distanceMotherMarco <= 0){
                motherFound = true;
                System.out.println(DAY_MARK + INTRO);
            }
            
            if (!motherFound){
                dailyReportMotherNotFound = "Al final del dia "+ day +" Marco aun no ha encontrado a su madre" + PARAGRAPH + DAY_MARK;
                System.out.println(dailyReportMotherNotFound);
                inputUser = scanner.nextLine();
                System.out.println(CLEAN_SCREEN);
            } else {
                dailyReportMotherNotFound = "Parece que las cosas cambian hoy, porque..." + INTRO;
            }
            
            dailyReport = 
                "RESUMEN DEL " +
                dailyReportMarco + recapMarco + 
                dailyReportMother + recapMother + 
                dailyReportLandscape + PARAGRAPH +
                runResult + dailyReportGranny + 
                dailyReportMotherNotFound;
            System.out.print(dailyReport);
            inputUser = scanner.nextLine();

        } while (!motherFound);

        travelStatistics = Math.round((travelStatistics) * ROUND) / ROUND;
        finalDraw = endingDrawing(motherFound, INTRO);
        String happyFinal =
            FINISH_MARK + PARAGRAPH +
            "Al final del dia "+ day +" Marco encuentra a su madre!!" + PARAGRAPH +
            "Marco ha recorrido ["+ travelStatistics +" km] en total!" + PARAGRAPH +
            finalDraw + INTRO +
            FINISH_MARK + INTRO;
        System.out.println(happyFinal);
    }

    static String cloud(){

        final String BIG_CLOUD = """
              ,- -.- -.-, -.-.       .- -.-. -,- -.
             (     .   ;  .    )   (    :    ;   . )
           ,- -.- -.-, -.-,- -.- -.-,-,- -,-. -.-. -,- -.
          (     .   ;  .  (    :.    :   ;  . ) :    ;  . )    
         (  '_    _' '_ ;(  '_  '_    '_    ;  )  '_     ;  ) 
          '- - ( _ . _ .  : .  . ; ._ '  :  ;  . _ '_ ) - -'
           ` `  '- -~- -~-'' -~-'- -~- -'- -~-~ -'- -' ` `
        """;

        return BIG_CLOUD;
    }
    static String sun(){

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

        return SHINY_SUN;
    }

    static String marcoCloudOrSun(int marcoWeatherValue){
        
        final String BIG_CLOUD = cloud();
        final String SHINY_SUN = sun();
        String marcoCloudOrSun;
        if (marcoWeatherValue == 0){
            marcoCloudOrSun = SHINY_SUN;
        } else {
            marcoCloudOrSun = BIG_CLOUD;
        } 
        return marcoCloudOrSun;
    }
    static String motherCloudOrSun(int motherWeatherValue){

        final String BIG_CLOUD = cloud();
        final String SHINY_SUN = sun();
        String motherCloudOrSun;
        if (motherWeatherValue == 0){
            motherCloudOrSun = SHINY_SUN;
        } else {
            motherCloudOrSun = BIG_CLOUD;
        }
        return motherCloudOrSun;
    }

    static String strongRain(final String AIR, final String INTRO){
        final String STRONG_RAIN_TOP_DRAW = "` \\ ` ` \\ ";
        final String STRONG_RAIN_BOTTOM_DRAW = "` ` ` \\ ` ";
        final String STRONG_RAIN_TOP_COMPLETE = AIR.repeat(3) + STRONG_RAIN_TOP_DRAW.repeat(5) + INTRO;
        final String STRONG_RAIN_BOTTOM_COMPLETE = AIR.repeat(3) + STRONG_RAIN_BOTTOM_DRAW.repeat(5) + INTRO;
        final String STRONG_RAIN_TOP_AND_BOTTOM = STRONG_RAIN_TOP_COMPLETE + STRONG_RAIN_BOTTOM_COMPLETE;
        final String STRONG_RAIN = STRONG_RAIN_TOP_AND_BOTTOM.repeat(3);
        return STRONG_RAIN;
    }
    static String normalRain(final String AIR, final String INTRO){
        final String NORMAL_RAIN_TOP_DRAW = "`     `   ";
        final String NORMAL_RAIN_BOTTOM_DRAW = "   `     `";
        final String NORMAL_RAIN_TOP_COMPLETE = AIR.repeat(3) + NORMAL_RAIN_TOP_DRAW.repeat(5) + INTRO;        
        final String NORMAL_RAIN_BOTTOM_COMPLETE = AIR.repeat(3) + NORMAL_RAIN_BOTTOM_DRAW.repeat(5) + INTRO;        
        final String NORMAL_RAIN_TOP_AND_BOTTOM = NORMAL_RAIN_TOP_COMPLETE + NORMAL_RAIN_BOTTOM_COMPLETE;
        final String NORMAL_RAIN = NORMAL_RAIN_TOP_AND_BOTTOM.repeat(3);
        return NORMAL_RAIN;
    }
    static String shinySunIntro(final String INTRO){
        final String SHINY_SUN_INTRO = INTRO.repeat(2);
        return SHINY_SUN_INTRO;
    }
    
    static String marcoRain(int marcoWeatherCondition, final String AIR, final String INTRO){
        
        String marcoRain = "";
        final String STRONG_RAIN = strongRain(AIR, INTRO);
        final String NORMAL_RAIN = normalRain(AIR, INTRO);
        final String SHINY_SUN_INTRO = shinySunIntro(INTRO);
        if (marcoWeatherCondition == 2){
            marcoRain = STRONG_RAIN;
        } else if (marcoWeatherCondition == 1){
            marcoRain = NORMAL_RAIN;
        } else if (marcoWeatherCondition == 0){
            marcoRain = SHINY_SUN_INTRO;
        } 
        return marcoRain;
    }
    static String motherRain(int motherWeatherValue, final String AIR, final String INTRO){
        
        String motherRain = "";
        final String STRONG_RAIN = strongRain(AIR, INTRO);
        final String NORMAL_RAIN = normalRain(AIR, INTRO);
        final String SHINY_SUN_INTRO = shinySunIntro(INTRO);
        if (motherWeatherValue == 2){
            motherRain = STRONG_RAIN;
        } else if (motherWeatherValue == 1){
            motherRain = NORMAL_RAIN;
        } else if (motherWeatherValue == 0){
            motherRain = SHINY_SUN_INTRO;
        } 
        return motherRain;
    }

    static String marcoWeatherDrawing(final String RESET, final String AIR, final String INTRO, boolean monkeyScaped, boolean monkeyTired){

        String marcoAndMonkeyBody = "";

        final String MARCO_HAIR = "  CCCCCCO";
        final String NORMAL_MARCO = " ( ^ c ^ )";
        final String ANGRY_MARCO = " ( .`_'. ) !!";
        final String CARRY_MONKEY_MARCO = " (- ~ - *)";
        final String MARCO_CHEST = "  /||:||\\";
        final String MARCO_TRUNK = " 0 | _ | 0";
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

        final String CARRY_MONKEY_WEATHER_SPACE = AIR.repeat(20);
        
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
    
        return marcoAndMonkeyBody;
    }

    static String motherCarriage(){

        final String MOM_CARRIAGE = """
                                      ,--.----.----.
              ''.                   o'    '    '    '
              /') '.___.-._.        /||    |    |    |
              'o~)-~-~-~-~)\\-~-~-~'<-_'._,_'._,_'.__,'
                  ( .__.( /( \\'   \\   ,-.      ,-.   /
                  /'\\_. /' '> '    '-( o )----( o )-'
                 /     /   '          `-'      `-'  
        """;

        return MOM_CARRIAGE;
    }

    static String granny(){
        
        final String GRANNY = """
            <--------
                !
              ,,,,
              %"-"%     !?
             ;--/ \\>   ,,,, 
             | /___\\   |''|  @(\")@
             | _/ |_   <[:]>   H~"     
        """;

        return GRANNY;
    }

    static String landscape(final String AIR, final String INTRO, double distanceMotherMarco){
        
        final String ROAD = "_";

        String landscape;
        String distanceDisplayed;
        String spaceForMinis;
        int distanceKilometers;

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
        final String MINI_MOM_CARRIAGE_MIDDLE = "'?__,~~( ))";
        final String MINI_MOM_CARRIAGE_BOTTOM = "<!`'!  o--o";
        final String MINI_MARCO_HAIR = ",,,," + INTRO;
        final String MINI_MARCO_AND_MONKEY_FACES = "|^^|  @(\")@" + INTRO;
        final String MINI_MARCO_AND_MONKEY_BOTTOM = "<[:]>   H~" + INTRO;
        final String KILOMETERS = """

                 | ..........1.........2.........3.........4.........5 |
                 | 012345678901234567890123456789012345678901234567890 |
                 | 000000000000000000000000000000000000000000000000000 |
                 `----------------------------------------------------'
        """;

        if (distanceMotherMarco < 0){
            distanceKilometers = 0;
        } else {
            distanceKilometers = (int) distanceMotherMarco / 10;
        }
        
        distanceDisplayed = ROAD.repeat(distanceKilometers);
        spaceForMinis = AIR.repeat(distanceKilometers);

        landscape =
            MOUNTAINS + INTRO +
            MINI_MOM_CARRIAGE_TOP + spaceForMinis + MINI_MARCO_HAIR +
            MINI_MOM_CARRIAGE_MIDDLE + spaceForMinis + MINI_MARCO_AND_MONKEY_FACES +
            MINI_MOM_CARRIAGE_BOTTOM + distanceDisplayed + MINI_MARCO_AND_MONKEY_BOTTOM +
            KILOMETERS;

        return landscape;
    }

    static String endingDrawing(boolean motherFound, final String INTRO){

        final String HAPPY_ENDING = """
              _____ ___ _   _    _    _          _____ _____ _     ___ _____  _ 
             |  ___|_ _| \\ | |  / \\  | |        |  ___| ____| |   |_ _|__  / | |
             | |_   | ||  \\| | / _ \\ | |        | |_  |  _| | |    | |  / /  | |
             |  _|  | || |\\  |/ ___ \\| |___     |  _| | |___| |___ | | / /_  |_|
             |_|   |___|_| \\_/_/   \\_\\_____|    |_|   |_____|_____|___/____| (_) 
    
                             ,-~'' `'-.
                            ; /'--.__.;.
                            . C| ^ ,^|J.
                            : '\\ '-- / ;
                            ;   ';-:' .' 
                            ;.-~'' '`~-.
                            //(       )\\\\
                           //  \\     /  \\\\
                           \\\\  )     (   \\\\
                            () =+=====    ()  CCCCCCO
              (_)             /  |.   \\     \\( ^ c ^ )   _,,,,,_  
            (_)@(_)  wWWWw   |   |.    |       ||:||\\  (d ^   ^ b)  vVVVv    (_)  
              (_)\\   (___)   |   |.    |       | _ | 0   ( (Y) )    (___)  (_)@(_)
                 |     Y     |   |.    |       || ||      |   |       Y     /(_)
                \\|/   \\|/    |__/_\\____|      (_)(_)    (")_(")_/    \\|/   \\|/               
        """;
        final String GRASS = "^v^V";
        final String ENDING_GRASS = GRASS.repeat(19);

        final String THE_END = 
            HAPPY_ENDING + 
            ENDING_GRASS +
            INTRO;
        
        return THE_END;
    }

    static String cleanScreen(){
        return "\033[H\033[2J";
    }
}