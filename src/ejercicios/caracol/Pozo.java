package ejercicios.caracol;

public class Pozo {
    public static void main(String[] args) {

        int profundidadPozo = 20;
        int profundidadAgua = 10;
        int profundidadCaracol = 8;

        final String TECHO = "[ ]              [ ]";
        final String PARED = " [].: .: .: .: .:[] ";
        final String AGUA =  " []~ ~ ~ ~ ~ ~ ~ [] ";
        final String CARACOL = " [].: .:\\_(@)^ .:[] ";
        final String SUELO = " [][][][][][][][][] ";


        System.out.println(TECHO);
        for (int profundidad = 0; profundidad < profundidadPozo; profundidad++) {
            String elemento;
            if (profundidad==profundidadCaracol) {
                elemento = CARACOL;
            } else if (profundidad>=profundidadAgua) {
                elemento = AGUA;
            } else {
                elemento = PARED;
            }
            System.out.println(elemento);
        }
        System.out.println(SUELO);

    }
}
