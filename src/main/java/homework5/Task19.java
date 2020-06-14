package homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Task 19. Count total number of words in the text. Consider that
 * words can be divided by several spaces, there are also can be
 * spaces in the beginning and at the end of the text.
 */

public class Task19 {
    public static void main(String[] args) {
        String text = "The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.\n" +
                "Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.\n" +
                "Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).\n" +
                "11212312 1321312 1321312";
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("");
        text = text.trim();
        String[] words = text.split("[\\pP\\s&&[^']]+");
        for (String string : words) {
            System.out.println(string);
        }
        System.out.println("Number of words in the text - " + words.length);
    }
}
