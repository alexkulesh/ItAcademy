package main.java.homework9.task25;

/**
 * Task 25. Create hierarchy of classes describing bank cards.
 * Hierarchy must have at least 3 levels.
 */
public class Main {
    public static void main(String[] args) {
        DebitCard belCard = new DebitCard("3000 BYN", 3.5);
        belCard.setCardName("Belcard");
        belCard.setPinCode(1111);
        belCard.setCardNumber("2222 4444 2222 1111");
        belCard.setCvv2(123);
        belCard.setIsInternational("Local");
        belCard.setTypeOfCurrency("BYN");
        System.out.println(belCard.toString());

        DepositCard halva = new DepositCard(7,"Halva");
        halva.setCardName("Visa Classic");
        halva.setPinCode(2222);
        halva.setCardNumber("5555 1111 2222 9999");
        halva.setCvv2(121);
        halva.setIsInternational("International");
        halva.setTypeOfCurrency("All Currencies");
        System.out.println(halva.toString());

        CreditCard visaGold = new CreditCard("55 days", "20000 BYN", 2.2, 4.2);
        visaGold.setCardName("Visa Gold");
        visaGold.setPinCode(5555);
        visaGold.setCardNumber("3333 5555 2222 1111");
        visaGold.setCvv2(344);
        visaGold.setIsInternational("International");
        visaGold.setTypeOfCurrency("All Currencies");
        System.out.println(visaGold.toString());
    }
}
