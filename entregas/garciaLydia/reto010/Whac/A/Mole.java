package entregas.garciaLydia.reto010.Whac.A;

import java.util.Scanner;

public class Mole {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int agujeroElegido;
        int aciertos = 0;
        int agujeroMonigote1;
        int agujeroMonigote2;
        int intentos;
        intentos = 15;

        for (int i = 0; i < intentos; i--) {
        }

        do {
            System.out.print("        ");
            System.out.print("Escoje un agujero entre el 1 y el 16: ");
            agujeroElegido = entrada.nextInt();
            System.out.println("");

            agujeroMonigote1 = (int) (Math.random() * (16) + 1);
            agujeroMonigote2 = (int) (Math.random() * (16) + 1);
            intentos = intentos - 1;

            if (agujeroElegido == (agujeroMonigote1 | agujeroMonigote2)) {
                aciertos++;


            }
            if (agujeroElegido > 16) {
                System.out.print("        ");
                System.out.print("Ese agujero no existe");
            }

            do {
                agujeroMonigote2 = (int) (Math.random() * (16) + 1);

            } while (agujeroMonigote1 == agujeroMonigote2);


            System.out.print("        ");
            System.out.print("Aciertos:" + aciertos);
            System.out.print("        ");
            System.out.print("Intentos restantes:" + intentos);
            System.out.print("        ");

        } while (intentos == 15 | intentos > 0);


    }

}

