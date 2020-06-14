package homework3;

/**
 * Task 14. Find number of the highest grade in the class.
 */
public class Task14 {
    public static void main(String[] args) {
        int number = 0;
        int marks [] = new int[10];
        int max = 0;
        for(int i = 0; i < marks.length; i++) {
            marks[i] = (int)(Math.random()*10 + 1);
            if (max < marks[i]) {
                max = marks[i];
            }
            System.out.print(marks[i] + " ");
        }
        System.out.println(" ");
        for(int j = 0; j < marks.length; j++){
            if(marks[j] == max){
                number = j;
                System.out.println("Number of the highest grade - " +  (number + 1));
            }
        }

    }
}
