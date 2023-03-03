package models;

public class SavingAccount extends BankAccount{
    private double savingAmount;
    private String startDate;
    private String endDate;
    private Double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(int id, String accountCode, String accountHolder, String createDate) {
        super(id, accountCode, accountHolder, createDate);
    }

    public SavingAccount(double savingAmount, String startDate, String endDate, Double interestRate) {
        this.savingAmount = savingAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestRate = interestRate;
    }
    public double getSavingAmount() {
        return savingAmount;
    }

    public void setSavingAmount(double savingAmount) {
        this.savingAmount = savingAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public SavingAccount(int id, String accountCode, String accountHolder, String createDate,
                         double savingAmount, String startDate, String endDate, Double interestRate) {
        super(id, accountCode, accountHolder, createDate);
        this.savingAmount = savingAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "id=" + getId() +
                ", accountCode=" + getAccountCode() +
                ", accountHolder=" + getAccountHolder()  +
                ", createDate=" + getCreateDate() +
                ", savingAmount=" + getSavingAmount() +
                ", startDate=" + getStartDate() +
                ", endDate=" + getEndDate()  +
                ", interestRate=" + getInterestRate() +
                '}';
    }

    @Override
    public String getInformationToCSV() {
        return        getId() +
                "," + getAccountCode() +
                "," + getAccountHolder() +
                "," + getCreateDate() +
                "," + getSavingAmount() +
                "," + getStartDate() +
                "," + getEndDate() +
                "," + getInterestRate();
    }
}
