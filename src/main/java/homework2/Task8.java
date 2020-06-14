package homework2;

/**
 * Task 8. Сalculate factorial of numbers from 1 to 10.
 */
public class Task8 {
    public static void main(String[] args) {
        int fact = 1;
        int i = 1;
        while(i <= 10){
           fact = fact * i;
           i++;
        }
        System.out.println("Factorial of number 10 equals " + fact);
    }
}
