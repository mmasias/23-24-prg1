import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numeroPensado=0;

        final int primerNumTabla1=1;
        final int primerNumTabla2=2;
        final int primerNumTabla3=4;
        final int primerNumTabla4=8;
        final int primerNumTabla5=16;
        final int primerNumTabla6=32;
        final int primerNumTabla7=64;

        System.out.println("Piensa un numero entre el 1 y el 99:");

        System.out.println("TARJETA 1\n" +
                "+----------------+\n" +
                "|  1 21 41 61 81 |\n" +
                "|  3 23 43 63 83 |\n" +
                "|  5 25 45 65 85 |\n" +
                "|  7 27 47 67 87 |\n" +
                "|  9 29 49 69 89 |\n" +
                "| 11 31 51 71 91 |\n" +
                "| 13 33 53 73 93 |\n" +
                "| 15 35 55 75 95 |\n" +
                "| 17 37 57 77 97 |\n" +
                "| 19 39 59 79 99 |\n" +
                "+----------------+");

        System.out.println("¿Ese numero se encuentra en esta tarjeta?(0:NO / 1:SI)");
        int respueta= sc.nextInt();

        if(respueta==1){
        numeroPensado=numeroPensado+primerNumTabla1;
        }

        System.out.println("TARJETA 2\n" +
                "+----------------+\n" +
                "|  2 22 42 62 82 |\n" +
                "|  3 23 43 63 83 |\n" +
                "|  6 26 46 66 86 |\n" +
                "|  7 27 47 67 87 |\n" +
                "| 10 30 50 70 90 |\n" +
                "| 11 31 51 71 91 |\n" +
                "| 14 34 54 74 94 |\n" +
                "| 15 35 55 75 95 |\n" +
                "| 18 38 58 78 98 |\n" +
                "| 19 39 59 79 99 |\n" +
                "+----------------+");

        System.out.println("¿Ese numero se encuentra en esta tarjeta?(0:NO / 1:SI)");
        respueta= sc.nextInt();

        if(respueta==1){
            numeroPensado=numeroPensado+primerNumTabla2;
        }

        System.out.println("TARJETA 3\n" +
                "+----------------+\n" +
                "|  4 22 44 62 84 |\n" +
                "|  5 23 45 63 85 |\n" +
                "|  6 28 46 68 86 |\n" +
                "|  7 29 47 69 87 |\n" +
                "| 12 30 52 70 92 |\n" +
                "| 13 31 53 71 93 |\n" +
                "| 14 36 54 76 94 |\n" +
                "| 15 37 55 77 95 |\n" +
                "| 20 38 60 78    |\n" +
                "| 21 39 61 79    |\n" +
                "+----------------+");

        System.out.println("¿Ese numero se encuentra en esta tarjeta?(0:NO / 1:SI)");
        respueta= sc.nextInt();

        if(respueta==1){
            numeroPensado=numeroPensado+primerNumTabla3;
        }

        System.out.println("TARJETA 4\n" +
                "+----------------+\n" +
                "|  8 26 52 62 88 |\n" +
                "|  9 27 53 63 89 |\n" +
                "| 10 28 54 80 90 |\n" +
                "| 11 29 55 81 91 |\n" +
                "| 12 30 56 82 92 |\n" +
                "| 13 31 57 83 93 |\n" +
                "| 14 48 58 84 94 |\n" +
                "| 15 49 59 85 95 |\n" +
                "| 24 50 60 86    |\n" +
                "| 25 51 61 87    |\n" +
                "+----------------+");

        System.out.println("¿Ese numero se encuentra en esta tarjeta?(0:NO / 1:SI)");
        respueta= sc.nextInt();

        if(respueta==1){
            numeroPensado=numeroPensado+primerNumTabla4;
        }

        System.out.println("TARJETA 5\n" +
                "+----------------+\n" +
                "| 16 26 52 62 88 |\n" +
                "| 17 27 53 63 89 |\n" +
                "| 18 28 54 80 90 |\n" +
                "| 19 29 55 81 91 |\n" +
                "| 20 30 56 82 92 |\n" +
                "| 21 31 57 83 93 |\n" +
                "| 22 48 58 84 94 |\n" +
                "| 23 49 59 85 95 |\n" +
                "| 24 50 68 86    |\n" +
                "| 25 51 61 87    |\n" +
                "+----------------+");

        System.out.println("¿Ese numero se encuentra en esta tarjeta?(0:NO / 1:SI)");
        respueta= sc.nextInt();

        if(respueta==1){
            numeroPensado=numeroPensado+primerNumTabla5;
        }

        System.out.println("TARJETA 6\n" +
                "+-------------+\n" +
                "| 32 42 52 62 |\n" +
                "| 33 43 53 63 |\n" +
                "| 34 44 54 99 |\n" +
                "| 35 45 55    |\n" +
                "| 36 46 56    |\n" +
                "| 37 47 57    |\n" +
                "| 38 48 58    |\n" +
                "| 39 49 59    |\n" +
                "| 40 50 60    |\n" +
                "| 41 51 61    |\n" +
                "+-------------+");

        System.out.println("¿Ese numero se encuentra en esta tarjeta?(0:NO / 1:SI)");
        respueta= sc.nextInt();

        if(respueta==1){
            numeroPensado=numeroPensado+primerNumTabla6;
        }

        System.out.println("TARJETA 7\n" +
                "+----------------+\n" +
                "|  2 22 42 62 82 |\n" +
                "|  3 23 43 63 83 |\n" +
                "|  6 26 46 66 86 |\n" +
                "|  7 27 47 67 87 |\n" +
                "| 10 30 50 70 90 |\n" +
                "| 11 31 51 71 91 |\n" +
                "| 14 34 54 74 94 |\n" +
                "| 15 35 55 75 95 |\n" +
                "| 18 38 58 78 98 |\n" +
                "| 19 39 59 79 99 |\n" +
                "+----------------+");

        System.out.println("¿Ese numero se encuentra en esta tarjeta?(0:NO / 1:SI)");
        respueta= sc.nextInt();

        if(respueta==1){
            numeroPensado=numeroPensado+primerNumTabla7;
        }

        System.out.println("El numero en el que has pensado es el " + numeroPensado);



    }
}

