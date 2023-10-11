class reto_001 {
    public static void main(String[] args) {

int billete100 = 100;
int billete50 = 50;
int billete20 = 20;
int billete10 = 10;
int billete5 = 5;
int moneda2 = 2;
int moneda1 = 1;

int precioVenta = 232;
int precioEntrega = 400;
int cambio = precioEntrega - precioVenta;



System.out.println(" Debe pagar " + precioVenta + " euros ");
System.out.println (" Ha entregado " + precioEntrega + " euros ");
System.out.println( "------------------------------------------------");



int cambioBilletes100 = cambio / billete100; 
cambio = cambio % 100;
System.out.println(cambioBilletes100 > 0 ? " billetes de 100 euros " + cambioBilletes100 : "");

int cambioBilletes50 = cambio / billete50;
cambio = cambio % 50; 
System.out.println(cambioBilletes50 > 0 ? " billetes de 50 euros " + cambioBilletes50 : "");

int cambioBilletes20 = cambio / billete20; 
cambio = cambio % 20;
System.out.println(cambioBilletes20 > 0 ? " billetes de 20 euros " + cambioBilletes20 : "");

int cambioBilletes10 = cambio / billete10; 
cambio = cambio % 10;
System.out.println(cambioBilletes10 > 0 ? " billetes de 10 euros " + cambioBilletes10 : "");

int cambioBilletes5 = cambio / billete5; 
cambio = cambio % 5;
System.out.println(cambioBilletes5 > 0 ? " billetes de 5 euros " + cambioBilletes5 : "");

int cambioMonedas2 = cambio / moneda2; 
cambio = cambio % 2;
System.out.println(cambioMonedas2 > 0 ? " monedas de 2 euros " + cambioMonedas2 : "");

int cambioMonedas1 = cambio / moneda1; 
System.out.println(cambioMonedas1 > 0 ? " monedas de 1 euro " + cambioMonedas1 : "");

    }
} 

