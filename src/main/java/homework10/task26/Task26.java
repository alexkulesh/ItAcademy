package homework10.task26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Task 26. Create list of pupils grades using ArrayList, fill it up with
 * random grades. Delete all poor grades out of the list.
 */
public class Task26 {
    public static void main(String[] args) {
        List<Integer> listOfPupils = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            listOfPupils.add(random.nextInt(10));
        }
        List<Integer> goodGrades = getList(listOfPupils);
        System.out.println(listOfPupils.toString());
        System.out.println(goodGrades.toString());
    }

    private static List<Integer> getList(List<Integer> goodGrades) {
        final List<Integer> newList = new ArrayList<>(goodGrades);
        newList.removeIf(i -> i < 4);
        return newList;
    }
}
