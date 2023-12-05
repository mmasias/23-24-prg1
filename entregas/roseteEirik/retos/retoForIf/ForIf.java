package roseteEirik.retos.retoForIf;

class ForIf {
    public static void main(String[] args) {

        final int DIMENSION = 21;
        final int SEGUNDOS = 5;

        
        one(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();

        two(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        three(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        four(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        five(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        six(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        seven(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        eight(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        nine(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        ten(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        eleven(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        twelve(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        thirteen(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        fourteen(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        fifteen(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        sixteen(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        seventeen(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        eighteen(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        nineteen(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        nineteenVar(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        twenty(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
        
        twentyOne(DIMENSION);
        pause(SEGUNDOS);
        cleanScreen();
    

    }
   
    static void one(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    column==2 && row==2
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void two(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    column==2
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    
    static void three(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    row==20
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    
    static void four(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    column >= 8 && column <= 14
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void five(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    column == 11 && row == 11
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void six(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    column == 11 || row == 11
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void seven(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    column == row
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void eight(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    22 == column + row
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void nine(final int DIMENSION){

        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
               
                    column == row || 22 == column + row
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    
    static void ten(final int DIMENSION){
        
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {
                
                if (
                
                    0 != column + row
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    
    static void eleven(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
                
                    11 != column || 11!= row
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    
    static void twelve(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
                
                    11 != column && 11!= row
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void thirteen(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
                
                    column == row + 1 || row == column + 1
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void fourteen(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
                
                    column == 2 || row == 2 ||
                    column == 20 || row == 20
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void fifteen(final int DIMENSION){
    
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
                
                    column >= 2 && column <= 5 ||
                    row >= 2 && row <= 5
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void sixteen(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (
                
                    column != 1 && column != 21 &&
                    row != 1 && row != 21
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void seventeen(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (

                    (column == 2 || column == 20) && (row != 1 && row != 21) ||
                    (row == 2 || row == 20) && (column != 1 && column != 21)
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void eighteen(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (

                    column <= 5 && row <= 5
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
    
    static void nineteen(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (

                    0 == (column + row) % 2
                
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void nineteenVar(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (

                    1 == (column * row) % 4 ||
                    1 == ((column - 1) * row) % 4 ||
                    1 == (column * (row - 1)) % 4 ||
                    1 == ((column - 1) * (row - 1)) % 4 ||
                    column == 21 ||
                    row == 21

                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void twenty(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (

                    1 == (column + row) % 4

                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    static void twentyOne(final int DIMENSION){
    
        for (int row = 1; row <= DIMENSION; row = row + 1) {
            for (int column = 1; column <= DIMENSION; column = column + 1) {

                if (

                    !(0 == (column * row) % 14 &&
                      0 == (column * row) % 8)
                    //!(2 == (column + row) % 6)
                    /*!(4 == (7 * (column + row)) % 6 &&
                      column % 6 == row % 6 ||
                      4 == (7 * (column + 1)) % 6 &&
                      column % 6 == row % 6 ) */
                    
                ) {
                    System.out.print("[@]");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void pause(final int SEGUNDOS) {
        try {
            Thread.sleep(1000 * SEGUNDOS);
        } catch (InterruptedException e) {
        }
    }

    static void cleanScreen(){

        System.out.println("\033[H\033[2J");
        System.out.flush();

    }
}