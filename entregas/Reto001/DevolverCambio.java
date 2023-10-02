import java.util.Scanner;

public class DevolverCambio{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el monto a pagar: ");
        int aPagar = sc.nextInt();
        
        System.out.println("Indique el monto a entregar: ");
        int montoDado = sc.nextInt();
         
        if(montoDado < aPagar){
            System.out.println("El dinero ingresado es insuficiente");
        }

        int devolver = montoDado - aPagar;
        System.out.println("Su cambio es :  " + devolver + " " + "euros");
       
        while(devolver!=0){
            
            int[] billetesMonedas = {100, 50, 20, 10, 5, 2, 1};
            String[] nombreBilletesMonedas = {"billetes de 1100", "billetes de 50", "billetes de 20", "billetes de 10", "billetes de 5", "monedas de 2", "monedas de 1"};
            System.out.println("--------------------------------------------");

            for(int i = 0; i < billetesMonedas.length; i++){
                int cantidad = devolver/billetesMonedas[i];
                devolver %= billetesMonedas[i];
                
                System.out.println("Cantidad de " + nombreBilletesMonedas[i]+ ": " + cantidad);
            }
        
       

        }

    }
}

       
            


       

