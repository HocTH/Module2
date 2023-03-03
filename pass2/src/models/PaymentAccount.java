package models;

public class PaymentAccount extends BankAccount{
    private String cardNumber;
    private Double paymentAmount;

    public PaymentAccount() {
    }

    public PaymentAccount(String cardNumber, Double paymentAmount) {
        this.cardNumber = cardNumber;
        this.paymentAmount = paymentAmount;
    }

    public PaymentAccount(int id, String accountCode, String accountHolder, String createDate, String cardNumber, Double paymentAmount) {
        super(id, accountCode, accountHolder, createDate);
        this.cardNumber = cardNumber;
        this.paymentAmount = paymentAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +"id=" + getId() +
                ", accountCode=" + getAccountCode() +
                ", accountHolder=" + getAccountHolder()  +
                ", createDate=" + getCreateDate() +
                ", cardNumber='" + cardNumber  +
                ", paymentAmount=" + paymentAmount +
                "} " ;
    }

    @Override
    public String getInformationToCSV() {
        return getId()+","+getAccountCode()+","+getAccountHolder()+","+getCreateDate()+
                ","+getCardNumber()+","+getPaymentAmount();
    }
}
