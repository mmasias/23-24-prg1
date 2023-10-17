import java.util.Scanner;

class LeerMente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String MENSAJE="Esta aqui? (1:SI/2:NO):";
        final String tabla1 = """
                +---------------+
                | 1 21 41 61 81 |
                | 3 23 43 63 83 |
                | 5 25 45 65 85 |
                | 7 27 47 67 87 |
                | 9 29 49 69 89 |
                |11 31 51 71 91 |
                |13 33 53 73 93 |
                |15 35 55 75 95 |
                |17 37 57 77 97 |
                |19 39 59 79 99 |
                +---------------+

                    """;
        final String tabla2="""
                +---------------+
                | 2 22 42 62 82 |
                | 3 23 43 63 83 |
                | 6 26 46 66 86 |
                | 7 27 47 67 87 |
                |10 30 50 70 90 |
                |11 31 51 71 91 |
                |14 34 54 74 94 |
                |15 35 55 75 95 |
                |18 38 58 78 98 |
                |19 39 59 79 99 |
                +---------------+
                """;
        final String tabla3="""
                +---------------+
                | 4 22 44 62 84 |
                | 5 23 45 63 85 |
                | 6 28 46 68 86 |
                | 7 29 47 69 87 |
                |12 30 52 70 92 |
                |13 31 53 71 93 |
                |14 36 54 76 94 |
                |15 37 55 77 95 |
                |20 38 60 78    |
                |21 39 61 79    |
                +---------------+
                """;
        final String tabla4="""
                +---------------+
                | 8 26 44 62 88 |
                | 9 27 45 63 89 |
                |10 28 46 72 90 |
                |11 29 47 73 91 |
                |12 30 56 74 92 |
                |13 31 57 75 93 |
                |14 40 58 76 94 |
                |15 41 59 77 95 |
                |24 42 60 78    |
                |25 43 61 79    |
                +---------------+
                """;
        final String tabla5="""
                +---------------+
                |16 26 52 62 88 |
                |17 27 53 63 89 |
                |18 28 54 80 90 |
                |19 29 55 81 91 |
                |20 30 56 82 92 |
                |21 31 57 83 93 |
                |22 48 58 84 94 |
                |23 49 59 85 95 |
                |24 50 60 86    |
                |25 51 61 87    |
                +---------------+
                """;
        final String tabla6="""
                +---------------+
                |32 42 52 62    |
                |33 43 53 63    |
                |34 44 54 99    |
                |35 45 55       |
                |36 46 56       |
                |37 47 57       |
                |38 48 58       |
                |39 49 59       |
                |40 50 60       |
                |41 51 61       |
                +---------------+
                """;
        final String tabla7="""
                +---------------+
                |64 74 84 94    |
                |65 75 85 95    |
                |66 76 86 96    |
                |67 77 87 97    |
                |68 78 88 98    |
                |69 79 89 99    |
                |70 80 90       |
                |71 81 91       |
                |72 82 92       |
                |73 83 93       |
                +---------------+
                """;
        int numero=0;
        System.out.println("Piensa un número del 1 al 99");
        System.out.println("TARJETA 1");
        System.out.println(tabla1);
        System.out.print(MENSAJE);
        if (scanner.nextInt()==1){
            numero+=1;
        }
        System.out.println("TARJETA 2");
        System.out.println(tabla2);
        System.out.print(MENSAJE);
        if (scanner.nextInt()==1){
            numero+=2;
        }
        System.out.println("TARJETA 3");
        System.out.println(tabla3);
        System.out.print(MENSAJE);
        if (scanner.nextInt()==1){
            numero+=4;
        }
        System.out.println("TARJETA 4");
        System.out.println(tabla4);
        System.out.print(MENSAJE);
        if (scanner.nextInt()==1){
            numero+=8;
        }
        System.out.println("TARJETA 5");
        System.out.println(tabla5);
        System.out.print(MENSAJE);
        if (scanner.nextInt()==1){
            numero+=16;
        }
        System.out.println("TARJETA 6");
        System.out.println(tabla6);
        System.out.print(MENSAJE);
        if (scanner.nextInt()==1){
            numero+=32;
        }
        System.out.println("TARJETA 7");
        System.out.println(tabla7);
        System.out.print(MENSAJE);
        if (scanner.nextInt()==1){
            numero+=64;
        }
        System.out.println("Tu número es: "+numero);
        
    }
}
