package homework16;

import java.util.Arrays;

public class TaskCB {
    public static void main(String[] args) throws InterruptedException {
        Cashbox cashbox = new Cashbox();
        Customer customer1 = new Customer("first", Arrays.asList("Bread", "Butter", "Milk"), cashbox);
        Customer customer2 = new Customer("second", Arrays.asList("Cheese", "Potatoes", "Tomatoes"), cashbox);
        customer1.start();
        customer2.start();
    }
}
