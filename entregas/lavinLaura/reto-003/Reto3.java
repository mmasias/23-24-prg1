// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;


class Reto3 {

   Reto3() {




   }

   public static void main(String[] var0) {
      short var1 = 170;
      Scanner var2 = new Scanner(System.in) ;
      System.out.print("¿Cual es el total a pagar?:");
    int var3 = var2.nextInt();
     


    int var4 = var3 - var1;
    System.out.println(" la vuelta es de " + var4 + "euros");

    int var5 = var4 / 50;
    var4 %= 50;

    int var6 = var4 / 20;
    var4 %= 20;

    int var7 = var4 / 10;
    var4 %= 10;

    int var8 = var4 / 5;
    var4 %= 5;

    int var9 = var4 / 2;
    var4 %= 2;





 System.out.println(var5 > 0 ? "billete de 50 euros: " + var5 :"");
 System.out.println(var6 > 0 ? "billete de 20 euros: " + var6 :"");
 System.out.println(var7 > 0 ? "billete de 10 euros: " + var7 :"");
 System.out.println(var8 > 0 ? "billete de 5 euros: " + var8 :"");
 System.out.println(var9 > 0 ? "monedas de 2 euros: " + var9 :"");
 System.out.println(var4 > 0 ? "monedas de 1 euros: " + var4 :"");

 var2.close();






   }






}










  