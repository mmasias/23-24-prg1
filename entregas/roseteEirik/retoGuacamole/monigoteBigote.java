package roseteEirik.retoGuacamole;
import java.util.Scanner;

class MonigoteBigote {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String inputUser;

        final int MAX_TURNS = 15;
        int playerChoice = 0;
        int totalHits = 0;
    
        int mole = 0;
        int moleTwo = 0;

        int moleLastPosition = 0;
        int moleTwoLastPosition = 0;

        final String DIVISION_NEXT_TURN = "=".repeat(30);
        final String INTRO = "\n";
        String messageTurn = "";
        String messageHitOrFail = "";

        for (int turn = 1; turn <= MAX_TURNS; turn++){

            System.out.print("Golpe entre 1 y 16: ");
            
            playerChoice = scanner.nextInt();
            System.out.print(cleanScreen());
            
            do {

                do {
                    mole = (int) (Math.random() * 16 + 1);
                } while (mole == moleLastPosition);

                do {
                    moleTwo = (int) (Math.random() * 16 + 1);
                } while (mole == moleTwo || moleTwoLastPosition == moleTwo);

            } while (moleLastPosition == moleTwo || moleTwoLastPosition == mole);

            if (playerChoice == mole || playerChoice == moleTwo){
                totalHits++;
                messageHitOrFail = "[ACIERTO]";
            } else {
                messageHitOrFail = "[FALLO]";
            }
            messageTurn = 
                "Golpe en [" + playerChoice + "] / Monigotes en [" + mole + "," + moleTwo + "]" +
                drawBoardGame(playerChoice, mole, moleTwo) + INTRO +
                "Turno [" + turn + "] / Aciertos [" + totalHits + "]" + INTRO +
                messageHitOrFail + INTRO +
                DIVISION_NEXT_TURN;
            System.out.println(messageTurn);

            moleLastPosition = mole;
            moleTwoLastPosition = moleTwo;
        }    
    }
    static String drawBoardGame(int playerChoice, int mole, int moleTwo){
        final int MAX_ROWS = 4;
        final int MAX_COLUMNS = 4;

        final String INTRO = "\n";
        final String LINE = "-".repeat(28);
        final String DIVISION = INTRO + "+" + LINE + "+";

        final String EMPTY_BOX = "(  )  ";
        final String MOLE = "('')  ";
        final String SECOND_MOLE = "(**)  ";
        final String HAMMER = "[[]]  "; 
        final String HIT_MOLE = "[><]  ";
        
        String draw = DIVISION;
        int position = 0;

        for (int totalRows = 0; totalRows < MAX_ROWS; totalRows++){
            draw = draw + INTRO + "|   ";
            for (int totalColumns = 0; totalColumns < MAX_COLUMNS; totalColumns++){
                position++;
                if (position == mole && position == playerChoice){
                    draw = draw + HIT_MOLE;
                } else if (position == moleTwo && position == playerChoice){
                    draw = draw + HIT_MOLE;
                } else if (position == mole){
                    draw = draw + MOLE;
                } else if (position == moleTwo){
                    draw = draw + SECOND_MOLE;
                } else if (position == playerChoice){
                    draw = draw + HAMMER;
                } else {
                    draw = draw + EMPTY_BOX;
                }
            }
            draw = draw + " |";
        }
        draw = draw + DIVISION;
        return draw;
    }
    static String cleanScreen(){
        return "\033[H\033[2J";
    }
}