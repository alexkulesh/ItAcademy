package homework9.task25;

public abstract class Card {
    private String cardName;
    private int pinCode;
    private String cardNumber;
    private int cvv2;
    private String isInternational;
    private String typeOfCurrency;

    public Card(String cardName, int pinCode, String cardNumber, int cvv2, String isInternational, String typeOfCurrency) {
        this.cardName = cardName;
        this.pinCode = pinCode;
        this.cardNumber = cardNumber;
        this.cvv2 = cvv2;
        this.isInternational = isInternational;
        this.typeOfCurrency = typeOfCurrency;
    }

    public Card() {
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv2() {
        return cvv2;
    }

    public void setCvv2(int cvv2) {
        this.cvv2 = cvv2;
    }

    public String getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(String isInternational) {
        this.isInternational = isInternational;
    }

    public String getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public void setTypeOfCurrency(String typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

}
