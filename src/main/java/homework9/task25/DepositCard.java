package main.java.homework9.task25;

public class DepositCard extends DebitCard {
    private double annualPercentage;
    private String additionalName;

    public DepositCard(String cardName, int pinCode, String cardNumber, int cvv2, String isInternational, String typeOfCurrency, String amountOfMoney, double cashBack, double annualPercentage, String additionalName) {
        super(cardName, pinCode, cardNumber, cvv2, isInternational, typeOfCurrency, amountOfMoney, cashBack);
        this.annualPercentage = annualPercentage;
        this.additionalName = additionalName;
    }

    public DepositCard(String amountOfMoney, double cashBack, double annualPercentage, String additionalName) {
        super(amountOfMoney, cashBack);
        this.annualPercentage = annualPercentage;
        this.additionalName = additionalName;
    }

    public DepositCard(double annualPercentage, String additionalName) {
        this.annualPercentage = annualPercentage;
        this.additionalName = additionalName;
    }

    public double getAnnualPercentage() {
        return annualPercentage;
    }

    public void setAnnualPercentage(double annualPercentage) {
        this.annualPercentage = annualPercentage;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    @Override
    public void setAmountOfMoney(String amountOfMoney) {
        super.setAmountOfMoney(amountOfMoney);
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
        return "DepositCard{" +
                "annualPercentage=" + annualPercentage +
                ", additionalName='" + additionalName + '\'' +
                '}';
    }
}
