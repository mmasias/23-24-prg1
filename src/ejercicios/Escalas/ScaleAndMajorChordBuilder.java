package ejercicios.Escalas;

class ScaleAndMajorChordBuilder {

    static final String[] NOTES = { "Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si" };

    public static void main(String[] args) {

        String[] majorScale = majorScale("DO");
        printNotes(majorScale);
        String[] majorChord = builChord(majorScale);
        printNotes(majorChord);
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

    private static String[] majorScale(String note) {
        int[] intervals = { 2, 2, 1, 2, 2, 2, 1 };
        String[] scale = new String[8];
        int noteIndex = getIndex(note);

        for (int i = 0; i < 8; i++) {
            scale[i] = getNote(noteIndex % 12);
            if (i < 7) {
                noteIndex = noteIndex + intervals[i];
            }
        }
        return scale;
    }

    private static String[] builChord(String[] scale) {
        String[] chord = { scale[0], scale[2], scale[4] };
        return chord;
    }
}
