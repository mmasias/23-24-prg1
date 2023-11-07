public class Reto9 {
	public static void main(String[]args) {
		int alturacaracol=21;
		int dia=0;
		int coche=0;
		int lluvia=0;
		int alturalluvia=22;
		int sube=0;
		int baja=0;
		
		do {
			if(dia==0) {
				System.out.println("Oh no un caracol se cayo al pozo.");
			}
			
			System.out.println("Dia "+dia+":");
			
			
			if(dia!=0) {
				if(dia<20) {
					sube=(int)((Math.random()*4)+1);
					alturacaracol=alturacaracol-sube;
				}else if(dia>20&&dia<=50) {
					//El caracol se cansa
					sube=(int)((Math.random()*3)+1);
					alturacaracol=alturacaracol-sube;
				}
				coche=(int)(Math.random()*100)+1;
				lluvia=(int)(Math.random()*100)+1;
				baja=(int)((Math.random()*3));
			}
			
			
			if(dia==20) {
				System.out.println("Parece que el caracol se ha debilitado (El maximo que puede subir se ha reducido)");
			}
			
			//Si pasa el coche
			if(coche>=1 && coche<=35) {
				alturacaracol=alturacaracol+2;
				System.out.println("TERREMOTOOOOO, un coche ha aparcado al lado del pozo. (El caracol desciendio 2m)");
			}
			
			//Si llueve 
			if(lluvia>=1 && lluvia<=5) {
				alturalluvia=alturalluvia-2;
				System.out.println("DILUVIOOOOOO, hay una lluvia torrencial encima del pozo.");
			}else if(lluvia>5 && lluvia<=15) {
				alturalluvia=alturalluvia-1;
				System.out.println("Hoy ha llovido un poco.");
			}
			alturacaracol=alturacaracol+baja;
			//Para que nunca este mas alto ni mas bajo que lo que mide el pozo
			if(alturacaracol<0) {
				alturacaracol=0;
			}else if(alturacaracol>21) {
				alturacaracol=21;
			}
			
			//Pozo con caracol
			for(int i=0;i<=22;i++) {
				if(i==0 && (coche>35 || coche<1)&& i!=alturacaracol) {
					System.out.println("[__]              [__]");
				}else if(i==0 && coche>=1 && coche<=35 && i!=alturacaracol){
					System.out.println("[__]    O-=-O     [__]");
				}else if(i==22) {
					System.out.println(" [][][][][][][][][]");
				}else if(i>=alturalluvia) {
					System.out.println(" []~~~~~~~~~~~~~~[] _ __ "+(i-1));
				}else if(i==alturacaracol && i!=0){
					System.out.println(" []    _@)_/’    [] _ __ "+(i-1));
				}else if(i==alturacaracol) {
					System.out.println("[__]    _@)_/’    [__]");
				}else {
					System.out.println(" []:. :. :. :. :.[] _ __ "+(i-1));
				}
			}
			
			//Lo que pasa en el día
			if(alturacaracol>=alturalluvia) {
				System.out.println("El caracol se ha ahogado brutalmente y ahora esta muerto.");
				break;
			}
			if(alturacaracol==0) {
				System.out.println("ESCAPO DEL POZO +30LPS");
				break;
			}else if (dia!=50&& dia!=0) {
				System.out.println("El caracol ha subido "+sube+"m por el día y se ha resbalado "+baja+"m por la noche \n"+
						"Esta en la altura "+(-(alturacaracol-1))+"m");
			}
			if(dia==50 && alturacaracol!=0) {
				System.out.println("El caracol se ha muerto de cansancio, no logro salir peeposhy \n"
							+"Se quedo en la altura "+(-(alturacaracol-1))+"m");
			}
			dia++;
		}while(dia<=50);
	}	

}
