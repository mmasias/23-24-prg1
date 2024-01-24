import java.util.Scanner;

class AdivinarNumero {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        final String INICIO_FINAL_DE_TARJETAS = "+---------------+ \n";
        final String MENSAJE = "Dime (1: SI / 2: NO) si el numero esta en la terjeta";

        String tarjetaUno =
            INICIO_FINAL_DE_TARJETAS +
            "| 1 21 41 61 81 | \n" +
            "| 3 23 43 63 83 | \n" +
            "| 5 25 45 65 85 | \n" +
            "| 7 27 47 67 87 | \n" +
            "| 9 29 49 69 89 | \n" +
            "|11 31 51 71 91 | \n" +
            "|13 33 53 73 93 | \n" +
            "|15 35 55 75 95 | \n" +
            "|17 37 57 77 97 | \n" +
            "|19 39 59 79 99 | \n" +
            INICIO_FINAL_DE_TARJETAS;


        String tarjetaDos =
            INICIO_FINAL_DE_TARJETAS +
            "| 2 22 42 62 82 | \n" +
            "| 3 23 43 63 83 | \n" +
            "| 6 26 46 66 86 | \n" +
            "| 7 27 47 67 87 | \n" +
            "|10 30 50 70 90 | \n" +
            "|11 31 51 71 91 | \n" +
            "|14 34 54 74 94 | \n" +
            "|15 35 55 75 95 | \n" +
            "|18 38 58 78 98 | \n" +
            "|19 39 59 79 99 | \n" +
            INICIO_FINAL_DE_TARJETAS;

        String tarjetaTres =
            INICIO_FINAL_DE_TARJETAS +
            "| 4 22 44 62 84 | \n" +
            "| 5 23 45 63 85 | \n" +
            "| 6 28 46 68 86 | \n" +
            "| 7 29 47 69 87 | \n" +
            "|12 30 52 70 92 | \n" +
            "|13 31 53 71 93 | \n" +
            "|14 36 53 73 93 | \n" +
            "|15 37 55 77 95 | \n" +
            "|20 38 60 78    | \n" +
            "|21 39 61 79    | \n" +
            INICIO_FINAL_DE_TARJETAS;

        String tarjetaCuatro =
            INICIO_FINAL_DE_TARJETAS +
            "| 8 26 44 62 88 | \n" +
            "| 9 27 45 63 89 | \n" +
            "|10 28 46 72 90 | \n" +
            "|11 29 47 73 91 | \n" +
            "|12 30 56 74 92 | \n" +
            "|13 31 57 75 93 | \n" +
            "|14 40 58 76 94 | \n" +
            "|15 41 59 77 95 | \n" +
            "|24 42 60 78    | \n" +
            "|25 43 61 79    | \n" +
            INICIO_FINAL_DE_TARJETAS;

        String tarjetaCinco =
            INICIO_FINAL_DE_TARJETAS +
            "|16 26 52 62 88 | \n" +
            "|17 27 53 63 89 | \n" +
            "|18 28 54 80 90 | \n" +
            "|19 29 55 81 91 | \n" +
            "|20 30 56 82 92 | \n" +
            "|21 31 57 83 93 | \n" +
            "|22 48 58 84 94 | \n" +
            "|23 49 59 85 95 | \n" +
            "|24 50 60 86    | \n" +
            "|25 51 61 87    | \n" +
            INICIO_FINAL_DE_TARJETAS;

        String tarjetaSeis =
            INICIO_FINAL_DE_TARJETAS +
            "|32 42 52 62 | \n" +
            "|33 43 53 63 | \n" +
            "|34 44 54 99 | \n" +
            "|35 45 55    | \n" +
            "|36 46 56    | \n" +
            "|37 47 57    | \n" +
            "|38 48 58    | \n" +
            "|39 49 59    | \n" +
            "|40 50 60    | \n" +
            "|41 51 61    | \n" +
            INICIO_FINAL_DE_TARJETAS;

        String tarjetaSiete =
            INICIO_FINAL_DE_TARJETAS +
            "|64 74 84 94 | \n" +
            "|65 75 85 95 | \n" +
            "|66 76 86 96 | \n" +
            "|67 77 87 97 | \n" +
            "|68 78 88 98 | \n" +
            "|69 79 89 99 | \n" +
            "|70 80 90    | \n" +
            "|71 81 91    | \n" +
            "|72 82 92    | \n" +
            "|73 83 93    | \n" +
            INICIO_FINAL_DE_TARJETAS;

        int respuesta;
        int primerNumero = 1;
        int numeroParaAdivinar = 0;

        // 	INICIO DEL PROGRAMA

        System.out.println("Piensa en un numero entre el 1 y el 99.");

        System.out.println("\nTARGETA 1" + "\n" + tarjetaUno);
        System.out.println(MENSAJE);
        respuesta = myScanner.nextInt();
        if (respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        primerNumero = 2;
        System.out.println("\nTARGETA 2" + "\n" + tarjetaDos);
        System.out.println(MENSAJE);
        respuesta = myScanner.nextInt();
        if (respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        primerNumero = 4;
        System.out.println("\nTARGETA 3" + "\n" + tarjetaTres);
        System.out.println(MENSAJE);
        respuesta = myScanner.nextInt();
        if (respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        primerNumero = 8;
        System.out.println("\nTARGETA 4" + "\n" + tarjetaCuatro);
        System.out.println(MENSAJE);
        respuesta = myScanner.nextInt();
        if (respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        primerNumero = 16;
        System.out.println("\nTARGETA 5" + "\n" + tarjetaCinco);
        System.out.println(MENSAJE);
        respuesta = myScanner.nextInt();
        if (respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        primerNumero = 32;
        System.out.println("\nTARGETA 6" + "\n" + tarjetaSeis);
        System.out.println(MENSAJE);
        respuesta = myScanner.nextInt();
        if (respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        primerNumero = 64;
        System.out.println("\nTARGETA 7" + "\n" + tarjetaSiete);
        System.out.println(MENSAJE);
        respuesta = myScanner.nextInt();
        if (respuesta == 1) {
            numeroParaAdivinar = numeroParaAdivinar + primerNumero;
        }

        System.out.println("El numero que elejiste es: " + numeroParaAdivinar);
    }
}
