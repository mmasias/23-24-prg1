package ejercicios;

public class TestSimple {

    public static void main(String[] args) {

        final int NUMERO_FILAS = 5;
        final int NUMERO_COLUMNAS = 8;

        for (int fila=1;fila<=NUMERO_FILAS;fila++){
            for(int columna=1;columna<=NUMERO_COLUMNAS;columna++){
                System.out.print("(  ) ");
            }
            System.out.println();
        }


    }

}
