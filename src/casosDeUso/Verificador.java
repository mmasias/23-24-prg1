package casosDeUso;

import java.util.Scanner;

class Verificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 10;

        int entradaUsuario;
        boolean valorValido = false;

        do {
            System.out.println("Dime un valor entre " + VALOR_MINIMO + " y " + VALOR_MAXIMO);
            entradaUsuario = scanner.nextInt();
            valorValido = entradaUsuario >= VALOR_MINIMO && entradaUsuario <= VALOR_MAXIMO ? true : false;
        } while (!valorValido);
    }
}
