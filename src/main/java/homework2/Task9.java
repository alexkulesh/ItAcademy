package homework2;

/**
 * Task 9. There is a sequence of random numbers,
 * find and print the largest of them.
 */
public class Task9 {
    public static void main(String[] args) {
        int max = 0;
        int x = (int)(Math.random()*10);
        while (x != 0){
            x = (int)(Math.random()*10);
            System.out.print(x + " ");
            if(max < x){
                max = x;
            }
        }
        System.out.println("");
        System.out.println("The largest number - " + max);
    }
}
