package roseteEirik.retoCaracol;
import java.util.Scanner;

class ElCaracol{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double deepSnail = (double)Math.round(((Math.random() * 10) + 10) * 100d) / 100d;
        int deepMax = 20;
        int day = 0;
        boolean snailIn = true;
        boolean snailAlive = true;
        String inputUser;

        System.out.println("\n\nEl dia [" + day + "] el caracol cayo hasta [" + deepSnail + "] metros");

        double goingUpMax = 4;
        double goingUpMin = 1;

        double goingDownMax = 2;
        double goingDownMin = 0;

        while(snailIn && snailAlive){
           
            day++;
            System.out.println("\nDia " + day);

            if (day == 50){
                snailAlive = false;
                System.out.println("El caracol ha muerto\n\n");
                continue;
            }
            if (day == 20){
                goingUpMax = goingUpMax - 1;
            }
            if (day == 10){
                goingUpMax = goingUpMax - 1;
            }

            double snailGoingUp = (double)Math.round((Math.random()*(goingUpMax - goingUpMin) + goingUpMin) * 100d) / 100d;
            System.out.println("\nEl caracol subio [" + snailGoingUp + "] metros");
            deepSnail = Math.round((deepSnail - snailGoingUp)* 100d) / 100d;

            if (deepSnail < 0){
                snailIn = false;
                System.out.println("\nEl caracol se encuentra a [" + deepSnail + "] metros de llegar a la superficie");
                System.out.println("\nEl caracol ha salido del pozo!\n\n");
                continue;
            }
            
            double snailGoingDown = (double)Math.round(Math.random()*(goingDownMax - goingDownMin) * 100d) / 100d;
            double carProbability = (double)Math.random();
            double rainProbability = (double)Math.random();

            deepSnail = Math.round((deepSnail + snailGoingDown)* 100d) / 100d;

            System.out.println("El caracol cayo [" + snailGoingDown + "] metros\n");

            if (carProbability <= 0.35) {
                deepSnail = deepSnail + 2;
                System.out.println("Oh no! Un auto ha pasado y el caracol ha caido 2 metros\n");
            }
            if (rainProbability <= 0.05) {
                deepMax = deepMax - 5;
                System.out.println("El caracol esta de suerte! Ha llovido fuertemente y se ha reducido en 5 metros la profundidad del pozo\n");
            } else if (rainProbability <= 0.15) {
                deepMax = deepMax - 2;
                System.out.println("Acaba de llover ligeramente, se ha reducido en 2 metros la profundidad del pozo\n");
            }
            if (deepSnail >= deepMax){
               deepSnail = deepMax; 
            }

            System.out.println("El caracol se encuentra a [" + deepSnail + "] metros de llegar a la superficie");

            inputUser = scanner.nextLine();

        }
    }
}