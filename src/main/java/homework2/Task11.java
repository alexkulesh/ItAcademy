package homework2;

/**
 * Task 11. There is integer, define if it is prime or not.
 */
public class Task11 {
    public static void main(String[] args) {
        int number = 12;
       if(number == 1 || number == 2){
           System.out.println("Number is prime.");
       }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.println("Number is compound.");
                break;
            }
            if(i == number - 1){
                System.out.println("Number is prime.");
            }
        }
    }
}
