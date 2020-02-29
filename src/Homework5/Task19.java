package Homework5;

/**
 * Task 19. You have the string with text. Count a number of words in the text.
 *
 */
public class Task19 {

    public static void main(String[] args) {
        String str = "You should counter here six words. So, let the task be a little harder.";
        String symbols = " .,-;:?!";
        char symbol;
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (i == str.length() - 1) {
                break;
            }
            if (symbol >= 'A' && symbol <= 'z') {
                for (int j = 0; j < symbols.length(); j++) {
                    if (str.charAt(i + 1) == symbols.charAt(j)) {
                        wordCount++;
                    }
                }
            }
        }
        System.out.println(wordCount);
    }

}
