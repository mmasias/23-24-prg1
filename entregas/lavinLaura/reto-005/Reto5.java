import java.util.Scanner;
class Reto5 {

    public static void main (String[] args){
        java.util.Scanner scanner = new Scanner(System.in);


        System.out.print("El primer numero es: ");
        int primerNumero = scanner.nextInt();
        System.out.print("el segundo numero es :");
        int segundoNumero = scanner.nextInt();

          
       
        int mayor = primerNumero > segundoNumero ? primerNumero : segundoNumero;

        


        System.out.println("El numero mas mayor de los dos es: " + mayor);

    
               scanner.close();












}


}