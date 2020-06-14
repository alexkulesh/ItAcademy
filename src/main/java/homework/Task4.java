package homework;

/**
 * Task 4. There is a rectangular hole with sizes a and b.
 * Find out if it is possible to cover the hole with round
 * cardboard.
 */

public class Task4 {
    public static void main(String[] args) {
        double a = 7;
        double b = 3;
        double radius = 5;
        if(radius >= Math.sqrt(a*a + b*b)/4){
            System.out.println("The cardboard will cover the hole");
        }
        else{
            System.out.println("The cardboard will not cover the hole");
        }

    }
}
