package entregas.garciaLydia.reto008;

public class CCF {


    /**
     * Clientes 60% 1 min
     * 4 cajas (fila general que se va a la vacia Carrefour)
     * 1 cliente >5 <15 items
     * 1 min/item
     */

    public static void main(String[] args) {
        int minuto = 0;

        int personasEnCola = 0;
        int itemsClienteCaja1 = 0;
        int itemsClienteCaja2 = 0;
        int itemsClienteCaja3 = 0;
        int itemsClienteCaja4 = 0;
        int llegaPersona = 0;


        itemsClienteCaja1 = (int) (Math.random() * (11) + 5);
        itemsClienteCaja2 = (int) (Math.random() * (11) + 5);
        itemsClienteCaja3 = (int) (Math.random() * (11) + 5);
        itemsClienteCaja4 = (int) (Math.random() * (11) + 5);


        do {
            int llegaPersonaPorcentaje = (int) (Math.random() * 100);


            if (llegaPersonaPorcentaje <= 60) {
                personasEnCola++;
                llegaPersona = 1;
            } else {

                llegaPersona = 0;
            }


            if (itemsClienteCaja1 > 0) {
                itemsClienteCaja1--;
            } else if (itemsClienteCaja1 == 0) {
                itemsClienteCaja1 = (int) (Math.random() * (11) + 5);
                personasEnCola = personasEnCola - 1;
            }
            if (itemsClienteCaja2 > 0) {
                itemsClienteCaja2--;
            } else if (itemsClienteCaja2 == 0) {
                itemsClienteCaja2 = (int) (Math.random() * (11) + 5);
                personasEnCola = personasEnCola - 1;
            }
            if (itemsClienteCaja3 > 0) {
                itemsClienteCaja3--;
            } else if (itemsClienteCaja3 == 0) {
                itemsClienteCaja3 = (int) (Math.random() * (11) + 5);
                personasEnCola = personasEnCola - 1;
            }
            if (itemsClienteCaja4 > 0) {
                itemsClienteCaja4--;
            } else if (itemsClienteCaja4 == 0) {
                itemsClienteCaja4 = (int) (Math.random() * (11) + 5);
                personasEnCola = personasEnCola - 1;
            }


            System.out.println("------------------------------------------------");
            System.out.println(" MINUTO " + minuto + "- Llegan " + llegaPersona + " clientes - En Cola: " + personasEnCola);
            System.out.println("CAJA1 [" + itemsClienteCaja1 + "] | CAJA2 [" + itemsClienteCaja2 + "] | CAJA3 [" + itemsClienteCaja3 + "] | CAJA4 [" + itemsClienteCaja4 + "] ");
            System.out.println("------------------------------------------------");


            minuto++;


        } while (minuto <= 720);


    }
}
