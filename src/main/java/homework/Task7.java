package homework;

/**
 * Task 7. There are two houses measuring a by b and c by d.
 * There is a plot of sizes e and f. Check if these houses are
 * located on this plot. The sides of the houses are parallel
 * to the sides of the plot, otherwise the placement can be any.
 */
public class Task7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int c = 9;
        int d = 1;
        int e = 4;
        int f = 9;
        if(a <= e && c <= e && b + d <= f){
            System.out.println("It would be enough space to place both of houses1");
        } else if(a <= e && d <= e && b + c <= f){
            System.out.println("It would be enough space to place both of houses2");
        } else if(a <= f && d <= f && b + c <= e){
            System.out.println("It would be enough space to place both of houses3");
        } else if(a <= f && c <= f && b + d <= e){
            System.out.println("It would be enough space to place both of houses4");
        } else if(b <= f && d <= f && a + c <= e){
            System.out.println("It would be enough space to place both of houses5");
        } else if(b <= f && c <= f && a + d <= e){
            System.out.println("It would be enough space to place both of houses6");
        } else if(b <= e && c <= e && a + d <= f){
            System.out.println("It would be enough space to place both of houses7");
        } else if(b <= e && d <= e && a + c <= f){
            System.out.println("It would be enough space to place both of houses8");
        } else {
            System.out.println("sss");
        }
    }
}
