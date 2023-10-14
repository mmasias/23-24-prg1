class Reto2 {
    public static void main (String[] args){



        int dinero = 400;
        int cambio = 150;
        int devolucion = dinero - cambio; 

         System.out.print("el total del dinero devuelto sera: "    + devolucion + "euros");

         System.out.print(" por tanto nos devolveran:");

      
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
     int moneda1 = devolucion / 1;
         
     devolucion = devolucion % 1;


    System.out.println(billete50 > 0 ? "billetes de 50 euros:" + billete50: "");
    System.out.println(billete20 > 0 ? "billetes de 20 euros:" + billete20: "");
    System.out.println(billete10 > 0 ? "billetes de 10 euros:" + billete10: "");
    System.out.println(billete5 > 0 ? "billetes de 5 euros:" + billete5: "");
    System.out.println(moneda2 > 0 ? "monedas de 2 euros:" + moneda2: "");
    System.out.println(moneda1 > 0 ? "monedas de 1 euro:" + moneda1: "");










    }











}