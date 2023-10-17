import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroPensado = 0;
        int tarjetaActual = 1;

        System.out.println("Piensa un número entre el 1 y el 99.");
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        tarjetaActual++;
        mostrarTarjeta(tarjetaActual);

        if (tarjetaActual < 10) {
            System.out.print("¿Está aquí? (1: SI / 2: NO): ");
            int respuesta = input.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingresa el primer número que aparece en la tarjeta: ");
                int numeroTarjeta = input.nextInt();
                numeroPensado += numeroTarjeta;
            }
        }

        System.out.println("El número pensado es " + numeroPensado);
    }

    public static void mostrarTarjeta(int numeroTarjeta) {
        System.out.println("TARJETA " + numeroTarjeta);
        System.out.println("+---------------+");

    }
}
