package homework2;

import static java.lang.Math.pow;

/**
 * Task 12. There is integer, print it in accounting format.
 * For example number 20023143 must be printed as 20 023 143.
 */
public class Task12 {
    public static void main(String[] args) {
        int number = 1120023143;
        int number1 = number;
        int number2;
        int digit = 0;
        while (number1 > 0) {
            number1 = number1 / 10;
            digit++;
        }
        for (int i = digit - 1; i >= 0; i--) {
            number2 = number / (int) pow(10, i);
            number2 = number2 % 10;
            System.out.print(number2);
            if (i % 3 == 0) {
                System.out.print(" ");
            }
        }
    }
}

