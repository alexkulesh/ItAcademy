package homework16.additional;

import sun.misc.Lock;

import java.util.ArrayDeque;

public class Cashdesk extends Thread {
    ArrayDeque<Customer> customerArrayDeque;
    Lock lock;
    int number;

    public Cashdesk(ArrayDeque<Customer> customerArrayDeque, int number, Lock lock) {
        this.customerArrayDeque = customerArrayDeque;
        this.number = number;
        this.lock = lock;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void run() {
        while (true) {
            try {
                sleep(1000);
                Customer customer;
                if (customerArrayDeque != null && customerArrayDeque.peek() != null) {
                    customer = customerArrayDeque.peek();
                    if (customer != null) {
                        lock.lock();
                        System.out.println(customerArrayDeque.getFirst() + ", served at cashdesk number " + getNumber());
                        customerArrayDeque.poll();
                        lock.unlock();
                    }
                } else break;
            } catch (NullPointerException | InterruptedException e) {
                System.out.println("Something is going wrong!");
                break;
            }
        }
    }
}


