package homework3;

/**
 * Task 16. Create array, fill it up with random elements,
 * print it, reverse it, and print it again(it's better
 * not to create new array).
 */
public class Task16 {
    public static void main(String[] args) {
        int array[] = new int[5];
        System.out.println("Normal array");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("");
        System.out.println("Reversed array");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

