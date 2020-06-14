package homework3;

/**
 * Task 15. Determine the sum of array elements
 * located between the minimum and maximum values.
 */
public class Task15 {
    public static void main(String[] args) {
        int marks[] = {2, 1, 3, 4, 5, 2, 5};
        int max = marks[0];
        int min = marks[0];
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
                indexMax = i;
            }
            if (min > marks[i]) {
                min = marks[i];
                indexMin = i;
            }
            System.out.print(marks[i] + " ");
        }
        if (indexMax > indexMin) {
            for (int j = indexMin + 1; j < indexMax; j++) {
                sum += marks[j];
            }
        } else if (indexMax < indexMin) {
            for (int j = indexMax + 1; j < indexMin; j++) {
                sum += marks[j];
            }
        }
        System.out.println("");
        System.out.println(sum);
    }
}
