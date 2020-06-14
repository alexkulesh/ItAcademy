package homework;

/**
 * Task 5. There is a number, and it is sum of money in rubles.
 * Display this number, adding word "рублей" in right form.
 */
public class Task5 {
    public static void main(String[] args) {
        int number = 100000015;
        if (number % 100 >= 11 && number % 100 <= 15){
            System.out.println(number + " рублей");
        } else if (number % 10 == 0) {
            System.out.println(number + " рублей");
        } else if (number % 10 == 1) {
            System.out.println(number + " рубль");
        } else if (number % 10 >= 2 && number % 10 < 5) {
            System.out.println(number + " рубля");
        } else if (number % 10 >= 5 && number % 10 <= 9){
            System.out.println(number + " рублей");
        }
    }
}