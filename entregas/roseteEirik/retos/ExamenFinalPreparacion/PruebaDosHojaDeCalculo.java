package roseteEirik.retos.ExamenFinalPreparacion;
import java.util.Scanner;

class PruebaDosHojaDeCalculo {

        static final int UP = 0;
        static final int DOWN = 1;
        static final int RIGHT = 2;
        static final int LEFT = 3;
        static final int VALUE = 4;
        static final int QUIT = 5;
        static final int NOTHING = 999;

    public static void main(String[] args) {

        int[][] spreadsheet = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
    
        int[] cursorCoordinates = {0, 0};

        while(!quitProgram()){
            printSpreadsheet(spreadsheet);
        }
    }

    static char charInput() {
        Scanner input = new Scanner(System.in);
        String inputUsuario = input.nextLine() + "x";
        return inputUsuario.charAt(0);
    }

    static void doAction(int[] cursorCoordinates, String[] elMundo) {

        if (captureAction() == UP) {
            move(cursorCoordinates, UP, )
        } else if (captureAction() == DOWN) {
        } else if (captureAction() == RIGHT) {
        } else if (captureAction() == LEFT) {
        } else if (captureAction() == VALUE) {
        } else if (captureAction() == QUIT) {
        }
    }
    
    static int captureAction() {

        if (charInput() == 'S' || charInput() == 's'){
            return UP;
        } else if (charInput() == 'W' || charInput() == 'w'){
            return DOWN;
        } else if (charInput() == 'A' || charInput() == 'a'){
            return RIGHT;
        } else if (charInput() == 'd' || charInput() == 'D'){
            return LEFT;
        } else if (charInput() == 'E' || charInput() == 'e'){
            return VALUE;
        } else if (charInput() == 'Q' || charInput() == 'q'){
            return QUIT;
        }

        return NOTHING;
    }

    static void printSpreadsheet(int[][] spreadsheet) {

        printLetter(spreadsheet);
        division(spreadsheet);
        for (int row = 0; row < spreadsheet.length; row++){
            printNumber(row);
            for (int column = 0; column < spreadsheet[row].length; column++){
                System.out.print("|" + graph(spreadsheet[row][column]));
            }
            System.out.println("|");
        }
        division(spreadsheet);
    }

    static void division(int[][] spreadsheet) {
        System.out.println(" ".repeat(5) + "+-------".repeat(spreadsheet[0].length) + "+");
    }

    static void printLetter(int[][] spreadsheet) {
        char mayusA = 'A';
        System.out.print(" ".repeat(6));
        for(char letter = 'A'; letter < (int) ((mayusA) + (spreadsheet[0].length)); letter++){
            System.out.print(letter + " ".repeat(7));
        }
        System.out.println();
    }

    static void printNumber(int number) {
        System.out.print(number + 1 + " ".repeat(5-digits(number + 1)));
    }

    static int digits(int number) {
        int count = 0;
        while (number != 0) {
        number = number / 10;
        ++count;
        }
        return count;
    }

    static String graph(int value) {
        String graph[] = {" ".repeat(7)};
        return graph[value];
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(double seconds) {
        try {
            Thread.sleep((int) (1000 * seconds));
        } catch (InterruptedException e) {
        }
    }
}
