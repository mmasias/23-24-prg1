package ejercicios;

import java.util.Scanner;

class ExamenAutomaticoV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstFactor = 0;
        int difficulty = 0;

        int menuSelection;
        final int SETTINGS = 1;
        final int START_TEST = 2;
        final int SHUT_PROGRAM = 3;
        boolean isWorking=true;

        do {
            printMenu();
            menuSelection = scanner.nextInt();

            if (menuSelection == SETTINGS) {

                firstFactor = preguntaEntero(2,10,"Dime un valor entre 2 y 10");
                difficulty = preguntaEntero(1, 3, "Dime la dificultad (1:easy / 2: medium / 3:hard):");

            } else if (menuSelection == START_TEST && firstFactor != 0) {
                    startTest(firstFactor, difficulty, scanner);
            } else if (menuSelection == SHUT_PROGRAM){
                isWorking=!isWorking;
            }
        } while (isWorking);
        System.out.println("Hasta luego!");
    }


    
    private static int preguntaEntero(int valorMinimo, int valorMaximo, String mensaje) {
        int valorPorDevolver=0;
        do {
            System.out.println("=".repeat(mensaje.length()));
            System.out.println(mensaje);
            System.out.println("=".repeat(mensaje.length()));
            valorPorDevolver = new Scanner(System.in).nextInt();
        } while (!(valorPorDevolver>=valorMinimo && valorPorDevolver<=valorMaximo));
        return valorPorDevolver;        
    }







    private static void printMenu() {
        System.out.println(
                "--- MENU PRINCIPAL ---" + "\n1. Configuración" + "\n2. Ejecución del Test" + "\n3. Salir del sistema");
    }

    private static void printDifficultyMenu() {
        System.out.println("Elija la dificultad del Test." + "\n1. Fácil" + "\n2. Normal" + "\n3. Avanzado");
    }

    private static void testSetUp(int firstFactor, Scanner scanner, int difficulty) {
        System.out.println("Ingrese un número entre 2 y 10.");
        firstFactor = scanner.nextInt();
        while (firstFactor < 2 || firstFactor > 10) {
            System.out.println("Debe escoger un número válido!");
            System.out.println("Ingrese nuevamente un número entre 2 y 10.");
            firstFactor = scanner.nextInt();
        }

        printDifficultyMenu();
        difficulty = scanner.nextInt();

        while (difficulty < 1 || difficulty > 3) {
            System.out.println("Debe escoger un nivel de dificultad válido!");
            printDifficultyMenu();
            difficulty = scanner.nextInt();
        }
    }

    private static void startTest(int firstFactor, int difficulty, Scanner scanner) {
        final int EASY = 1;
        final int NORMAL = 2;
        final int HARD = 3;
        double points = 0;
        int wellAnswered = 0;
        int wrongAnswered = 0;
        int questions = 5;

        int secondFactor = 0;
        for (int i = 1; i<= questions; i++) {
            if (difficulty == EASY) {
                secondFactor = (int) (Math.random() * (5) + 1);
            } else if (difficulty == NORMAL) {
                secondFactor = (int) (Math.random() * (9) + 1);
            } else if (difficulty == HARD) {
                secondFactor = (int) (Math.random() * (6) + 4);
            }

            System.out.println("Cuanto es " + firstFactor + " x " + secondFactor + " ?");
            int userAnswer = scanner.nextInt();
            int rightAnswer = firstFactor * secondFactor;

            if (userAnswer == rightAnswer) {
                points = points + 2;
                wellAnswered++;
            } else if (userAnswer != rightAnswer) {
                points = points - 0.5;
                wrongAnswered++;
            }
        }
    }
}
