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
        int billOneChange = changeCash / 1;

        System.out.println("Debe pagar " + productPrice + " euros");
        System.out.println("Ha entregado " + customerCash + " euros");
        System.out.println("----------------------------------------");
        System.out.println(billOneHundredChange >= 1 ? billOneHundredChange + " billete(s) de 100 euros \n---" : "");
        System.out.println(billFiftyChange >= 1 ? billFiftyChange + " billete(s) de 50 euros \n---" : "");
        System.out.println(billTwentyChange >= 1 ? billTwentyChange + " billete(s) de 20 euros \n---" : "");
        System.out.println(billTenChange >= 1 ? billTenChange + " billete(s) de 10 euros \n---" : "");
        System.out.println(billFiveChange >= 1 ? billFiveChange + " billete(s) de 5 euros \n---" : "");
        System.out.println(billTwoChange >= 1 ? billTwoChange + " moneda(s) de 2 euros \n---" : "");
        System.out.println(billOneChange >= 1 ? billOneChange + " moneda(s) de 1 euro" : "");
    }
}