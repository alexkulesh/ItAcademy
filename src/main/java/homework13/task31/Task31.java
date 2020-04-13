package homework13.task31;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


/**
 * Task 31. There is a file with text in which numbers are present.
 * Print, calculate the sum of numbers, remove all duplicate numbers
 * and print them again.
 */

public class Task31 {
    public static void main(String[] args) {
        List<String> number1 = new ArrayList<>();
        File file = new File("C:\\Users\\USER\\Desktop\\MyText.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String result = reader.readLine();
            while (Objects.nonNull(result)) {
                System.out.println(result);
                String[] numbers = result.split("[^0-9]+");
                List<String> number = Arrays.asList(numbers);
                number.stream()
                        .filter(s -> number != null)
                        .map(Integer::valueOf)
                        .collect(Collectors.toList());
                for (String s : number) {
                    number1.add(s);
                }
                result = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("There is IOException");
        }
        System.out.println(number1.toString());
        int sumOfElements = number1.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Sum of all numbers in the file = " + sumOfElements);
        number1 = number1.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(number1.toString());
    }
}
