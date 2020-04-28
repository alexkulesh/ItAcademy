package homework16;

import java.util.List;

public class Cashdesk {
    synchronized void print(String customer, List<String> products) {
        System.out.println(customer + " " + products);
    }
}
