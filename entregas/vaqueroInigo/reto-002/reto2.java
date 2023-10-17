class Segundo {
    public static void main(String[] args) {
        
        int entregado=400;
        int precio=232;
        int vuelta= entregado-precio;
        int pendiente;
        int bill100;
        int bill50;
        int bill20;
        int bill10;
        int bill5;
        int coin2;
        int coin1;

        System.out.println("El precio a pagar son " +precio+ " euros");
        System.out.println("Se ha entregado " +entregado+ " euros");
        System.out.println("--------------------------------------------------");
        System.out.println("La vuelta es " + vuelta);
        System.out.println("--------------------------------------------------");

        bill100= vuelta/100;
        pendiente=vuelta%100;
        System.out.println(bill100 > 0 ? "Se devolverán "+bill100+" billetes de 100": "");
        System.out.println(bill100 > 0 ? "Quedan por pagar "+pendiente+ "euros": "");
        System.out.println(bill100 > 0 ? "Billetes de 100 euros: " + bill100: "");

        bill50= pendiente/50;
        pendiente=pendiente%50;
        System.out.println(bill50>0 ?"Se devolverán "+bill50+" billetes de 50": "");
        System.out.println(bill50>0?"Quedan por pagar "+pendiente+ "euros": "");
        System.out.println(bill50 > 0 ? "Billetes de 50 euros: " + bill50: "");

        bill20= pendiente/20;
        pendiente=pendiente%20;
        System.out.println(bill20>0?"Se devolverán "+bill20+" billetes de 20": "");
        System.out.println(bill20>0?"Quedan por pagar "+pendiente+ "euros": "");
        System.out.println(bill20 > 0 ? "Billetes de 20 euros: " + bill20: "");

        bill10= pendiente/10;
        pendiente=pendiente%10;
        System.out.println(bill10>0?"Se devolverán "+bill10+" billetes de 10": "");
        System.out.println(bill10>0?"Quedan por pagar "+pendiente+ "euros": "");
        System.out.println(bill10 > 0 ? "Billetes de 10 euros: " + bill10: "");

        bill5= pendiente/5;
        pendiente=pendiente%5;
        System.out.println(bill5>0?"Se devolverán "+bill5+" billetes de 5": "");
        System.out.println(bill5>0?"Quedan por pagar "+pendiente+ "euros": "");
        System.out.println(bill5 > 0 ? "Billetes de 5 euros: " + bill5: "");

        coin2= pendiente/2;
        pendiente=pendiente%2;
        System.out.println(coin2>0?"Se devolveran "+coin2+" monedas de 2 euros": "");
        System.out.println(coin2>0?"Quedan por pagar "+pendiente+ "euros": "");
        System.out.println(coin2> 0 ? "Monedas de 2 euros: " + coin2: "");
        
        coin1= pendiente/1;
        pendiente=pendiente%1;
        System.out.println(coin1>0?"Se devolveran "+coin1+" monedas de 1 euros":"");
        System.out.println(coin1> 0 ? "Monedas de 1 euros: " + coin1: "");

        System.out.println("Quedan por pagar "+pendiente+ "euros");


    }
} 