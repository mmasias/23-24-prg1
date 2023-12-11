package ejercicios.Escalas;

class ScaleAndMajorChordBuilder {

    static final String[] NOTES = {"Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"};
    
    public static void main(String[] args) {

        System.out.println(getIndex("Do"));
        System.out.println(getNote(0));
        printNotes(NOTES);
    }

    static int getIndex(String note) {
        for (int index = 0; index < NOTES.length; index++) {
            if (NOTES[index].equalsIgnoreCase(note)) {
                return index;
            }
        }
        return -1;
    }

    static String getNote(int index) {
        return NOTES[index];
    }

    private static void printNotes(String[] notes) {
        for (int note = 0; note < notes.length; note++) {
            System.out.print("[" + notes[note] + "] / ");
        }
        System.out.println();
    }    
}
