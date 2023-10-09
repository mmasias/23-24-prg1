import java.util.Scanner;
public class DevolverCambioMejorado {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el precio de la cuenta:");
        int cuenta=sc.nextInt();

        System.out.println("Introduzca el dinero entregado:");
        int entregado=sc.nextInt();

        int devolucion;
        int billete100,billete50,billete20,billete10,billete5,moneda2,moneda1;
        devolucion=entregado-cuenta;


        billete100=devolucion/100;
        devolucion=devolucion%100;

        billete50=devolucion/50;
        devolucion=devolucion%50;  

        billete20=devolucion/20;
        devolucion=devolucion%20;

        billete10=devolucion/10;
        devolucion=devolucion%10;

        billete5=devolucion/5;
        devolucion=devolucion%5;

        moneda2=devolucion/2;
        devolucion=devolucion%2;

        moneda1=devolucion;
    
        System.out.println("Debe recibir :");;
        System.out.println("-----------------------");
        System.out.print((billete100>=1)? ("Billete(s) de 100€:"+billete100 + "\n"):"");
        System.out.print((billete50>=1) ? ("Billete(s) de 50€:"+billete50 + "\n"):"");
        System.out.print((billete20>=1) ? ("Billete(s) de 20€:"+billete20 + "\n"):"");
        System.out.print((billete10>=1)? ("Billete(s) de 10€:"+billete10 + "\n"):"");
        System.out.print((billete5>=1)? ("Billete(s) de 5€:"+billete5 + "\n"):"");
        System.out.print((moneda2>=1)? ("Moneda(s) de 2€:"+moneda2 +"\n"):"");
        System.out.print((moneda1>=1)? ("Moneda(s) de 1€:"+moneda1 + "\n"):"");
        System.out.println("-----------------------");

    }

    
}
