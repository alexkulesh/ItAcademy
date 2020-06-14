package homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Task 18. Find all punctuation marks in the string and
 * count their total number.
 */

public class Task18 {
    private static final Pattern PATTERN = Pattern.compile("[\\p{Punct}]");

    public static void main(String[] args) {
        String string = "Text with several, ; : punctuational marks, . ";
        int sumOfPunctuation = 0;
        Matcher matcher = PATTERN.matcher(string);
        while (matcher.find()) {
            sumOfPunctuation++;
        }
        System.out.println(sumOfPunctuation);
    }
}
