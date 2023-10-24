import java.util.Scanner;

class ElCaracol{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int deepSnail = (int) (Math.random() * 10) + 10;
        int day = 0;
        boolean snailIn = true;
        boolean snailAlive = true;

        System.out.println("El dìa [" + day + "] el caracol cayo hasta [" + deepSnail + "]");

        while(snailIn && snailAlive){
            day++;
        }

    }
}