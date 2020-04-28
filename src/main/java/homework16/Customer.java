package homework16;

import java.util.List;

public class Customer extends Thread {
    private String customer;
    private List<String> products;
    Cashdesk cashdesk;

    public Customer(final String customer, final List<String> products, Cashdesk cashdesk) {
        this.customer = customer;
        this.products = products;
        this.cashdesk = cashdesk;
    }

    public void run() {
        cashdesk.print(customer, products);
    }
}
