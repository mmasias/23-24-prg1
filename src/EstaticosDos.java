public class EstaticosDos {
    
    public static void main(String[] args) {
        final int EDUCADO = 1;
        final int MALEDUCADO = 2;
        
        saluda("Manuel",EDUCADO);
        saluda("Manuel",MALEDUCADO);

        int laSuma = suma(3,4);
        

    }

    private static int suma(int i, int j) {
        return i+j;
    }

    private static void saluda(String nombre, int modoSaludo) {

        String saludo;

        if(modoSaludo==1){
            saludo = "Hola " + nombre;
        }else{
            saludo = "Hola " + nombre + " HP!";
        }

        System.out.println(saludo);

    }

    


}
