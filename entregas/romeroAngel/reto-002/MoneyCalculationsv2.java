class MoneyCalculationsv2 {
    public static void main(String [] args){
			
        int sellPrice = 724;
        int paid = 1300;
        int change = paid - sellPrice;	
        int bill;
        int billQty;   
        String message;  

        String bil100 = "billete de " + 100 + " euros"; 
        String bil50 = "billete de " + 50 + " euros"; 
        String bil20 = "billete de " + 20 + " euros"; 
        String bil10 = "billete de " + 10 + " euros"; 
        String bil5 = "billete de " + 5 + " euros"; 
        String mon2 = "moneda de " + 2 + " euros";
        String mon1 = "moneda de " + 1 + " euro";

        System.out.println("||===================||");
        System.out.println("||  RECIBO DE COMPRA ||");			
        System.out.println("||===================||");	
        System.out.println();

        System.out.println("El precio total es: " + sellPrice + " euros");
        System.out.println("Usted ha dado: " + paid + " euros");
        System.out.println();
        
        System.out.println("Su cambio es de: " + change + " euros,");
        System.out.println("dado con un total de: ");
        System.out.println();

        bill = 100;
        billQty  = change/bill;
        change = change%bill;
        message = billQty  > 0 ? billQty  + " " + bil100 + "\n" : ""; 
        System.out.print(message);
        
        bill = 50;
        billQty = change/bill;
        change = change%bill;
        message = billQty  > 0 ? billQty  + " " + bil50 + "\n" : ""; 
        System.out.print(message);
        
        bill = 20;
        billQty  = change/bill;
        change = change%bill;
        message = billQty  > 0 ? billQty  + " " + bil20 + "\n" : ""; 
        System.out.print(message);
        
        bill = 10;
        billQty  = change/bill;
        change = change%bill;
        message = billQty  > 0 ? billQty  + " " + bil10 + "\n" : "";  
        System.out.print(message);
       
        bill = 5;
        billQty  = change/bill;
        change = change%bill;
        message = billQty  > 0 ? billQty  + " " + bil5 + "\n" : "";  
        System.out.print(message);

        bill = 2;
        billQty  = change/bill;
        change = change%bill;
        message = billQty  > 0 ? billQty  + " " + mon2 + "\n"  : "";  
        System.out.print(message);
       
        bill = 1;
        billQty  = change/bill;
        message = billQty  > 0 ? billQty  + " " + mon1 + "\n"  : ""; 
        System.out.print(message);
 
        System.out.println();
        System.out.println("-------------");
        System.out.println("Gracias por su compra!  ");
           
    }	
}
