package homework16.additional;

import java.util.List;

public class Customer {
    String name;
    List<String> products;
    public Customer(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }
    @Override
    public String toString() {
        return "Customer " +
                "'" + name + '\'' +
                " purchased " + products;
    }
}
