import java.util.Scanner;
class CombinacionDeNumeros {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor para num1: ");
        Scanner scanner1= new Scanner(System.in);
        int numero1= scanner1.nextInt();

        System.out.println("Ingrese un valor para num2: ");
        Scanner scanner2= new Scanner(System.in);
        int numero2= scanner2.nextInt();

        System.out.println("Ingrese un valor para num3: ");
        Scanner scanner3= new Scanner(System.in);
        int numero3= scanner3.nextInt();

        scanner1.close();
        scanner2.close();
        scanner3.close();

        int cifra1= numero1/100;
        int cifra2= (numero2%100)/10;
        int cifra3= numero3%10;

        int nuevoNumero= cifra1*100+cifra2*10+cifra3;
        System.out.println("El número generado es: " + nuevoNumero);
    }



}
