package homework4;

/**
 * Task 17. Create two-dimensional array, fill it up
 * in "butterfly" way, like in given example:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
public class Task17 {
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1;
                if (i < array.length / 2) {
                    if (j < i || j > array.length - 1 - i) {
                        array[i][j] = 0;
                    }
                } else if (i < array.length - 1) {
                    if (j < array.length - 1 - i || j > i) {
                        array[i][j] = 0;
                    }
                }
                System.out.print(" ");
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
