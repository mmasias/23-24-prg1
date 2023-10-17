import java.util.Scanner;
class Reto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int precio, paga, devolucion, billetes100, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        
        System.out.println("Cuantos euros debe?");
        precio = scanner.nextInt();

        System.out.println("Cuantos euros entrega?");
        paga = scanner.nextInt();
        
        devolucion = paga - precio;
        
        billetes100 = devolucion / 100;
        devolucion = devolucion % 100;
        
        billetes50 = devolucion / 50;
        devolucion = devolucion % 50;
        
        billetes20 = devolucion / 20;
        devolucion = devolucion % 20;
        
        billetes10 = devolucion / 10;
        devolucion = devolucion % 10;
        
        billetes5 = devolucion / 5;
        devolucion = devolucion % 5;
        
        monedas2 = devolucion / 2;
        devolucion = devolucion % 2;
        
        monedas1 = devolucion;
        
        String salida = (billetes100 == 0 ? "" : "  " + billetes100 + " billete(s) de 100€" + "\n") +
                (billetes50== 0 ? "" : "  " + billetes50 + " billete(s) de 50€" + "\n") +
                (billetes20 == 0 ? "" : "  " + billetes20 + " billete(s) de 20€" + "\n") +
                (billetes10 == 0 ? "" : "  " + billetes10 + " billete(s) de 10€" + "\n") +
                (billetes5 == 0 ? "" : "  " + billetes5 + " billete(s) de 5€" + "\n") +
                (monedas2 == 0 ? "" : "  " + monedas2 + " moneda(s) de 2€" + "\n") +
                (monedas1 == 0 ? "" : "  " + monedas1 + " moneda(s) de 1€" + "\n");
        System.out.println("Debería recibir:" + "\n" + salida);
    }
}