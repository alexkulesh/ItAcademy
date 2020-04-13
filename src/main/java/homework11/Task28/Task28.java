package homework11.Task28;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Task 28. Create list of pupils grades using ArrayList, fill it up with
 * random grades. Find the highest grade in the class using iterator.
 */
public class Task28 {
    public static void main(String[] args) {
        List<Integer> listOfPupils = new Random()
                .ints(10, 0, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listOfPupils.toString());
        ListIterator<Integer> iterator = listOfPupils.listIterator();
        Integer maxElem = listOfPupils.get(0);
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (listOfPupils.get(element) > maxElem) {
                maxElem = listOfPupils.get(element);
            }
        }
        System.out.println("The highest grade in the class is - " + maxElem);
    }
}