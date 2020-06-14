package homework6.bankomat;

import java.util.Scanner;

public class Service {
    public static Scanner in = new Scanner(System.in);
    int balance;
    int pinCode;
    boolean status;
    int sum;
    int a20;
    int a50;
    int a100;


    public Service(int balance, int pinCode) {
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public void enterCode(){
        System.out.println("Enter the code please");
        int code = in.nextInt();
        if(code != pinCode){
            status = false;
        } else {
            status = true;
        }
    }

    public void anothertransaction(){
        System.out.println("Would you like to make another transaction?"+
                "\n 1. Yes" +
                "\n 2. No");
        int choice = in.nextInt();
        if(choice == 1){
            transaction();
        }
        if(choice == 2){
            System.out.println("Thank you. Goodbye.");
        }
    }

    public void transaction() {
        if(status == false){
            System.out.println("You have entered wrong password");
        }
        if(status == true){
        System.out.println("What transaction would you like to choose?" +
                "\n 1. Deposit" +
                "\n 2. Withdraw" +
                "\n 3. Exit");
        int choice = in.nextInt();
        if(choice == 1){
            System.out.println("What sum of money you would like to deposit?");
            deposit(in.nextInt());
            anothertransaction();
        }
        if(choice == 2){
            System.out.println("What sum of money you would like to withdraw?");
            withdraw(in.nextInt());
            anothertransaction();
        }
        if(choice == 3){
            System.out.println("Thank you. Goodbye.");
        }}
    }

    public void deposit(int money) {
        balance = balance + money;
        System.out.println("You have deposit: " + money);
        System.out.println("Now your balance is: " + balance);
    }

    public void withdraw(int money) {
        if (money > balance) {
            System.out.println("You have insufficient amount of money");
        }
        if (money % 20 != 0) {
            System.out.println("You can't withdraw such amount of money");
        } else {
            balance = balance - money;
            System.out.println("You have withdraw: " + money);
            System.out.println("Now your balance is: " + balance);
            while (sum != money) {
                a20 = (int) (Math.random() * 20);
                a50 = (int) (Math.random() * 20);
                a100 = (int) (Math.random() * 20);
                sum = a20 * Money.money.get(0) + a50 * Money.money.get(1) + a100 * Money.money.get(2);
            }
            System.out.println("You have been given these amount of money:");
            System.out.println(a20 + " '20 dollars' " + a50 + " '50 dollars' " + a100 + " '100 dollars' ");
        }
    }

}
