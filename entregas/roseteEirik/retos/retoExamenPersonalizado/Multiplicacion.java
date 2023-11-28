package roseteEirik.retos.retoExamenPersonalizado;
import java.util.Scanner;

class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean takingTest = true;
        boolean readyForTest = false;
        
        int difficultyLevelChosen = 0;    
        int firstFactor = 0;
        int secondFactor = 0;

        cleanScreen();
        
        do {
            mainMenu();

            int mainMenuSelection = scanner.nextInt();
            cleanScreen();

            if (mainMenuSelection == 1){
                firstFactor = firstFactor(firstFactor);
                difficultyLevelChosen = difficultyLevel(difficultyLevelChosen);
                cleanScreen();
                readyForTest = true;
            } else if (mainMenuSelection == 2){
                if (readyForTest){
                    startTest(firstFactor, secondFactor, difficultyLevelChosen);
                } else {
                    cleanScreen();
                    error();
                    cleanScreen();
                }
            } else if (mainMenuSelection == 3){
                takingTest = !takingTest;
            } 
        } while (takingTest);

    }

    static void mainMenu(){
        final String design = """
             -o-=-o- BIENVENIDO -o-=-o-
            
               Seleccione una opcion:

               [1] Configuracion
               [2] Ejecucion del test
               [3] Salir del sistema

            -o-=-o-=-o-=-  -=-o-=-o-=-o-
            """;
        System.out.println(design);
    }

    static int firstFactor(int firstFactor){
        Scanner scanner = new Scanner(System.in);

        final int MIN_FIRST_FACTOR = 2; 
        final int MAX_FIRST_FACTOR = 10; 

        do {
            cleanScreen();
            System.out.print("Escoja el primer factor entre 2 y 10: ");
            firstFactor = scanner.nextInt();
        } while (firstFactor < MIN_FIRST_FACTOR || firstFactor > MAX_FIRST_FACTOR);

        return firstFactor;
    }

    static int difficultyLevel (int difficultyLevelChosen){
        Scanner scanner = new Scanner(System.in);

        final int MIN_DIFFICULTY_CHOSEN = 1;
        final int MAX_DIFFICULTY_CHOSEN = 3;
        String difficultyLevel = "";
        
        do {
            cleanScreen();
            difficultyLevel = """
                Escoja el nivel de dificultad presionando el numero que tenga al lado:
                - [1] Facil
                - [2] Normal
                - [3] Dificil
                """;
                System.out.println(difficultyLevel);
                difficultyLevelChosen = scanner.nextInt();
        } while (difficultyLevelChosen < MIN_DIFFICULTY_CHOSEN || difficultyLevelChosen > MAX_DIFFICULTY_CHOSEN);

        return difficultyLevelChosen;
    }

        
    static int secondFactor(int difficultyLevelChosen, int secondFactor){
            
        if (difficultyLevelChosen == 1){
            secondFactor = (int) (Math.random() * 6 + 1);
        } else if (difficultyLevelChosen == 2){
            secondFactor = (int) (Math.random() * 10 + 1);
        } else if (difficultyLevelChosen == 3){
            secondFactor = (int) (Math.random() * 6 + 5);
        }
        
        return secondFactor;
    }

    static void startTest(int firstFactor, int secondFactor, int difficultyLevelChosen){
        Scanner scanner = new Scanner(System.in);
       
        final int MAX_OPERATIONS = 5;
        final double REMOVE = 0.5; 
        final double ADD = 2; 
        final double TEST_PASSED = 5; 

        int rightAnswer = 0;
        int playerAnswer = 0;

        double score = 0;

        String message = "";
        String testResult = "";

        for(int operations = 1; operations <= MAX_OPERATIONS; operations++){
            System.out.println("Puntaje: " + score);

            secondFactor = secondFactor(difficultyLevelChosen, secondFactor);
            rightAnswer = firstFactor * secondFactor;

            System.out.print("\n" + firstFactor + " x " + secondFactor + " = ");

            playerAnswer = scanner.nextInt();

            if (playerAnswer == rightAnswer){
                score = score + ADD;
                message = """

                    Muy bien! Sumas 2 puntos  
                    Pulsa ENTER para continuar  
                    """;
            } else {
                score = score - REMOVE;
                message = """

                    Muy bien! Sumas 2 puntos  
                    Vaya... parece que te equivocaste y perdiste 0.5 puntos
                    """;
            }

            System.out.print(message);
            pause();
            cleanScreen();
        }
        
        System.out.println("Tu calificacion final fue... " + score + " puntos!");
        pause();

        boolean testPased = score >= TEST_PASSED;
        if (testPased){
            testResult = "Aprobaste!!! Felicidades :D";
        } else {
            testResult = "Vaya decepcion... Reprobaste \nIntentalo de nuevo!";
        }

        System.out.println(testResult);
        pause();
        cleanScreen();
    }

    static void error(){
        String message = "";
        message = """
            Error,configure antes de empezar el test
            Pulsa ENTER para continuar
            """;
        System.out.println(message);
        pause();
    }

    static void pause(){
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();
    }
        
    static void cleanScreen(){
        System.out.println("\033[H\033[2J");
    }
}
