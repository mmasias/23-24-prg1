public class reto4 {
    public static void main(String[] args) {
        int numero1 = 238;
        int numero2 = 606;
        int numero3 = 154;
        
        int digito1 = numero1 / 100;  
        int digito2 = (numero2 / 10) % 10;  
        int digito3 = numero3 % 10;  
        
        int resultado = digito1 * 100 + digito2 * 10 + digito3;  
        
        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);
        System.out.println("Tercer número: " + numero3);
        System.out.println("El número generado es: " + resultado);
    }
}