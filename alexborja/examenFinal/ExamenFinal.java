import java.util.Scanner;

class ExamenFinal {
	public static void main(String[] args) {
		menu();
	}

	static void menu() {
		Scanner scanner = new Scanner(System.in);
		String greetingMessage = "Bienvenido al Juego de Alquimia!\n" + "\nCombina elementos para descubrir nuevos.\n";
		String options = "\n" + "1. Listar elementos\n" + "2. Proponer combinación\n" + "3. Salir\n";

		System.out.println(greetingMessage);
		System.out.println("-".repeat(15));
		System.out.println("MENU DEL JUEGO");
		System.out.println(options);
	}
}

