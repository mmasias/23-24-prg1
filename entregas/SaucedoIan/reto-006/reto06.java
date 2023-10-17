import java.util.Scanner;

public class reto06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String PREGUNTA = "Digite (1-si/0-no) dependiendo de si el numero esta en la tarjeta ";
        int numeroTarjeta = 1;
        int primerNumeroTarjeta = 1;
        int numeroPorAdivinar = 0;

        final String TARJETA1 = "            Tarjeta N1             "
                + "\n" + "-----------------------------------"
                + "\n" + "|  1  |  21  |  41  |  61  |  81  |"
                + "\n" + "|  3  |  23  |  43  |  63  |  83  |"
                + "\n" + "|  5  |  25  |  45  |  65  |  85  |"
                + "\n" + "|  7  |  27  |  47  |  67  |  87  |"
                + "\n" + "|  9  |  29  |  49  |  69  |  89  |"
                + "\n" + "|  11 |  31  |  51  |  71  |  91  |"
                + "\n" + "|  13 |  33  |  53  |  73  |  93  |"
                + "\n" + "|  15 |  35  |  55  |  75  |  95  |"
                + "\n" + "|  17 |  37  |  57  |  77  |  97  |"
                + "\n" + "|  19 |  39  |  59  |  79  |  99  |"
                + "\n" + "-----------------------------------";

        final String TARJETA2 = "            Tarjeta N2             "
                + "\n" + "-----------------------------------"
                + "\n" + "|  2  |  22  |  42  |  62  |  82  |"
                + "\n" + "|  3  |  23  |  43  |  63  |  83  |"
                + "\n" + "|  6  |  26  |  46  |  66  |  86  |"
                + "\n" + "|  7  |  27  |  47  |  67  |  87  |"
                + "\n" + "|  10 |  30  |  50  |  70  |  90  |"
                + "\n" + "|  11 |  31  |  51  |  71  |  91  |"
                + "\n" + "|  14 |  34  |  54  |  74  |  94  |"
                + "\n" + "|  15 |  35  |  55  |  75  |  95  |"
                + "\n" + "|  18 |  38  |  58  |  78  |  98  |"
                + "\n" + "|  19 |  39  |  59  |  79  |  99  |"
                + "\n" + "-----------------------------------";

        final String TARJETA3 = "            Tarjeta N3           "
                + "\n" + "-----------------------------------"
                + "\n" + "|  4  |  22  |  44  |  62  |  84  |"
                + "\n" + "|  5  |  23  |  45  |  63  |  85  |"
                + "\n" + "|  6  |  28  |  46  |  68  |  86  |"
                + "\n" + "|  7  |  29  |  47  |  69  |  87  |"
                + "\n" + "|  12 |  30  |  52  |  70  |  92  |"
                + "\n" + "|  13 |  31  |  53  |  71  |  93  |"
                + "\n" + "|  14 |  36  |  54  |  76  |  94  |"
                + "\n" + "|  15 |  37  |  55  |  77  |  95  |"
                + "\n" + "|  20 |  38  |  60  |  78  |      |"
                + "\n" + "|  21 |  39  |  61  |  79  |      |"
                + "\n" + "-----------------------------------";

        final String TARJETA4 = "            Tarjeta N4            "
                + "\n" + "-----------------------------------"
                + "\n" + "|  8  |  26  |  44  |  62  |  88  |"
                + "\n" + "|  8  |  26  |  44  |  62  |  88  |"
                + "\n" + "|  10 |  28  |  46  |  72  |  90  |"
                + "\n" + "|  11 |  29  |  47  |  73  |  91  |"
                + "\n" + "|  12 |  30  |  56  |  74  |  92  |"
                + "\n" + "|  13 |  31  |  57  |  75  |  93  |"
                + "\n" + "|  14 |  40  |  58  |  76  |  94  |"
                + "\n" + "|  15 |  41  |  59  |  77  |  95  |"
                + "\n" + "|  24 |  42  |  60  |  78  |      |"
                + "\n" + "|  25 |  43  |  61  |  79  |      |"
                + "\n" + "-----------------------------------";

        final String TARJETA5 = "            Tarjeta N5            "
                + "\n" + "-----------------------------------"
                + "\n" + "|  16 |  26  |  52  |  62  |  88  |"
                + "\n" + "|  17 |  27  |  53  |  63  |  89  |"
                + "\n" + "|  18 |  28  |  54  |  80  |  90  |"
                + "\n" + "|  19 |  29  |  55  |  81  |  91  |"
                + "\n" + "|  20 |  30  |  56  |  82  |  92  |"
                + "\n" + "|  21 |  31  |  57  |  83  |  93  |"
                + "\n" + "|  22 |  48  |  58  |  84  |  94  |"
                + "\n" + "|  23 |  49  |  59  |  85  |  95  |"
                + "\n" + "|  24 |  50  |  60  |  86  |      |"
                + "\n" + "|  25 |  51  |  61  |  87  |      |"
                + "\n" + "-----------------------------------";

        final String TARJETA6 = "       Tarjeta N6            "
                + "\n" + "----------------------------"
                + "\n" + "|  32 |  42  |  52  |  62  |"
                + "\n" + "|  33 |  43  |  53  |  63  |"
                + "\n" + "|  34 |  44  |  54  |  99  |"
                + "\n" + "|  35 |  45  |  55  |      |"
                + "\n" + "|  35 |  45  |  55  |      |"
                + "\n" + "|  35 |  45  |  55  |      |"
                + "\n" + "|  38 |  48  |  58  |      |"
                + "\n" + "|  39 |  49  |  59  |      |"
                + "\n" + "|  39 |  49  |  59  |      |"
                + "\n" + "|  39 |  49  |  59  |      |"
                + "\n" + "-----------------------------";

        final String TARJETA7 = "       Tarjeta N7            "
                + "\n" + "----------------------------"
                + "\n" + "|  64 |  74  |  84  |  94  |"
                + "\n" + "|  65 |  75  |  85  |  95  |"
                + "\n" + "|  66 |  76  |  86  |  96  |"
                + "\n" + "|  67 |  77  |  87  |  97  |"
                + "\n" + "|  68 |  78  |  88  |  98  |"
                + "\n" + "|  69 |  79  |  89  |  99  |"
                + "\n" + "|  70 |  80  |  90  |      |"
                + "\n" + "|  71 |  81  |  91  |      |"
                + "\n" + "|  72 |  82  |  92  |      |"
                + "\n" + "|  73 |  83  |  93  |      |"
                + "\n" + "----------------------------";

        System.out.println(TARJETA1);
        System.out.println(PREGUNTA + numeroTarjeta + ": ");
        int respuesta = scanner.nextInt();
        if (respuesta == 1) {
            numeroPorAdivinar = numeroPorAdivinar + primerNumeroTarjeta;

        }

        numeroTarjeta = 2;
        primerNumeroTarjeta = 2;
        System.out.println(TARJETA2);
        System.out.println(PREGUNTA + numeroTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            numeroPorAdivinar = numeroPorAdivinar + primerNumeroTarjeta;

        }

        numeroTarjeta = 3;
        primerNumeroTarjeta = 4;
        System.out.println(TARJETA3);
        System.out.println(PREGUNTA + numeroTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            numeroPorAdivinar = numeroPorAdivinar + primerNumeroTarjeta;

        }

        numeroTarjeta = 4;
        primerNumeroTarjeta = 8;
        System.out.println(TARJETA4);
        System.out.println(PREGUNTA + numeroTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            numeroPorAdivinar = numeroPorAdivinar + primerNumeroTarjeta;

        }

        numeroTarjeta = 5;
        primerNumeroTarjeta = 16;

        System.out.println(TARJETA5);
        System.out.println(PREGUNTA + numeroTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            numeroPorAdivinar = numeroPorAdivinar + primerNumeroTarjeta;

        }

        numeroTarjeta = 6;
        primerNumeroTarjeta = 32;
        System.out.println(TARJETA6);
        System.out.println(PREGUNTA + numeroTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            numeroPorAdivinar = numeroPorAdivinar + primerNumeroTarjeta;

        }

        numeroTarjeta = 7;
        primerNumeroTarjeta = 64;
        System.out.println(TARJETA7);
        System.out.println(PREGUNTA + numeroTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            numeroPorAdivinar = numeroPorAdivinar + primerNumeroTarjeta;

        }

        scanner.close();

        System.out.println("El numero en el que pensaste fue " + numeroPorAdivinar);

    }
}
