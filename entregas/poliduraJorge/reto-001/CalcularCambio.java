public class Reto001 {
    public static void main(String[] args) {

         int billetes100;
         int billetes50;
         int billetes20;
         int billetes10;
         int billetes5;
         int billetes2;
         int billetes1;

         int cantidad_pagar=654;
         int cantidad_pagada=800;
         int cantidad_devolver=cantidad_pagada-cantidad_pagar;

         billetes100=cantidad_devolver/100;
             cantidad_devolver=cantidad_devolver-(100*billetes100);
         billetes50=cantidad_devolver/50;
             cantidad_devolver=cantidad_devolver-(50*billetes50);
         billetes20=cantidad_devolver/20;
             cantidad_devolver=cantidad_devolver-(20*billetes20);
         billetes10=cantidad_devolver/10;
             cantidad_devolver=cantidad_devolver-(10*billetes10);
         billetes5=cantidad_devolver/5;
             cantidad_devolver=cantidad_devolver-(5*billetes5);
         billetes2=cantidad_devolver/2;
             cantidad_devolver=cantidad_devolver-(2*billetes2);
         billetes1=cantidad_devolver/1;
             cantidad_devolver=cantidad_devolver-(1*billetes1);

        System.out.println("Tienes que pagar " + cantidad_pagar + "€");
        System.out.println("Has pagado " + cantidad_pagada + "€");
        System.out.println("Te van a devolver " + cantidad_devolver + "€ en la forma de:\n");
        System.out.println(billetes100 + " Billete(s) de 100€");
        System.out.println(billetes50 + " Billete(s) de 50€");
        System.out.println(billetes20 + " Billete(s) de 20€");
        System.out.println(billetes10 + " Billete(s) de 10€");
        System.out.println(billetes5 + " Billete(s) de 5€");
        System.out.println(billetes2 + " Billete(s) de 2€");
        System.out.println(billetes1 + " Billete(s) de 1€");

    }

}

