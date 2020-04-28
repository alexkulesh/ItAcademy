package homework16.additional;

import sun.misc.Lock;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * Task Cashdesk additional(3 кассы). Write a program simulating cash desks in a store.
 * There are several cash desks working simultaneously. Each customer is a separate stream.
 * The total number of customers may be greater than the number of cash desks, but at the
 * same time, more buyers cannot be processed than there are working cash desks. Each buyer
 * has a set of goods that must be introduced during the service process.
 */

public class Main {
    public static void main(String[] args) {
        Lock lock = new Lock();
        ArrayDeque<Customer> deque = new ArrayDeque<Customer>();
        deque.add(new Customer("first", Arrays.asList("Beef", "Potatoes", "Cheese")));
        deque.add(new Customer("second", Arrays.asList("Jam", "Butter", "Bread")));
        deque.add(new Customer("third", Arrays.asList("Biscuits", "Chocolate", "Water")));
        deque.add(new Customer("fourth", Arrays.asList("Wine", "Beer", "Water")));
        deque.add(new Customer("fifth", Arrays.asList("Milk", "Cheese", "Wheat flour")));
        deque.add(new Customer("sixth", Arrays.asList("Water", "Pork", "Ketchup")));
        Cashdesk cashdesk1 = new Cashdesk(deque, 1, lock);
        Cashdesk cashdesk2 = new Cashdesk(deque, 2, lock);
        Cashdesk cashdesk3 = new Cashdesk(deque, 3, lock);
        cashdesk1.start();
        cashdesk2.start();
        cashdesk3.start();
    }
}
