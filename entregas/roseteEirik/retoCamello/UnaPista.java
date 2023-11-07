package roseteEirik.retoCamello;
import java.util.Scanner;

class UnaPista {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        final String TRACK_WALL = "---+-----------+---------+---------+---------+---------+-----------+\n";
        final String TRACK_TENS = "---| 0.........1.........2.........3.........4.........5.........6 |\n";
        final String TRACK_UNITS = "---| 0123456789012345678901234567890123456789012345678901234567890 |\n";
        final String CAMEL = ",~~;'\n";
        final String PLAYER_TRACK = "[J]|"; 
        final String COMPUTER_TRACK = "[C]|"; 
        final String SPACE = " ";

        System.out.print("Inserte la posicion de tu camello: ");
        int position = scanner.nextInt();
        System.out.print("Inserte la posicion del camello del ordenador: ");
        int positionComputer = scanner.nextInt();

        String topTrack =
            ("\n") +
            (TRACK_WALL) +
            (TRACK_TENS) +
            (TRACK_UNITS) +
            (TRACK_WALL) +
            (PLAYER_TRACK);
        System.out.print(topTrack);
        for(int units = 0;units <= position; units++){
            System.out.print(SPACE);
        }
        String middleTrack =
            (CAMEL) +
            (TRACK_WALL) +
            (COMPUTER_TRACK);
        System.out.print(middleTrack);
        for(int units = 0;units <= positionComputer; units++){
            System.out.print(SPACE);
        }
        String bottomTrack =
            (CAMEL) +
            (TRACK_WALL);
        System.out.println(bottomTrack);

    }
}