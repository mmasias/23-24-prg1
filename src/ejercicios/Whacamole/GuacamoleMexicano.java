import java.util.Scanner;

class GuacamoleMexicano {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int turnos = 0;
        final int TURNOS_MAXIMOS = 15;
        int aciertos = 0;

        for (turnos = 0; turnos <= TURNOS_MAXIMOS; turnos++) {
            System.out.println("Elige qué casilla quieres golpear");
            int casilla = scanner.nextInt();
            int casillaOcupada = (int) (Math.random() * (16 - 1) + 1);

            if (casilla == casillaOcupada) {
                aciertos++;
            }
            printBoard(casilla, casillaOcupada, turnos, aciertos);
        }

    }

    private static void printBoard(int golpe, int monigote, int turnos, int aciertos) {

        final String MONIGOTE = "('')";
        final String MARTILLO = "[[]]";
        final String VACIO = "(  )";
        final String GOLPE = "['']";
        String queImprimir = "";

        System.out.println("Golpe en [" + golpe + "] / Monigote en [" + monigote + "]");

        for (int fila = 1; fila <= 4; fila++) {
            for (int columna = 1; columna <= 4; columna++) {
                int posicion = columna + 4 * (fila - 1);

                queImprimir = VACIO;
                if (posicion == golpe && golpe == monigote) {
                    queImprimir = GOLPE;
                } else if (posicion == golpe) {
                    queImprimir = MARTILLO;
                } else if (posicion == monigote) {
                    queImprimir = MONIGOTE;
                } 
                System.out.print(queImprimir);
            }
            System.out.println();
        }

    }
}
