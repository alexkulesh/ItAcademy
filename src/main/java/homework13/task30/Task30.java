package main.java.homework13.task30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Task 30. Create file with text. Read it, count all punctuation marks and words.
 */
public class Task30 {
    public static void main(String[] args) {
        int sumOfWords = 0;
        int sumOfPunctuation = 0;
        File file = new File("C:\\Users\\USER\\Desktop\\MyText.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String result = reader.readLine();
            while (Objects.nonNull(result)) {
                System.out.println(result);
                Pattern pattern = Pattern.compile("[\\p{Punct}]");
                Matcher matcher = pattern.matcher(result);
                while (matcher.find()) {
                    sumOfPunctuation++;
                }
                String[] number = result.split("[^0-9]+");
                String[] words = result.split("[\\pP\\s&&[^']]+");
                sumOfWords += (words.length - number.length);
                result = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("There is IOException");
        }
        System.out.println("There are(is) " + sumOfWords + " word(-s) in the file.");
        System.out.println("There are(is) " + sumOfPunctuation + " punctuation mark(-s) in the file");
    }
}
