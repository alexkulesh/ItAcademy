package Homework5;

/**
 * Task 18. You have the string with text. Find all punctuation marks and count them.
 */
public class Task18 {

    public static void main(String[] args) {
        String string = "This sentence has . , - : ; ? !"; 
        String symbols = ".,-;:?!";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < symbols.length(); j++) {
                if (string.charAt(i) == symbols.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}


