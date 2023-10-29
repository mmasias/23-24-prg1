package roseteEirik.retoCaracol;
import java.util.Scanner;

class UnPozo {
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);

        int deepWell = 20;
        int deepWater = 12;
        int deepSnail = 8;

        final String BOTTOM_WELL = "  [][][][][][][][][]\n";
        final String EDGE_WELL = "\n[__]              [__]";
        final String CAR = "\n[__]    O-=-O     [__]";
        final String FILLED_WELL = "  []:. :. :. :. :.[]";
        final String SNAIL = "  []:.  _@)_/'  :.[]";
        final String FILLED_WATER = "  []~~~~~~~~~~~~~~[]";

        System.out.println(EDGE_WELL);
        for (int deep = 0; deep < deepWell; deep++){
            String element;
            if (deep == deepSnail){
                element = SNAIL;
            } else if (deep >= deepWater){
                element = FILLED_WATER;
            } else {
                element = FILLED_WELL;
            }
            System.out.println(element + " --- " + (deep + 1));
        }
        System.out.println(BOTTOM_WELL);

    }
}