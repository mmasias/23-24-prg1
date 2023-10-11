public class reto2 {

public static void main(String[] args) {

int billetes100= 0;
int billetes50= 0;
int billetes20= 0;
int billetes10= 0;
int billetes5= 0;
int monedas2= 0;
int monedas1= 0;

int cantidadpagar = 400;
int cantidadentregada = 1432;

System.out.println("Debes pagar: " + cantidadpagar);
System.out.println("Has pagado: " + cantidadentregada);
System.out.println("-------------------------");

int cantidad_devolver = cantidadentregada-cantidadpagar;

billetes100 = cantidad_devolver/100;
cantidad_devolver = cantidad_devolver-(100*billetes100);
billetes50 = cantidad_devolver/50;
cantidad_devolver = cantidad_devolver-(50*billetes50);
billetes20 = cantidad_devolver/20;
cantidad_devolver = cantidad_devolver-(20*billetes20);
billetes10 = cantidad_devolver/10;
cantidad_devolver = cantidad_devolver-(10*billetes10);
billetes5 = cantidad_devolver/5;
cantidad_devolver = cantidad_devolver-(5*billetes5);
monedas2 = cantidad_devolver/2;
cantidad_devolver = cantidad_devolver-(2*monedas2);
monedas1 = cantidad_devolver/1;
cantidad_devolver = cantidad_devolver-(1*monedas1);

String mensaje100 = billetes100 > 0 ? billetes100 + " billete(s) de 100€\n" : "";
String mensaje50 = billetes50 > 0 ? billetes50 + " billete(s) de 50€\n" : "";
String mensaje20 = billetes20 > 0 ? billetes20 + " billete(s) de 20€\n" : "";
String mensaje10 = billetes10 > 0 ? billetes10 + " billete(s) de 10€\n" : "";
String mensaje5 = billetes5 > 0 ? billetes5 + " billete(s) de 5€\n" : "";
String mensaje2 = monedas2 > 0 ? monedas2 + " moneda(s) de 2€\n" : "";
String mensaje1 = monedas1 > 0 ? monedas1 + " moneda(s) de 1€\n" : "";

System.out.print(mensaje100);
System.out.print(mensaje50);
System.out.print(mensaje20);
System.out.print(mensaje10);
System.out.print(mensaje5);
System.out.print(mensaje2);
System.out.print(mensaje1);

}

}
    
