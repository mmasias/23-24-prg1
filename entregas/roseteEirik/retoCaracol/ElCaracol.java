import java.util.Scanner;

class ElCaracol{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double deepSnail = (double) (Math.random() * 10) + 10;
        int day = 0;
        boolean snailIn = true;
        boolean snailAlive = true;
        String inputUser;

        System.out.println("El dia [" + day + "] el caracol cayo hasta [" + deepSnail + "] metros");

        double goingUpMax = 4;
        double goingUpMin = 1;

        double goingDownMax = 2;
        double goingDownMin = 0;

        while(snailIn && snailAlive){
            day++;
            System.out.println("\nDia " + day);

            double snailGoingUp = (double)(Math.random()*(goingUpMax - goingUpMin) + goingUpMin);
            double snailGoingDown = (double)(Math.random()*(goingDownMax - goingDownMin));

            deepSnail = deepSnail + snailGoingUp - snailGoingDown;

            System.out.println("El caracol subio [" + snailGoingUp + "] metros\n");
                ("El caracol se encuentra en [" + deepSnail + "] metros");

            inputUser = scanner.nextLine();

            if (deepSnail >= 20){
                snailIn = false;
                System.out.println("El caracol ha salido del pozo!");
            else
                ("El caracol cayo [" + snailGoingDown + "] metros\n");
            }
            if(day == 50){
                snailAlive = false;
                System.out.println("El caracol ha muerto");
            }
        }

    }
}