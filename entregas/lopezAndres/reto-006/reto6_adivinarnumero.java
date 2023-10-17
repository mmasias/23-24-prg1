import java.util.Scanner;

class Tarjetas {

    public static void main (String[] arg) {

        Scanner scanner = new Scanner(System.in);
        int respuesta;

        final String PREGUNTA ="Dime (1 SI / 2 NO) si esta en la tarjeta numero ";

        int laTarjeta = 1;
        int primerNumero= 1;
        int numeroPorAdivinar = 0;

        laTarjeta = 1;
        primerNumero = 1;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }

        laTarjeta = 2;
        primerNumero = 2;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }

        laTarjeta = 3;
        primerNumero = 4;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }

        laTarjeta = 4;
        primerNumero = 8;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }

        laTarjeta = 5;
        primerNumero = 16;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }

        laTarjeta = 6;
        primerNumero = 32;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }

        laTarjeta = 7;
        primerNumero = 64;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }


    }

    
}