import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroPensado = 0;

        System.out.println("Piensa un número entre el 1 y el 99.");

        for (int i = 1; i <= 10; i++) {
            mostrarTarjeta(i);

            System.out.print("¿Está aquí? (1:SI / 2:NO): ");
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
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 5; j++) {
                int numero = (int) (Math.random() * 99) + 1;
                System.out.print(String.format("| %2d ", numero));
            }
            System.out.println("|");
        }
        System.out.println("+---------------+");
    }
}
