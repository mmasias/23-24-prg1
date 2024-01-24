import java.util.Scanner;

class ExamenFinal {
	public static void main(String[] args) {
		String[] elements = { "Aire", "Agua", "Tierra", "Fuego" };
		boolean exit = false;

		gretingMessage();
		while(!exit) {
			menu();
			int userOption = askUserInput();
			exit = userOption == 3 ? true : exit;

			optionHandler(userOption, elements);
		}
		System.out.println("\nPrograma finalizado!");
	}

	static void gretingMessage() {
		String greetingMessage = 
			"Bienvenido al Juego de Alquimia!\n" + 
			"\nCombina elementos para descubrir nuevos.\n";

		System.out.println(greetingMessage);
	}

	static void menu() {
		String options = "\n" + 
			"1. Listar elementos\n" + 
			"2. Proponer combinación\n" + 
			"3. Salir\n";

		System.out.println("-".repeat(15));
		System.out.println("MENU DEL JUEGO");
		System.out.println(options);
	}

	static int askUserInput() {
		Scanner scanner = new Scanner(System.in);
		int userOption = 0;
		while(!(userOption == 1 || userOption == 2 || userOption == 3)) {
			System.out.print("> SELECCIONE OPCIÓN: ");
			userOption = scanner.nextInt();
		}
		return userOption;
	}

	static void optionHandler(int userOption, String[] elements) {
		if(userOption == 1) {
			System.out.println("Elementos conocidos:\n");
			for(int i = 0; i < elements.length; i++) {
				System.out.println(elements[i]);
			}
			System.out.println();
		}

		if(userOption == 2) {
			System.out.println("option 1");
		}

		if(userOption == 3) {
			System.out.println("option 1");
		}
	}
}

