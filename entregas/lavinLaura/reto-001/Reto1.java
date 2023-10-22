class Reto1 {
    public static void main (String[] args){



        int dinero = 400;
        int cambio = 150;
        int devolucion = dinero - cambio; 



        System.out.print("el total del dinero devuelto sera: " + devolucion);

         System.out.print(" la vuelta es " + devolucion + " euros ");


         int billete50 = devolucion / 50;
         System.out.print( + billete50 + " el dinero devuelto sera " + billete50 + " 50 ");
         devolucion = devolucion % 50;
         int billete20 = devolucion / 20;
         System.out.print( + billete20 + " el dinero devuelto sera " + billete20 + " 20 ");
         devolucion = devolucion % 20;
         int billete10 = devolucion / 10;
         System.out.print( + billete10 + " el dinero devuelto sera " + billete10 + " 10 ");
         devolucion = devolucion % 10;
         int billete5 = devolucion / 5;
         System.out.print( + billete5 + " el dinero devuelto sera " + billete5 + " 5 ");
         devolucion = devolucion % 5;
         int moneda2 = devolucion / 2;
         System.out.print( + moneda2 + " el dinero devuelto sera " + moneda2 + " 2 ");
         devolucion = devolucion % 2;
         int moneda1 = devolucion / 1;
         System.out.print( + moneda1 + " el dinero devuelto sera " + moneda1 + " 1 ");
        devolucion = devolucion % 1;












    }











}