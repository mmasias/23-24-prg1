import java.util.Scanner;

public class Reto003 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

         int billetes100;
         int billetes50;
         int billetes20;
         int billetes10;
         int billetes5;
         int billetes2;
         int billetes1;

        System.out.println("¿Cuantos € tienes que pagar?");
        int cantidad_pagar=sc.nextInt();

        System.out.println("¿Cuantos € quieres pagar?");
        int cantidad_pagada=sc.nextInt();

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

        String billete100=billetes100>0 ? billetes100 + " billete(s) de 100€\n" : "";
        String billete50=billetes50>0 ? billetes50 + " billete(s) de 50€\n" : "";
        String billete20=billetes20>0 ? billetes20 + " billete(s) de 20€\n" : "";
        String billete10=billetes10>0 ? billetes10 + " billete(s) de 10€\n" : "";
        String billete5=billetes5>0 ? billetes5 + " billete(s) de 5€\n" : "";
        String billete2=billetes2>0 ? billetes2 + " billete(s) de 2€\n" : "";
        String billete1=billetes1>0 ? billetes1 + " billete(s) de 1€\n" : "";

        System.out.print(billete100);
        System.out.print(billete50);
        System.out.print(billete20);
        System.out.print(billete10);
        System.out.print(billete5);
        System.out.print(billete2);
        System.out.print(billete1);


    }
}

