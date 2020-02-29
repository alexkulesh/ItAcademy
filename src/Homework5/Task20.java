package Homework5;

/**
 * Task 20. You have the string with text. Print a text with last letters of
 * words.
 *
 */
public class Task20 {

    public static void main(String[] args) {
        String text = "String with text./ss";
        String symbols = " .,-;:?!";
        char lastLetter;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'z') { //If there are letters in that position, then...
                if (i == text.length() - 1) {                   //Finds out if that is the last symbol in the string.
                    lastLetter = text.charAt(i);
                    System.out.print(lastLetter);
                    break;
                }
                for (int j = 0; j < symbols.length(); j++) {    //Finds out if that is the last letter in a word.
                    if (text.charAt(i + 1) == symbols.charAt(j)) {
                        lastLetter = text.charAt(i);
                        System.out.print(lastLetter);
                    }
                }
            }
        }
    }
}
