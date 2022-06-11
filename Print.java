public class Print {
    public static final String resetColour = "\u001B[0m";
    public static final String setColourBlack = "\u001B[30m";
    public static final String setColourRed = "\u001B[31m";
    public static final String setColourGreen = "\u001B[32m";
    public static final String setColourYellow = "\u001B[33m";
    public static final String setColourBlue = "\u001B[34m";
    public static final String setColourPurple = "\u001B[35m";
    public static final String setColourCyan = "\u001B[36m";
    public static final String setColourWhite = "\u001B[37m";

    public void printGreen(String string) {
        System.out.println(setColourGreen + string + resetColour);
    }

    public void printBlack(String string) {
        System.out.println(setColourBlack + string + resetColour);
    }

    public void printRed(String string) {
        System.out.println(setColourRed + string + resetColour);
    }

    public void printYellow(String string) {
        System.out.println(setColourYellow + string + resetColour);
    }

    public void printBlue(String string) {
        System.out.println(setColourBlue + string + resetColour);
    }

    public void printPurple(String string) {
        System.out.println(setColourPurple + string + resetColour);
    }

    public void printCyan(String string) {
        System.out.println(setColourCyan + string + resetColour);
    }

    public void printWhite(String string) {
        System.out.println(setColourWhite + string + resetColour);
    }

}
