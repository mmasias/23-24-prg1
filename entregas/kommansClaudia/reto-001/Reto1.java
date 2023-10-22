class Reto1 { 

    public static void main (String[]args){

                int dinero = 200;
                int cambio = 400;
                int devolucion = cambio - dinero; 

                System.out.print("la devolucion sera:" + devolucion); 

                 System.out.print (" la devolucion es de " + devolucion + " euros " );
                
                int billete50 = devolucion / 50;
                devolucion = devolucion % 50;
                  System.out.print (" se devolveran " + billete50 +  " 50 " );

                int billete20 = devolucion / 20;
                devolucion = devolucion % 20;
                 System.out.print (" se devolveran " + billete20  + " 20 " );

                int billete10 = devolucion / 10;
                devolucion = devolucion % 10;
                 System.out.print (" se devolveran " + billete10  + " 10 " );

                int billete5 =  devolucion / 5;
                devolucion = devolucion % 5;
                 System.out.print (" se devolveran " + billete5  + " 5 " );

                int moneda2 = devolucion / 2;
                devolucion = devolucion % 2; 
                 System.out.print (" se devolveran " + moneda2  + " 2 " );

                int moneda1 = devolucion / 1;
                devolucion = devolucion % 1; 
                 System.out.print ( " se devolveran " + moneda1  + " 1 " );










    }






}