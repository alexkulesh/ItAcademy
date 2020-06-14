package homework6.bankomat;

/**
 * Task Bankomat. Create class and objects which describe ATM.
 * The set of banknotes located in the ATM should be set by three
 * properties: the number of banknotes in nominal value of 20 50 100.
 * Make methods for adding money to an ATM. Make a money-withdrawing
 * feature. The amount of money is transferred to the entrance.
 * The output is a Boolean value (the operation was successful or not).
 * When withdrawing money, the function should print out how many
 * denominations of which denomination the amount is issued. Create a constructor
 * with three parameters - the number of notes. Other - at your discretion.
 */

public class Main {
    public static void main(String[] args) {
        Service service = new Service(4000, 1111);
        service.enterCode();
        service.transaction();
    }
}