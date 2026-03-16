import java.util.scanner;
public class Telefono {
    public static void main(String[] args) {
        final int minutosTotales = 120;
        final int niñosMinimo = 5;
        int aisha = 0;
        int lydia = 0;
        boolean jugando = false;
        int turnoNiño =0;
        String Mensaje ="";

        for (int i = 0; i < minutosTotales; i++) {
            System.out.println("Ludoteca PRG1, minuto " + i);
            if (llegaNiño()) {
                lydia++;
                System.out.println("> llega un niño! Lydia tiene en la cola [" + lydia + "] niños");

            }
            if (!jugando) {
                aisha = aisha + lydia;
                lydia = 0;
            }
            if(aisha <= niñosMinimo && !jugando ){
                jugando= true;
                turnoNiño=1;
                Mensaje = "El examen estara dificil. Pasalo";
            }
            if(jugando){
                Mensaje = mensajeAlterado(Mensaje);
                turnoNiño++;
                System.out.println("El niño ["+turnoNiño+"]pasa este mensaje " +Mensaje);
                jugando= turnoNiño<=aisha;

            }
            
            System.out.println("Lydia [" + lydia + "]/ Aisha[" + aisha + "]");
            Scanner scanner = new Scanner(System.in);
        }
    }
    static String mensajeAlterado(String mensaje){
        return mensaje + "x";
    }

    private static boolean llegaNiño() {
        final double PROBABILIDAD_LLEGADA = 0.3;
        return Math.random() < PROBABILIDAD_LLEGADA;
    }

}
