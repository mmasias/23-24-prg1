package reto_011;

import java.util.Scanner;


public class Marco {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String inputUsuario;

        int dia=0;
        boolean buscandoMadre = true;
        double distanciaMarcoMadre =350;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double RALENTIZACION_LLUVIA_FUERTE = 0.25;
        final double PROBABILIDAD_LLUVIA_DEBIL =0.4;
        final double RALENTIZACION_LLUVIA_DEBIL =0.75;
        final double PROBABILIDAD_MONO_CANSADO = 0.25;
        final double RALENTIZACION_MONO_CANSADO = 0.1;
        do{
            dia++;

            double horasMarco = Math.random()*2+8;
            double velocidadMarco =Math.random()*5+10;
           


            double probabilidadLluvia = Math.random();

            if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                System.out.println("LLUVIA FUERTE!");
                velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_FUERTE;
            } else if (probabilidadLluvia <=PROBABILIDAD_LLUVIA_DEBIL) {
                System.out.println("LLUVIA NORMAL");
                velocidadMarco = velocidadMarco * RALENTIZACION_LLUVIA_DEBIL;
            } else {
                System.out.println("BUEN CLIMA :) <3");
            }

            double probabilidadMonoCansa = Math.random();

            if (probabilidadMonoCansa <= PROBABILIDAD_MONO_CANSADO){
                velocidadMarco = velocidadMarco * RALENTIZACION_MONO;
            }

            double probabilidadMonoEscapa = Math.random();
            if (probabilidadMonoEscapa <= PROBABILIDAD_MONO_ECAPADO){
                horasMarco = horasMarco - TIEMPO_PERDIDO_MONO;
            }


             double avanceMarco =velocidadMarco*horasMarco;

            double avanceMadre =80;

            distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + avanceMadre;

            

            if (distanciaMarcoMadre <=0){
                buscandoMadre = !buscandoMadre;
            }
            System.out.println("Dia ["+dia+"]-Distancia [" + distanciaMarcoMadre + "]");
            System.out.println("Hoy Marco avanzo " + avanceMarco);
            System.out.println(" Tiempo: ["+horasMarco+"] Velocidad: ["+velocidadMarco+"]");
            System.out.println((buscandoMadre?"No ha":"Ha") + " encontrado a su madre");
            inputUsuario=scanner.nextLine();


        } while(buscandoMadre);

    
}
}