package roseteEirik.retoTelefono;

import java.util.Scanner;

class TelefonoDescacharrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputUser;

        final int MINIMUN_KIDS_QUANTITY_START_PLAYING = 5;
        final int LIMIT_TIME = 120;

        final int ONE = 1;        
        final int RESET = 0;
        final String INTRO = "\n";

        int kids = 0;
        int kidsLeft = 0;
        int minutes = 0;
        int lydia = 0;
        int aisha = 0;

        String minuteRecap = "";
        String initialMessage = "";
        boolean playingGame = false;
        boolean closingTime = false;

        do {

            minutes++;
            System.out.println("Minuto " + minutes);

            kids = numberOfKids(minutes, kids, ONE, INTRO);

            if (playingGame) {
                lydia = kids - aisha;
            } else {
                aisha = kids;
                lydia = RESET;
            }
            minuteRecap = 
                "Lydia tiene [" + lydia + "] criaturas" + INTRO +
                "Aisha tiene [" + aisha + "] criaturas" + INTRO +
                kidDraw(aisha, lydia, INTRO) + INTRO;

            int kidFinishedTurn = 1;

            if (aisha >= MINIMUN_KIDS_QUANTITY_START_PLAYING && !playingGame) {
                initialMessage = "Mola el reto";
                minuteRecap = minuteRecap + "Inician a jugar y el mensaje que Aisha usa es: " + initialMessage + INTRO;
                playingGame = true;
                kidsLeft = aisha;
            } else if (playingGame) {
                if (kidsLeft != 0) {
                    kidsLeft = kidsLeft - kidFinishedTurn;
                    initialMessage = alteredMessage(initialMessage, kids);
                    minuteRecap = minuteRecap + messageDraw(aisha, kidsLeft, ONE, INTRO) + initialMessage;
                } else if (kidsLeft == 0) {
                    playingGame = false;
                    initialMessage = "El mensaje final es: " + alteredMessage(initialMessage, kidsLeft);
                    minuteRecap = minuteRecap + initialMessage;
                }
            }

            if (minutes >= LIMIT_TIME && playingGame == false) {
                closingTime = true;
                minuteRecap = minuteRecap + INTRO + "Hora de cerrar, gracias por visitarnos";
            }

            System.out.println(minuteRecap);
            inputUser = scanner.nextLine();
            System.out.println(cleanScreen());

        } while (!closingTime);
    }

    static int numberOfKids(int minutes, int kids, final int ONE, final String INTRO) {

        final int TEN_MINUTES = 10;
        final int TWENTY_MINUTES = 20;

        final double TWO_KIDS_FIRST_TEN_MINUTES_PROBABILITY = 0.33;
        final double ONE_KID_FIRST_TEN_MINUTES_PROBABILITY = 0.66;
        final double ONE_KID_NEXT_TWENTY_MINUTES_PROBABILITY = 0.50;

        final int TWO_KIDS = 2;
        final int ONE_KID = 1;

        final int DIVISIBLE_BY_THREE = 3;

        String kidsComingMessage = "";

        double kidProbability = Math.random();
        if (minutes <= TEN_MINUTES) {
            kidsComingMessage = "Vienen muchas criaturas" + INTRO;
            if (kidProbability <= TWO_KIDS_FIRST_TEN_MINUTES_PROBABILITY) {
                kids = kids + TWO_KIDS;
            } else if (kidProbability <= ONE_KID_FIRST_TEN_MINUTES_PROBABILITY) {
                kids = kids + ONE_KID;
            }
        } else if (minutes <= (TEN_MINUTES + TWENTY_MINUTES)) {
            kidsComingMessage = "Puede que lleguen algunas criaturas" + INTRO;
            if (ONE == minutes % DIVISIBLE_BY_THREE) {
                if (kidProbability <= ONE_KID_NEXT_TWENTY_MINUTES_PROBABILITY) {
                    kidsComingMessage = kidsComingMessage + "Si que llego otra" + INTRO;
                    kids = kids + ONE_KID;
                } else {
                    kidsComingMessage = kidsComingMessage + "Parece que no..." + INTRO;
                }
            }
        } else if (minutes == TEN_MINUTES + TWENTY_MINUTES + ONE) {
            kidsComingMessage = "Parece que ya no llegaran mas criaturas" + INTRO;
        }

        System.out.println(kidsComingMessage);
        return kids;
    }

    static String alteredMessage(String initialMessage, int kids) {

        String alteration = "";
        double oneLetterAlteredProbability = 0.5;

        double lettersChanged = Math.random();
        if (lettersChanged < oneLetterAlteredProbability) {
            alteration = "X";
        } else {
            alteration = "XX";
        }
        return initialMessage + alteration;
    }
    
    static String kidDraw(int aisha, int lydia, final String INTRO){
        final String LINE = "=-o-=";
        final String LINE_MARK = INTRO + LINE.repeat(aisha) + INTRO;
        final String KID = "[^^] ";
        String kidLydia = KID.repeat(lydia);
        String kidAisha = KID.repeat(aisha);
        return kidLydia + LINE_MARK + kidAisha;
    }

    static String messageDraw(int aisha, int kidsLeft, final int ONE, final String INTRO){
        final String AIR = "     ";
        final String MESSAGE_DRAW_TOP = "  |\\ ";
        final String MESSAGE_DRAW_BOTTOM = " (==)";
        String messageDrawTop = AIR.repeat(aisha - kidsLeft - ONE) + MESSAGE_DRAW_TOP;
        String messageDrawBottom = AIR.repeat(aisha - kidsLeft - ONE) + MESSAGE_DRAW_BOTTOM;
        String messageDraw = messageDrawTop + INTRO + messageDrawBottom;
        return messageDraw + INTRO;
    }

    static String cleanScreen() {
        return "\033[H\033[2J";
    }
}