class DevolverCambio{
    public static void main(String[] args){

        int productPrice = 4727;
        int customerCash = 5000;
        int changeCash = customerCash - productPrice;

        int billOneHundredChange = changeCash / 100;
        changeCash = changeCash % 100;
        int billFiftyChange = changeCash / 50;
        changeCash = changeCash % 50;
        int billTwentyChange = changeCash / 20;
        changeCash = changeCash % 20;  
        int billTenChange = changeCash / 10;
        changeCash = changeCash % 10;
        int billFiveChange = changeCash / 5;
        changeCash = changeCash % 5;
        int billTwoChange = changeCash / 2;
        changeCash = changeCash % 2;
        int billOneChange = changeCash;
        
        System.out.println("Debe pagar " + productPrice + " euros");
        System.out.println("Ha entregado " + customerCash + " euros");
        System.out.println("----------------------------------------");
        System.out.println(billOneHundredChange + " billete(s) de 100 euros \n---");
        System.out.println(billFiftyChange + " billete(s) de 50 euros \n---");
        System.out.println(billTwentyChange + " billete(s) de 20 euros \n---");
        System.out.println(billTenChange + " billete(s) de 10 euros \n---");
        System.out.println(billFiveChange + " billete(s) de 5 euros \n---");
        System.out.println(billTwoChange + " moneda(s) de 2 euros \n---");
        System.out.println(billOneChange + " moneda(s) de 1 euro");
    }
}