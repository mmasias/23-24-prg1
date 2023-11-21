package reto_013;

public class Ludoteca {

    public static void main(String[] args) {
        
        final int MINUTOS_TOTALES =120;

        for(int minuto=0;minuto<=MINUTOS_TOTALES;minuto++){

             System.out.println("Ludoteca PRG1, minuto " + minuto);
            if (llegaNiño()){
                System.out.println("Llego un niño!");
            }
         }
            
    }

    private static boolean llegaNiño() {
       final double PROBABILIDAD_LLEGADA=0.3;
       return Math.random()<PROBABILIDAD_LLEGADA;
    }


    
}
