package entregas.garciaLydia.reto009;
import java.util.Scanner;

public class TelefonoEscacharrado {
    public static void main(String[] args) {
        final int TOTAL_TIME = 120;
        final int MINIMAL_CHILDS = 5;
        int lydia = 0;
        int aisha = 0;
        boolean isPlaying = false;
        String theMessage = "";
        int childTurn = 0;

        for (int minute = 0; minute <= TOTAL_TIME; minute++) {
            cleanScreen();
            System.out.println("=".repeat(30));
            System.out.println("Ludoteca PRG1 - minuto " + minute);
            if (childArrives(minute)) {
                lydia++;
            }
            if (!isPlaying) {
                aisha = aisha + lydia;
                lydia = 0;
                showQueue("Lydia", lydia);
                showQueue("Aisha", aisha);

            } else {
                showQueue("Lydia", lydia);
                showQueue("Aisha", aisha, childTurn);
            }
            if (aisha >= MINIMAL_CHILDS && !isPlaying) {
                isPlaying = true;
                theMessage = "Dicen que el examen estará difícil. ¡Pásalo!";
                System.out.println("Aisha empieza a jugar pasando este mensaje: " + theMessage);
                childTurn = 1;

            } else if (isPlaying) {
                System.out.println("🗨️: " + theMessage);
                theMessage = alteredMessage(theMessage);
                childTurn++;
                isPlaying = childTurn <= aisha;
            }

            new Scanner(System.in).nextLine();
        }
    }

    static String alteredMessage(String theMessage) {
        return theMessage + "X";
    }

    static boolean childArrives(int minute) {
        final double ARRIVAL_PROBABILITY = 0.3;
        final int ARRIVAL_TIME_LIMIT = 40;
        return Math.random() < ARRIVAL_PROBABILITY && minute < ARRIVAL_TIME_LIMIT;
    }

    static void showQueue(String responsible, int numberOfChildren) {
        showQueue(responsible, numberOfChildren, 0);
    }

    static void showQueue(String responsible, int numberOfChildren, int childTurn) {
        final String CHILDREN = "🧒";
        final String SPEAKER = "🗨️ ";

        String queue = childTurn > 0
                ? CHILDREN.repeat(childTurn - 1) + SPEAKER + CHILDREN.repeat(numberOfChildren - childTurn)
                : CHILDREN.repeat(numberOfChildren);
        System.out.println(responsible + " > " + queue);
        System.out.println("-".repeat(30));
    }

    static void cleanScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
