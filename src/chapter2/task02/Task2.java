package chapter2.task02;

/**
 * Create all of the primitives (except long and double) with different values.
 * Concatenate them into a string and print it to the screen so it will print: H3110 w0rld 2.0 true
 */
class Task2 {
    public static void main(String[] args) {
        byte bNum = 0;
        short sNum = 3;
        int iNum = 110;
        float decimal = 2.0f;
        char letter = 'H';
        char letter2 = 'w';
        char letter3 = 'r';
        char letter4 = 'l';
        char letter5 = 'd';
        char space = ' ';
        boolean bool = true;

        String output = "" + letter + sNum + iNum + space + letter2 + bNum + letter3 + letter4 + letter5 + space + decimal + space + bool;
        System.out.println(output);
    }
}