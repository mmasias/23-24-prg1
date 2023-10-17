import java.util.Scanner;

class AdivinarNumero {
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Piensa un número entre el 1 y el 99.");
        scanner = new Scanner(System.in);

        int numeroPensado = 0;

        int primerNumero = 1;

        System.out.println("Está aquí? (1:SI / 2:NO):");
        int respuesta = scanner.nextInt();

        if (respuesta == 1) {
            numeroPensado = numeroPensado + primerNumero;
        } else {

        }

        primerNumero = 2;

        System.out.println("Está aquí? (1:SI / 2:NO):");
        respuesta = scanner.nextInt();

        if (respuesta == 1) {
            numeroPensado = numeroPensado + primerNumero;
        } else {

        }

        primerNumero = 4;

        System.out.println("Está aquí? (1:SI / 2:NO):");
        respuesta = scanner.nextInt();

        if (respuesta == 1) {
            numeroPensado = numeroPensado + primerNumero;
        } else {

        }

        primerNumero = 8;

        System.out.println("Está aquí? (1:SI / 2:NO):");
        respuesta = scanner.nextInt();

        if (respuesta == 1) {
            numeroPensado = numeroPensado + primerNumero;
        } else {

        }

        primerNumero = 16;

        System.out.println("Está aquí? (1:SI / 2:NO):");
        respuesta = scanner.nextInt();

        if (respuesta == 1) {
            numeroPensado = numeroPensado + primerNumero;
        } else {

        }

        primerNumero = 32;

        System.out.println("Está aquí? (1:SI / 2:NO):");
        respuesta = scanner.nextInt();

        if (respuesta == 1) {
            numeroPensado = numeroPensado + primerNumero;
        } else {

        }

        primerNumero = 64;

        System.out.println("Está aquí? (1:SI / 2:NO):");
        respuesta = scanner.nextInt();

        if (respuesta == 1) {
            numeroPensado = numeroPensado + primerNumero;
        } else {

        }

        System.out.println("El número pensado es " + numeroPensado);

    }
}
