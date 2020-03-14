package main.java.homework9.task25;

public class DebitCard extends Card {
    private String amountOfMoney;
    private double cashBack;

    public DebitCard(String cardName, int pinCode, String cardNumber, int cvv2, String isInternational, String typeOfCurrency, String amountOfMoney, double cashBack) {
        super(cardName, pinCode, cardNumber, cvv2, isInternational, typeOfCurrency);
        this.amountOfMoney = amountOfMoney;
        this.cashBack = cashBack;
    }

    public DebitCard(String amountOfMoney, double cashBack) {
        this.amountOfMoney = amountOfMoney;
        this.cashBack = cashBack;
    }

    public DebitCard() {
    }

    public String getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(String amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public double getCashBack() {
        return cashBack;
    }

    public void setCashBack(double cashBack) {
        this.cashBack = cashBack;
    }

    @Override
    public void setPinCode(int pinCode) {
        super.setPinCode(pinCode);
    }

    @Override
    public void setCardNumber(String cardNumber) {
        super.setCardNumber(cardNumber);
    }

    @Override
    public void setCvv2(int cvv2) {
        super.setCvv2(cvv2);
    }

    @Override
    public void setIsInternational(String isInternational) {
        super.setIsInternational(isInternational);
    }

    @Override
    public void setTypeOfCurrency(String typeOfCurrency) {
        super.setTypeOfCurrency(typeOfCurrency);
    }

    @Override
    public void setCardName(String cardName) {
        super.setCardName(cardName);
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "amountOfMoney='" + amountOfMoney + '\'' +
                '}';
    }
}
