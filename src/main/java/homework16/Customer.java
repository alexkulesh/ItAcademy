package homework16;

import java.util.List;

public class Customer extends Thread {
    private String customer;
    private List<String> products;
    Cashbox cashbox;

    public Customer(final String customer, final List<String> products, Cashbox cashbox) {
        this.customer = customer;
        this.products = products;
        this.cashbox = cashbox;
    }

    public void run() {
        cashbox.print(customer, products);
    }
}
