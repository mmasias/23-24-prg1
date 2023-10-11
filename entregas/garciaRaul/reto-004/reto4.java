import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un primer numero de 3 cifras");
        int numero1 = scanner.nextInt();  
       
        System.out.println("Introduce un segundo numero de 3 cifras");
        int numero2 = scanner.nextInt();
       
        System.out.println("Introduce un tercer numero de 3 cifras");
        int numero3 = scanner.nextInt();

        int digito1 = numero1>=100 && numero1<=999 ? numero1/100 : null ;
        int digito2 = numero2>=100 && numero2<=999 ? numero2%100 : null;
        double digito2_1 = digito2*0.1;
        int digito2final = (int) digito2_1;
        int digito3 = numero3>=100 && numero3<=999 ? numero3%10 : null;
        
        int numerofinal = digito1*100 + digito2final*10 + digito3;




        System.out.println("Tu numero final es " + numerofinal);
       




        


    }
    
}
