import java.util.Scanner;

class ExamenFinal {
	public static void main(String[] args) {
		String[][] elements = { 
			{ "Aire" }, { "Agua" } , { "Tierra "} ,{ "Fuego" }, 
			{ "Agua", "Fuego", "Vapor"}, { "Agua", "Tierra", "Barro"}, 
			{ "Fuego", "Tierra", "Lava"}, { "Aire", "Tierra", "Polvo"}, 
			{ "Agua", "Aire", "Lluvia"},  { "Barro", "Lluvia", "Planta" },
			{ "Fuego", "Lava", "Hierro" }, { "Aire", "Lava", "Arena" },
			{ "Arena", "Fuego", "Vidrio" }, { "Hierro", "Vapor", "Alcohol" },
			{ "Barro", "Energia", "Vida"  }, { "Aire", "Fuego", "Energía" },
			{ "Energía", "Lluvia", "Tormenta" }, { "Barro", "Fuego", "Metal" },
			{ "Energía", "Metal", "Electricidad"}, { "Agua", "Electricidad", "Oxígeno"},
			{ "Electricidad", "Aire", "Ozono" }, { "Carbono", "Presión", "Diamante"},
			{ "Planta", "Tierra", "Carbono" }, { "Tierra" , "Tierra", "Presión",},
			{ "Planta", "Metal", "Madera" }, { "Hierro", "Madera", "Herramienta" },
			{ "Herramienta", "Vapor", "Vaporizador" }, { "Metal", "Electricidad", "Computadora"},
			{ "Computadora", "Energía", "Robot" }
		};
		String[] userElements = new String[29];
		userElements[0] = "Aire";
		userElements[1] = "Agua";
		userElements[2] = "Tierra";
		userElements[3] = "Fuego";

		boolean exit = false;

		gretingMessage();
		while(!exit) {
			menu();
			int userOption = askUserInput();
			exit = userOption == 3 ? true : exit;

			optionHandler(userOption, userElements, elements);
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

	static void optionHandler(int userOption, String[] userElements, String[][] elements) {
		if(userOption == 1) {
			showElements(userElements);
		}

		if(userOption == 2) {
			createElements(userElements, elements)
		}

		if(userOption == 3) {
			System.out.println("option 1");
		}
	}

	static void showElements(String[] userElements) {
		System.out.println("Elementos conocidos:\n");
		for(int i = 0; i < userElements.length; i++) {
			if(userElements[i] != null) {
				System.out.println((i + 1) + ". " + userElements[i]);
			}
		}
		System.out.println();
	}

	static void createElement(String[] userElements, String[] elements) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Selecciona dos elementos para combinarlos.");

		System.out.print("Ingresa el número del primer elemento: ");
		int elementOne = scanner.nextInt();

		System.out.print("Ingresa el número del segundo elemento: ");
		int elementTwo = scanner.nextInt();

		String ele1 = userElements[elementOne];
		String ele2 = userElements[elementTwo];

		for(int i = 0; i < elements.length; i++) {
			String[] currentElement = elements[i];
			String[] toMatch = { currentElement[0], currentElement[1] };
			

		}
	}
}

/*
 *	["agua", "aire"] -> user
 *	[row[0], row[1]] -> elements
 *
 *  user[0] in elements && user[1] in elements ?
 *  element = elements[i][2];
 *  add userElements[i] = element
 *
 * */
