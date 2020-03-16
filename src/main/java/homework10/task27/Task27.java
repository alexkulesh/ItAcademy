package main.java.homework10.task27;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Task 27. Create collection, fill it up with random numbers.
 * Delete all repeating numbers.
 */
public class Task27 {
    public static void main(String[] args) {
        int capacity = 6;
        final List<Integer> numbers = new ArrayList<>(capacity);
        Random random = new Random();
        for (int i = 0; i <= capacity; i++){
            numbers.add(random.nextInt(10));
        }
        System.out.println(numbers.toString());
        List<Integer> repNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(repNumbers.toString());
    }
}