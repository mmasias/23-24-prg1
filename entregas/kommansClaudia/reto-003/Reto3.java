import java.util.Scanner; 
class Reto3 { 

    public static void main ( String []args){
        int coste = 230; 
            
            Scanner Scanner = new Scanner  (System.in);

        System.out.print( " introduzca la cantidad del articulo : " );
            

            int Dinero = Scanner.nextInt();
        System.out.print( " introducta la cantidad de dinero "); 

             int devolucion = Dinero - coste;  
            


                 System.out.println (" la devolucion es de " + devolucion + " euros " );

                int billete50 = devolucion / 50;
                devolucion = devolucion % 50;
                  

                int billete20 = devolucion / 20;
                devolucion = devolucion % 20;
                 

                int billete10 = devolucion / 10;
                devolucion = devolucion % 10;
                

                int billete5 =  devolucion / 5;
                devolucion = devolucion % 5;
                 

                int moneda2 = devolucion / 2;
                devolucion = devolucion % 2; 
                

                int moneda1 = devolucion;

             
                 
  System.out.println(billete50 > 0 ? " billete de 50 euros: " + billete50 : "");
  System.out.println(billete20 > 0 ? " billete de 20 euros: " + billete20 : "");
  System.out.println(billete10 > 0 ? " billete de 10 euros: " + billete10 : "");
  System.out.println(billete5 > 0 ? " billete de 5 euros: " + billete5 : "");
  System.out.println(moneda2 > 0 ? " moneda de 2 euros: " + moneda2 : "");
  System.out.println(moneda1 > 0 ? " moneda de 1 euros: " + moneda1 : "");





    }






}