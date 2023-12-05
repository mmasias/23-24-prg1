package roseteEirik.retos.ExamenParcial;

public class Probabilidades {
    
    public static void main(String[] args) {

        for(int test = 0; test <= 100; test++){
            int column = 0;
            boolean lightning = Math.random() < 0.20;
                
            if (column != 0){
                lightning = false;
            } else if(lightning){
                column = (int)(Math.random()*(6)+1);
                System.out.println(column);
            }
        } 
    }
}
