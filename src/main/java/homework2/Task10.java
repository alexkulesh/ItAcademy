package homework2;

/**
 *Task 10. You should calculate the sum of the digits of this number.
 */
public class Task10 {
    public static void main(String[] args) {
        int number = 1232;
        int digit = 0;
        int sum = 0;
        while(number != 0){
           digit = number % 10;
           number = number / 10;
           sum += digit;
        }
        System.out.println(sum);
    }
}
