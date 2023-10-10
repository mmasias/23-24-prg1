class Reto1 {
    public static void main(String[] args) {

        int dineroDado;
        int precioProducto;
        int cambio;
        int pendiente;
        int billeteDe100;
        int billeteDe50;
        int billeteDe20;
        int billeteDe10;
        int billeteDe5;
        int monedaDe2;
        int monedaDe1;

        dineroDado= 1800;
        precioProducto= 785;
        cambio = dineroDado - precioProducto;

        System.out.println ("Mi producto me costo " + precioProducto + " euros");
        System.out.println ("-----------------------------------------------");
        System.out.println ("Dare la cantidad de " + dineroDado + " euros");
        System.out.println ("-----------------------------------------------");
        System.out.println ("El vuelto sera de " + cambio + " euros");
        System.out.println ("-----------------------------------------------");
        System.out.println ("Lo que se reparte en ");
        System.out.println ("-----------------------------------------------");

        billeteDe100 = cambio/100;
        pendiente = cambio%100;
        System.out.println ("Se devolveran " + billeteDe100 + " billetes de 100 euros");
        System.out.println ("Aun falta que devuelvan " + pendiente + " euros");

        System.out.println ("-----------------------------------------------");

        billeteDe50 = pendiente/50;
        pendiente = cambio%50;
        System.out.println ("Se devolveran " + billeteDe50 + " billetes de 50 euros");
        System.out.println ("Aun falta que devuelvan " + pendiente + " euros");

        System.out.println ("-----------------------------------------------");

        billeteDe20 = pendiente/20;
        pendiente = cambio%20;
        System.out.println ("Se devolveran " + billeteDe20 + " billetes de 100 euros");
        System.out.println ("Aun falta que devuelvan " + pendiente + " euros");

        System.out.println ("-----------------------------------------------");

        billeteDe10 = pendiente/10;
        pendiente = cambio%10;
        System.out.println ("Se devolveran " + billeteDe10 + " billetes de 10 euros");
        System.out.println ("Aun falta que devuelvan " + pendiente + " euros");

        System.out.println ("-----------------------------------------------");

        billeteDe5 = pendiente/5;
        pendiente = cambio%5;
        System.out.println ("Se devolveran " + billeteDe5 + " billetes de 5 euros");
        System.out.println ("Aun falta que devuelvan " + pendiente + " euros");

        System.out.println ("-----------------------------------------------");

        monedaDe2 = pendiente/2;
        pendiente = cambio%2;
        System.out.println ("Se devolveran " + monedaDe2 + " moneda de 2 euros");
        System.out.println ("Aun falta que devuelvan " + pendiente + " euros");

        System.out.println ("-----------------------------------------------");

        monedaDe1 = pendiente/1;
        pendiente = cambio%1;
        System.out.println ("Se devolveran " + monedaDe1 + " moneda de 1 euro");
        System.out.println ("Aun falta que devuelvan " + pendiente + " euros");

        System.out.println ("-----------------------------------------------");
        }
    }