import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6, respuesta7, numeroPensado;
        numeroPensado = 0;

        System.out.println();
        System.out.println("Utilice 1 para SI, 0 para NO");
        System.out.println("Piense un número del 1 al 99");
        System.out.println();

        Tarjeta1();
        System.out.println();
        System.out.println("¿Está en la 1ra tarjeta?");
        respuesta1 = entrada.nextInt();
        if(respuesta1 == 1 || respuesta1 == 0){
            if(respuesta1 == 1){
                numeroPensado = numeroPensado + 1;
            }
        }else{
            System.out.println("La respuesta está fuera de los valores permitidos. El número será incorrecto.");
        }

        System.out.println();
        Tarjeta2();
        System.out.println();
        System.out.println("¿Está en la 2a tarjeta?");
        respuesta2 = entrada.nextInt();
        if(respuesta2 == 1 || respuesta2 == 0){
            if(respuesta2 == 1){
                numeroPensado = numeroPensado + 2;
            }
        }else{
            System.out.println("La respuesta está fuera de los valores permitidos. El número será incorrecto.");
        }

        System.out.println();
        Tarjeta3();
        System.out.println();
        System.out.println("¿Está en la 3a tarjeta?");
        respuesta3 = entrada.nextInt();
        if(respuesta3 == 1 || respuesta3 == 0){
            if(respuesta3 == 1){
                numeroPensado = numeroPensado + 4;
            }
        }else{
            System.out.println("La respuesta está fuera de los valores permitidos. El número será incorrecto.");
        }

        System.out.println();
        Tarjeta4();
        System.out.println();
        System.out.println("¿Está en la 4a tarjeta?");
        respuesta4 = entrada.nextInt();
        if(respuesta4 == 1 || respuesta4 == 0){
            if(respuesta4 == 1){
                numeroPensado = numeroPensado + 8;
            }
        }else{
            System.out.
                    println("La respuesta está fuera de los valores permitidos. El número será incorrecto.");
        }

        System.out.println();
        Tarjeta5();
        System.out.println();
        System.out.println("¿Está en la 5a tarjeta?");
        respuesta5 = entrada.nextInt();
        if(respuesta5 == 1 || respuesta5 == 0){
            if(respuesta5 == 1){
                numeroPensado = numeroPensado + 16;
            }
        }else{
            System.out.println("La respuesta está fuera de los valores permitidos. El número será incorrecto.");
        }

        System.out.println();
        Tarjeta6();
        System.out.println();
        System.out.println("¿Está en la 6a tarjeta?");
        respuesta6 = entrada.nextInt();
        if(respuesta6 == 1 || respuesta6 == 0){
            if(respuesta6 == 1){
                numeroPensado = numeroPensado + 32;
            }
        }else{
            System.out.println("La respuesta está fuera de los valores permitidos. El número será incorrecto.");
        }

        System.out.println();
        Tarjeta7();
        System.out.println();
        System.out.println("¿Está en la 7ma tarjeta?");
        respuesta7 = entrada.nextInt();
        if(respuesta7 == 1 || respuesta7 == 0){
            if(respuesta7 == 1){
                numeroPensado = numeroPensado + 64;
            }
        }else{
            System.out.println("La respuesta está fuera de los valores permitidos. El número será incorrecto.");
        }

        System.out.println();
        System.out.println("El número pensado es " + numeroPensado);

        entrada.close();

    }

    static void Tarjeta1(){
        System.out.println(" +---------------+");
        System.out.println(" |   Tarjeta 1   |");
        System.out.println(" | ------------- |");
        System.out.println(" | 1 21 41 61 81 |");
        System.out.println(" | 3 23 43 63 83 |");
        System.out.println(" | 5 25 45 65 85 |");
        System.out.println(" | 7 27 47 67 87 |");
        System.out.println(" | 9 29 49 69 89 |");
        System.out.println(" |11 31 51 71 91 |");
        System.out.println(" |13 33 53 73 93 |");
        System.out.println(" |15 35 55 75 95 |");
        System.out.println(" |17 37 57 77 97 |");
        System.out.println(" |19 39 59 79 99 |");
        System.out.println(" +---------------+");
    }
    static void Tarjeta2(){
        System.out.println(" +---------------+");
        System.out.println(" |   Tarjeta 2   |");
        System.out.println(" | ------------- |");
        System.out.println(" | 2 22 42 62 82 |");
        System.out.println(" | 3 23 43 63 83 |");
        System.out.println(" | 6 26 46 66 86 |");
        System.out.println(" | 7 27 47 67 87 |");
        System.out.println(" |10 30 50 70 90 |");
        System.out.println(" |11 31 51 71 91 |");
        System.out.println(" |14 34 54 74 94 |");
        System.out.println(" |15 35 55 75 95 |");
        System.out.println(" |18 38 58 78 98 |");
        System.out.println(" |19 39 59 79 99 |");
        System.out.println(" +---------------+");

    }
    static void Tarjeta3(){
        System.out.println(" +---------------+");
        System.out.println(" |   Tarjeta 3   |");
        System.out.println(" | ------------- |");
        System.out.println(" | 4 22 44 62 84 |");
        System.out.println(" | 5 23 45 63 85 |");
        System.out.println(" | 6 28 46 68 86 |");
        System.out.println(" | 7 29 47 69 87 |");
        System.out.println(" |12 30 52 70 92 |");
        System.out.println(" |13 31 53 71 93 |");
        System.out.println(" |14 36 54 75 94 |");
        System.out.println(" |15 35 55 75 95 |");
        System.out.println(" |20 38 60 78    |");
        System.out.println(" |21 39 61 79    |");
        System.out.println(" +---------------+");
    }
    static void Tarjeta4(){
        System.out.println(" +---------------+");
        System.out.println(" |   Tarjeta 4   |");
        System.out.println(" | ------------- |");
        System.out.println(" | 8 26 44 62 88 |");
        System.out.println(" | 9 27 45 63 89 |");
        System.out.println(" |10 28 46 72 90 |");
        System.out.println(" |11 29 47 73 91 |");
        System.out.println(" |12 30 56 74 92 |");
        System.out.println(" |13 31 57 75 93 |");
        System.out.println(" |14 40 58 76 94 |");
        System.out.println(" |15 41 59 77 95 |");
        System.out.println(" |24 42 60 78    |");
        System.out.println(" |25 43 61 79    |");
        System.out.println(" +---------------+");
    }
    static void Tarjeta5(){
        System.out.println(" +---------------+");
        System.out.println(" |   Tarjeta 5   |");
        System.out.println(" | ------------- |");
        System.out.println(" |16 26 52 62 88 |");
        System.out.println(" |17 27 53 63 89 |");
        System.out.println(" |18 28 54 80 90 |");
        System.out.println(" |19 29 55 81 91 |");
        System.out.println(" |20 30 56 82 92 |");
        System.out.println(" |21 31 57 83 93 |");
        System.out.println(" |22 48 58 84 94 |");
        System.out.println(" |23 49 59 85 95 |");
        System.out.println(" |24 50 60 86    |");
        System.out.println(" |25 51 61 87    |");
        System.out.println(" +---------------+");
    }
    static void Tarjeta6(){
        System.out.println(" +------------+");
        System.out.println(" | Tarjeta 6  |");
        System.out.println(" | ---------- |");
        System.out.println(" |32 42 52 62 |");
        System.out.println(" |33 43 53 63 |");
        System.out.println(" |34 44 54 99 |");
        System.out.println(" |35 45 55    |");
        System.out.println(" |36 46 56    |");
        System.out.println(" |37 47 57    |");
        System.out.println(" |38 48 58    |");
        System.out.println(" |39 49 59    |");
        System.out.println(" |40 50 60    |");
        System.out.println(" |41 51 61    |");
        System.out.println(" +---------------+");
    }
    static void Tarjeta7(){
        System.out.println(" +-------------+");
        System.out.println(" |  Tarjeta 7  |");
        System.out.println(" | ----------- |");
        System.out.println(" | 64 74 84 94 |");
        System.out.println(" | 65 75 85 95 |");
        System.out.println(" | 66 76 86 96 |");
        System.out.println(" | 67 77 87 97 |");
        System.out.println(" | 68 78 88 98 |");
        System.out.println(" | 69 79 89 99 |");
        System.out.println(" | 70 80 90    |");
        System.out.println(" | 71 81 91    |");
        System.out.println(" | 72 82 92    |");
        System.out.println(" | 73 83 93    |");
        System.out.println(" +-------------+");
    }
}
