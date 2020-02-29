package Homework5;

/**
 * Task 19. You have the string with text. Count a number of words in the text.
 *
 */
public class Task19 {

    public static void main(String[] args) {
        String text = "You should counter here six words. So, let the task be a little harder.";
        String symbols = " .,-;:?!";
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'z') { //If there are letters in that position, then...
                if (i == text.length() - 1) {                     //Finds out if that is the last symbol in the string.
                    wordCount++;
                    break;
                }
                for (int j = 0; j < symbols.length(); j++) {      //Finds out if that is the last letter in a word.
                    if (text.charAt(i + 1) == symbols.charAt(j)) {
                        wordCount++;
                    }
                }
            }
        }
        System.out.println(wordCount);
    }
}
