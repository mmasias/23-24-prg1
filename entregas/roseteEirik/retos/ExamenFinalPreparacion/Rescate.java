package roseteEirik.retos.ExamenFinalPreparacion;

import java.util.Scanner;

class Rescate {   
    public static void main(String[] args) {

        int[][] ocean = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
        };

        addSoldiers(ocean);

        for (int movements = 0; movements < 50; movements++){
            printOcean(ocean);
        }
        

    }

    private static void printOcean(int[][] ocean) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la fila: ");
        int playerRow = scanner.nextInt();
        System.out.print("Ingrese la columna: ");
        int playerColumn = scanner.nextInt();
        
        int[] coordinates = {playerRow, playerColumn};

        cleanScreen();
        printNumberColumn(ocean);
        division(ocean);
        for (int row = 0; row < ocean.length; row++){
            printNumberRow(row);
            System.out.print("|");
            for (int column = 0; column < ocean[row].length; column++){
                if (row == coordinates[0] && column == coordinates[1]){
                    System.out.print(drawGraph(ocean[row][column]));
                } else {
                    System.out.print(drawGraph(2));
                }
            }
            System.out.println("|");
        }
        division(ocean);
    }

    static void division(int[][] ocean) {
        System.out.println("   +" + "---".repeat(ocean[0].length) + "+");
    }

    static void printNumberColumn(int[][] ocean) {
        System.out.print("    ");
        for (int number = 0; number < ocean[0].length; number++){
            System.out.print(" " + number + " ");
        }
        System.out.println();
    }

    static void printNumberRow(int number) {
        System.out.print(number + " ".repeat(3-digits(number)));
    }

    static int digits(int number) {
        int count = 0;
        while (number != 0) {
        number = number / 10;
        ++count;
        }
        if (number == 0){
            count = 1;
        }
        return count;
    }

    static String drawGraph(int value) {

        String[] draw = {" ~ ","\\O/", " . "};

        return draw[value];
    }

    static void addSoldiers(int[][] ocean) {
        int soldiersInTheOcean = 0;
        do{
            soldiersInTheOcean = 0;
            for (int row = 0; row < ocean.length; row++){
                for (int column = 0; column < ocean[row].length; column++){
                    if (Math.random() < 0.25 && soldiersInTheOcean < 16){
                        ocean[row][column] = ocean[row][column] != 1 ? 1 : 0;
                        soldiersInTheOcean++;
                    }
                }
            }
        } while(soldiersInTheOcean < 16);
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