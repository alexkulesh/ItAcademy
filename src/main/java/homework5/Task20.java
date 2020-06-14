package homework5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Task 20. There is string with the text. Print a text that consists from the last
 * letters of all words.
 */

public class Task20 {
    public static void main(String[] args) {
        String text = "The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.";
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("");
        text = text.trim();
        String[] textAsArray = text.split("[\\pP\\s&&[^']]+");
        Arrays.stream(textAsArray).forEach(s -> System.out.print(s.charAt(s.length() - 1)));
    }
}
