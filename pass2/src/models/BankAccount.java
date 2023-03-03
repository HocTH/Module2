package models;

public abstract class BankAccount {
    private int id;
    private String accountCode;
    private String accountHolder;
    private String createDate;

    public BankAccount() {
    }

    public BankAccount(int id, String accountCode, String accountHolder, String createDate) {
        this.id = id;
        this.accountCode = accountCode;
        this.accountHolder = accountHolder;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountCode='" + accountCode + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }

    public abstract String getInformationToCSV();
}
