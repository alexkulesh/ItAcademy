package homework16;

import java.util.Arrays;

/**
 * Task Cashdesk(1 касса). Write a program simulating cash desks in a store.
 * There are several cash desks working simultaneously. Each customer is a separate stream.
 * The total number of customers may be greater than the number of cash desks, but at the
 * same time, more buyers cannot be processed than there are working cash desks. Each buyer
 * has a set of goods that must be introduced during the service process.
 */

public class TaskCD {
    public static void main(String[] args) throws InterruptedException {
        Cashdesk cashdesk = new Cashdesk();
        Customer customer1 = new Customer("first", Arrays.asList("Bread", "Butter", "Milk"), cashdesk);
        Customer customer2 = new Customer("second", Arrays.asList("Cheese", "Potatoes", "Tomatoes"), cashdesk);
        customer1.start();
        customer2.start();
    }
}
