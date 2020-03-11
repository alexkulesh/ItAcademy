package homework9.task25;

public class CreditCard extends Card {
    private String gracePeriod;
    private String loanAmount;
    private double creditPercentage;
    private double cashBack;

    public CreditCard(String cardName, int pinCode, String cardNumber, int cvv2, String isInternational, String typeOfCurrency, String gracePeriod, String loanAmount, double creditPercentage, double cashBack) {
        super(cardName, pinCode, cardNumber, cvv2, isInternational, typeOfCurrency);
        this.gracePeriod = gracePeriod;
        this.loanAmount = loanAmount;
        this.creditPercentage = creditPercentage;
        this.cashBack = cashBack;
    }

    public CreditCard(String gracePeriod, String loanAmount, double creditPercentage, double cashBack) {
        this.gracePeriod = gracePeriod;
        this.loanAmount = loanAmount;
        this.creditPercentage = creditPercentage;
        this.cashBack = cashBack;
    }

    public String getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getCreditPercentage() {
        return creditPercentage;
    }

    public void setCreditPercentage(double creditPercentage) {
        this.creditPercentage = creditPercentage;
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
        return "CreditCard{" +
                "gracePeriod='" + gracePeriod + '\'' +
                ", loanAmount=" + loanAmount +
                ", creditPercentage=" + creditPercentage +
                ", cashBack=" + cashBack +
                '}';
    }
}
