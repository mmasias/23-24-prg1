public class Herradura {
    
    public static void main(String[] args) {
        
        boolean ganador=false;
        int turno=0;
        int nanehTotal=0;
        int armandTotal=0;
        int nanehTurno=0;
        int armandTurno=0;
        final int PUNTAJE_MAXIMO = 50;

        while(!ganador){
            turno++;
            nanehTurno = lanzamiento("Naneh");
            armandTurno = lanzamiento("Armand");

            if(nanehTurno==armandTurno){
                System.out.println("EMPATARON!");
                nanehTurno=1;
                armandTurno=1;
            }

            nanehTotal = nanehTotal + nanehTurno;
            armandTotal = armandTotal + armandTurno;
            System.out.println("Turno ["+turno+"] / Naneh: ["+nanehTurno+"/"+nanehTotal+"] / Armand: ["+armandTurno+"/"+armandTotal+"]");    

            if (nanehTotal>PUNTAJE_MAXIMO || armandTotal>PUNTAJE_MAXIMO){
                ganador=true;
            }
        }
        System.out.println("Naneh: ["+nanehTotal+"] / Armand: ["+armandTotal+"]");
    }

    private static int lanzamiento(String nombre) {
        int tramo = (int)(Math.random()*2)+1;
        int alcance=0;
        if (tramo==1 && Math.random()<0.1){
             alcance=5;
        }
        if (tramo==2 && Math.random()<0.12){
             alcance= 3;
        }
        if (tramo==3 && Math.random()<0.78){
             alcance= 1;
        }
        System.out.println(nombre + "-".repeat(alcance) + "U");
        return alcance;
    }

}
