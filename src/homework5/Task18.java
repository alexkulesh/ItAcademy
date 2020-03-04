package homework5;

/**
 * Task 18. You have the string with text. Find all punctuation marks and count them.
 *
 */
public class Task18 {

    public static void main(String[] args) {
        String text = "This sentence has . , - : ; ? !";
        String symbols = ".,-;:?!";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < symbols.length(); j++) {
                if (text.charAt(i) == symbols.charAt(j)) {//Compares symbols of one string to another.
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}


