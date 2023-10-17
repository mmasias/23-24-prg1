import java.util.Scanner;
    
    class Reto2{
        public static void main(String[] args){
        
            int precioAPagar;
            int dineroEntregado;    
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cuantos euros debe?");
        precioAPagar = scanner.nextInt();

        System.out.println("Cuantos euros entrega?");
        dineroEntregado = scanner.nextInt();

            int billete100;
            int billete50;
            int billete20;
            int billete10;
            int billete5;
            int moneda2;
            int moneda1;
            int cambio;    
            int diferencia;
        
        
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
        
            System.out.println (billete100 > 0 ? "por lo tanto se devolvera " + billete100 + " billete de 100" : "");

            System.out.println (billete50 > 0 ? "se devolvera " + billete50 + "billete de 50" : "");

            System.out.println (billete20 > 0 ? "se devolvera " + billete20 + "billete de 20" : "");
    
            System.out.println (billete10 > 0 ? "se devolvera " + billete10 + "billete de 10" : "");

            System.out.println (billete5 > 0 ? "se devolvera " + billete5 + "billete de 5" : "");

            System.out.println (moneda2 > 0 ? "se devolvera " + moneda2 + "moneda de 2" : "");
        
            System.out.println (moneda1 > 0 ? "se devolveran " + moneda1 + "monedas de 1" : "");


    }
}
