package entregas.garciaLydia.reto007;

public class Caracol {
    public static void main(String[] args){

        int profundidadInicial;
        int profundidadActual;
        int diaActual= 0;
        int ascensoMañana;
        int descensoNoche;

        profundidadInicial= (int)(Math.random() * (10)+10);
        profundidadActual = -profundidadInicial;
        System.out.println(" Profundidad Inicial:" + profundidadInicial);
        System.out.println("***---***---***---***---***---***---***---***---***");


        do{
            ascensoMañana= (int)(Math.random() * (4)+1);
            descensoNoche= (int)(Math.random() * (4)+0);


            if(ascensoMañana==1){
                profundidadActual= profundidadActual + 1;
            }else if(ascensoMañana==2){
                profundidadActual= profundidadActual + 2;

            }else if(ascensoMañana==3){
                profundidadActual= profundidadActual + 3;

            }else if(ascensoMañana==4){
                profundidadActual= profundidadActual + 4;

            }

            if(profundidadActual<=-20){
                System.out.println("No puede bajar más");
            }else{
                if(descensoNoche==1){
                    profundidadActual= profundidadActual - 1;

                }else if(descensoNoche==2){
                    profundidadActual= profundidadActual - 2;

                }else if(descensoNoche==3){
                    profundidadActual= profundidadActual - 3;

                }
            }

            System.out.println(" díaActual:" + diaActual);
            System.out.println("-------------------------------");
            System.out.println(" Ha ascendido por la mañana:" + ascensoMañana + " m");
            System.out.println(" Ha descendido por la noche:" + descensoNoche + " m");
            System.out.println("-------------------------------");
            System.out.println(" Profundidad Actual tras las varianzas-:" + profundidadActual);


            diaActual ++;


        }while(profundidadActual < 0 ) ;

        System.out.println("El caracol ha salido");


    }

}



