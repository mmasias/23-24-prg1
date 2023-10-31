package roseteEirik.retoCamello;
import java.util.Scanner;

class ElCamello {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        final String TRACK_WALL = "---+-----------+---------+---------+---------+---------+-----------+\n";
        final String TRACK_TENS = "---| 0.........1.........2.........3.........4.........5.........6 |\n";
        final String TRACK_UNITS = "---| 0123456789012345678901234567890123456789012345678901234567890 |\n";
        final String CAMEL = ",~~;'\n";
        final String PLAYER_TRACK = "[J]|"; 
        final String COMPUTER_TRACK = "[C]|"; 
        final String SPACE = " ";

        final double FIRST_HOLE = 0.60;
        final double SECOND_HOLE = 0.40;
        final double THIRD_HOLE = 0.30;
        final double FOURTH_HOLE = 0.10;
        final double fallingProbability = 0.10;
        final int RESET = 0;
        boolean camelBeforeFinishLine = true;
        boolean gameContinue = true;
        boolean noSkipPlayerTurn = true;
        int afterTwoTurns = 0;
        int camelPosition = 0;
        int turn = 0;
        int fail = 0;
        int playerChoice;
        String inputUser; 

        final double COMPUTER_ONE = 0.33;
        final double COMPUTER_TWO = 0.66;
        int computerCamel = 0;

        System.out.println("INICIA LA CARRERA");

        while(camelBeforeFinishLine && gameContinue){
            
            String topTrack =
            ("\n") +
            (TRACK_WALL) +
            (TRACK_TENS) +
            (TRACK_UNITS) +
            (TRACK_WALL) +
            (PLAYER_TRACK);
        System.out.print(topTrack);
        for(int units = 0;units <= camelPosition; units++){
            System.out.print(SPACE);
        }
        String middleTrack =
            (CAMEL) +
            (TRACK_WALL) +
            (COMPUTER_TRACK);
        System.out.print(middleTrack);
        for(int units = 0;units <= computerCamel; units++){
            System.out.print(SPACE);
        }
        String bottomTrack =
            (CAMEL) +
            (TRACK_WALL);
        System.out.println(bottomTrack);

            if(turn == 50){
                gameContinue = false;
                System.out.println("\n\nSe ha alcanzado el numero maximo de turnos\n\n");
                continue;
            }
            if(camelPosition >= 60){
                camelBeforeFinishLine = false;
                System.out.println("\nAnte todo pronostico tu camello ha llegado a la meta! Has ganado!\n\n");
                continue;
            }
            if(computerCamel >= 60){
                camelBeforeFinishLine = false;
                System.out.println("\nEl camello del ordenador ha llegado antes y te ha dejado en ridiculo!\n\n");
                continue;
            }

            turn++;
            System.out.println("\nTurno " + turn);

            double fallingCamel = Math.random();
            if(fallingCamel < fallingProbability){
                if(noSkipPlayerTurn){
                    System.out.print("\nOh no! Tu camello ha tropezado y pierdes dos turnos\n");
                    afterTwoTurns = turn;
                    noSkipPlayerTurn = false;
                }
            }            
            if(afterTwoTurns == turn - 2){
                noSkipPlayerTurn = true;
            }

            if(noSkipPlayerTurn){
                System.out.print("Elija un agujero: ");
                playerChoice = scanner.nextInt();
                double bullsEye = Math.random();

                if(playerChoice == 1 && bullsEye < FIRST_HOLE){
                    camelPosition++;
                    fail = RESET;
                    System.out.println("\nAvanza [1]");
                }else if(playerChoice == 2 && bullsEye < SECOND_HOLE){
                    camelPosition = camelPosition + 2;
                    fail = RESET;
                    System.out.println("\nAvanza [2]");
                }else if(playerChoice == 3 && bullsEye < THIRD_HOLE){
                    camelPosition = camelPosition + 4;
                    fail = RESET;
                    System.out.println("\nAvanza [4]");
                }else if(playerChoice == 4 && bullsEye < FOURTH_HOLE){
                    camelPosition = camelPosition + 6;
                    fail = RESET;
                    System.out.println("\nAvanza [6]");
                }else{
                    fail++;
                    System.out.println("\nHas fallado [" + fail + "] tiro(s),");
                }    
            }else{
                inputUser = scanner.nextLine();
            }
            if(fail == 3){
                System.out.println("Tu camello comienza desde 0");
                fail = RESET;
                camelPosition = RESET;
            }

            double computerProbability = Math.random();
            
            if(computerProbability < COMPUTER_ONE){
                computerCamel++;
            }else if(computerProbability < COMPUTER_TWO){
                computerCamel = computerCamel + 2;
            }else{
                computerCamel = computerCamel + 3;
            }

            String result =
                ("\nTu camello esta en la casilla [" + camelPosition + "]\n") +
                ("El camello del ordenador esta en la casilla [" + computerCamel + "]");
            System.out.println(result);
        }
    }
}