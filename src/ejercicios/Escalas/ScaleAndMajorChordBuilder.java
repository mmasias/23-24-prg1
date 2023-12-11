package ejercicios.Escalas;

class ScaleAndMajorChordBuilder {
    public static void main(String[] args) {

        System.out.println(getIndex("Do"));
        System.out.println(getNote(0));
    }

    static int getIndex(String note) {
        String[] notes = {"Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"};
        for (int index = 0; index < notes.length; index++) {
            if (notes[index].equalsIgnoreCase(note)) {
                return index;
            }
        }
        return -1;
    }

    static String getNote(int index) {
        String[] notes = { "Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si" };
        return notes[index];
    }
}
