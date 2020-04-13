package homework16;

import java.util.List;

public class Cashbox {
    synchronized void print(String customer, List<String> products) {
        System.out.println(customer + " " + products);
    }
}
