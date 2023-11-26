package roseteEirik.retoGuacamole;
import java.util.Scanner;

class monigoteBigote {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final int MAX_TURNS = 15;
        int playerChoice = 0;
        String messageTurn = "";

        for (int turn = 1; turn <= MAX_TURNS; turn++){
            playerChoice = scanner.nextInt();
            messageTurn = "Golpe en [" + playerChoice + "]";
            System.out.println(messageTurn);
        }    
    }
    static String cleanScreen(){
        return "\033[H\033[2J";
    }
}
