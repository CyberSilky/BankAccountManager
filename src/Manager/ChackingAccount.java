package Manager;

public class ChackingAccount implements IAccount{

    private String accountNumber;
    private double accountBalance;

    public ChackingAccount(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void accountDeposit(double amount) {
        this.accountBalance += amount;
    }

    @Override
    public void accountWithdrawal(double amount) {
        this.accountBalance -= amount;

    }

    @Override
    public double accountBalance() {
        return getAccountBalance();
    }

    @Override
    public String accountDetails() {
        return "Account #: " + this.accountNumber + " has a balance of: " +
                getAccountBalance();
    }
}
