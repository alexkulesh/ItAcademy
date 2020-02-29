package Homework5;

/**
 * Task 20. You have the string with text. Print a text with last letters of
 * words.
 *
 */
public class Task20 {

    public static void main(String[] args) {
        String str = "String with text";
        char symbol;
        char letter;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (i == str.length() - 1) {
                letter = symbol;
                System.out.print(letter);
                break;
            }
            if (symbol >= 'A' && symbol <= 'z') {
                if (str.charAt(i + 1) == ' ' || str.charAt(i + 1) == '.' || str.charAt(i + 1) == ',') {
                    letter = symbol;
                    System.out.print(letter);
                }
            }
        }
    }

}
