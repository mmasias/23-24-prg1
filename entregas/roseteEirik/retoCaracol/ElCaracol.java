import java.util.Scanner;

class ElCaracol{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double deepSnail = (double) (Math.random() * 10) + 10;
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
            if (deepSnail < 0){
                snailIn = false;
                System.out.println("El caracol ha salido del pozo!\n\n");
                continue;
            }
            
            System.out.println("\nDia " + day);

            double snailGoingUp = (double)(Math.random()*(goingUpMax - goingUpMin) + goingUpMin);
            double snailGoingDown = (double)(Math.random()*(goingDownMax - goingDownMin));

            deepSnail = deepSnail - snailGoingUp + snailGoingDown;

            System.out.println("\nEl caracol subio [" + snailGoingUp + "] metros");
            System.out.println("El caracol cayo [" + snailGoingDown + "] metros\n");
            System.out.println("El caracol se encuentra a [" + deepSnail + "] metros de llegar a la superficie");

            inputUser = scanner.nextLine();

        }

    }
}