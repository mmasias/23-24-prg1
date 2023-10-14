class CompraDevolucion {
    
    public static void main (String [] args) {
       
        int dineroDado;
        int precioProducto;
        int cambio;
        int pendienteDePagar;
        int billeteDe100;
        int billeteDe50;
        int billeteDe20;
        int billeteDe10;
        int billeteDe5;
        int monedaDe2;
        int monedaDe1;

        dineroDado = 4374;
        precioProducto = 286; 
        cambio = dineroDado - precioProducto;

        System.out.println("El producto cuesta" + precioProducto + "euros");
        System.out.println("--------------------------------------------------------");
        System.out.println("Entrego" + dineroDado + "euros");
        System.out.println("--------------------------------------------------------");
        System.out.println("El cambio sera" + cambio + "euros");
        System.out.println("--------------------------------------------------------");
        System.out.println("Lo que se reparte en: ");

        
        billeteDe100 = cambio/100;
        pendienteDePagar = cambio%100;
        System.out.println("Se devuelven "+ billeteDe100 + "billetes de 100");
        System.out.println("aun faltan que devuelvan " + pendienteDePagar + "euros");
        System.out.println("--------------------------------------------------------");

        billeteDe50 = cambio/50;
        pendienteDePagar = cambio%50;
        System.out.println("Se devuelven "+ billeteDe50 + "billetes de 50");
        System.out.println("aun faltan que devuelvan " + pendienteDePagar + "euros");
        System.out.println("--------------------------------------------------------");

        billeteDe20 = cambio/20;
        pendienteDePagar = cambio%20;
        System.out.println("Se devuelven "+ billeteDe20 + "billetes de 20");
        System.out.println("aun faltan que devuelvan " + pendienteDePagar + "euros");
        System.out.println("--------------------------------------------------------");

        billeteDe10 = cambio/10;
        pendienteDePagar = cambio%10;
        System.out.println("Se devuelven "+ billeteDe10 + "billetes de 10");
        System.out.println("aun faltan que devuelvan " + pendienteDePagar + "euros");
        System.out.println("--------------------------------------------------------");

        billeteDe5 = cambio/5;
        pendienteDePagar = cambio%5;
        System.out.println("Se devuelven "+ billeteDe5 + "billetes de 5");
        System.out.println("aun faltan que devuelvan " + pendienteDePagar + "euros"); 
        System.out.println("--------------------------------------------------------");

        monedaDe2 = cambio/2;
        pendienteDePagar = cambio%2;
        System.out.println("Se devuelven "+ monedaDe2 + "billetes de 2");
        System.out.println("aun faltan que devuelvan " + pendienteDePagar + "euros");
        System.out.println("--------------------------------------------------------");

        monedaDe1 = cambio/1;
        pendienteDePagar = cambio%1;
        System.out.println("Se devuelven "+ monedaDe1 + "monedas de 1");
        System.out.println("aun faltan que devuelvan " + pendienteDePagar + "euros");
        System.out.println("--------------------------------------------------------");


    
    }
}