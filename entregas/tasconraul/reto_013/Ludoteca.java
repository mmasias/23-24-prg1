package reto_013;

public class Ludoteca {

    public static void main(String[] args) {
        
        final int MINUTOS_TOTALES =120;
        final int NIÑOS_MINIMO = 5;
        int lydia = 0;
        int aisha = 0;
        int turnoNiño = 0;
        String elMensaje = "";
        boolean jugando = false;

        for(int minuto=0;minuto<=MINUTOS_TOTALES;minuto++){

             System.out.println("Ludoteca PRG1, minuto " + minuto);
            if (llegaNiño()){
                lydia++;
                System.out.println("Llego un niño! Lydia tiene el cola ["+ lydia + "] niño");
            }
            if (!jugando){
                aisha = aisha + lydia;
                lydia = 0;
            }

            if (aisha<= NIÑOS_MINIMO && !jugando){
                jugando = true;
                elMensaje = "El examen estara dificil. Pasalo!";
                turnoNiño = 1;
            }

            if (jugando){
                elMensaje = mensajeAlterado(elMensaje);
                turnoNiño++;
                System.out.println(("El niño [" + turnoNiño + "] pasa este mensaje: " + elMensaje));
                jugando = turnoNiño<=aisha;

            }
            System.out.println("Lydia:[" + lydia + "]/ Aisha:[" + aisha + "]");


         }
            
    }

    static String mensajeAlterado(String mensaje){
        return mensaje + "X";
    }

    private static boolean llegaNiño() {
       final double PROBABILIDAD_LLEGADA=0.3;
       return Math.random()<PROBABILIDAD_LLEGADA;
    }


    
}
