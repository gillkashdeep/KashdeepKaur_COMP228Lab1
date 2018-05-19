public class BankAccount {

    String accountNumber;
    String name;
    Double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public BankAccount (String accountNumber, String name, Double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;

    }

}
