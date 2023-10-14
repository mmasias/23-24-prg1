import java.util.Scanner;

class Reto003 {
    public static void main(String[] args) {
        int coste = 500;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la cantidad del artículo: ");
        int Dinero = scanner.nextInt();

        int devolucion = Dinero - coste;

        System.out.println("La devolución es de " + devolucion + " euros");

        int billete100 = devolucion / 100;
        devolucion = devolucion % 100;

        int billete50 = devolucion / 50;
        devolucion = devolucion % 50;

        int billete20 = devolucion / 20;
        devolucion = devolucion % 20;

        int billete10 = devolucion / 10;
        devolucion = devolucion % 10;

        int billete5 = devolucion / 5;
        devolucion = devolucion % 5;

        int moneda2 = devolucion / 2;
        devolucion = devolucion % 2;

        int moneda1 = devolucion;

        System.out.println(billete100 > 0 ? "Billete de 100 euros: " + billete100 : "");
        System.out.println(billete50 > 0 ? "Billete de 50 euros: " + billete50 : "");
        System.out.println(billete20 > 0 ? "Billete de 20 euros: " + billete20 : "");
        System.out.println(billete10 > 0 ? "Billete de 10 euros: " + billete10 : "");
        System.out.println(billete5 > 0 ? "Billete de 5 euros: " + billete5 : "");
        System.out.println(moneda2 > 0 ? "Moneda de 2 euros: " + moneda2 : "");
        System.out.println(moneda1 > 0 ? "Moneda de 1 euro: " + moneda1 : "");

        scanner.close();
    }
}