class Reto1{
    public static void main(String[] args){
        
        int billete100;
        int billete50;
        int billete20;
        int billete10;
        int billete5;
        int moneda2;
        int moneda1;
        int dineroEntregado;
        int precioAPagar;
        int cambio;    
        int diferencia;
       
      
        dineroEntregado = 474;
        precioAPagar = 200;
        diferencia= dineroEntregado - precioAPagar;

        billete100 = diferencia / 100;
        cambio = diferencia % 100;

        billete50 = cambio / 50;
        cambio = cambio % 50;

        billete20 = cambio / 20;
        cambio = cambio % 20;

        billete10 = cambio / 10;
        cambio = cambio % 10;

        billete5 = cambio / 5;
        cambio = cambio % 5;

        moneda2 = cambio - cambio / 2;
        cambio = cambio % 2;
        
        moneda1 = cambio;
        
        System.out.println ("el dinero que hay que devolver son " + diferencia + " euros"); 
      
        System.out.println ("por lo tanto se devolvera " + billete100 + " billete de 100");

        System.out.println ("se devolvera " + billete50 + "billete de 50");

        System.out.println ("se devolvera " + billete20 + "billete de 20");
  
        System.out.println ("se devolvera " + billete10 + "billete de 10");

        System.out.println ("se devolvera " + billete5 + "billete de 5");

        System.out.println ("se devolvera " + moneda2 + "moneda de 2");
       
        System.out.println ("se devolveran " + moneda1 + "monedas de 1");

    }
} 