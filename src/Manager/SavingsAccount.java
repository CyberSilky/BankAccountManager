package Manager;

public class SavingsAccount extends ChackingAccount {

    private double interest;

    public SavingsAccount(String accountNumber, double accountBalance, double interest) {
        super(accountNumber, accountBalance);
        this.interest = interest;

    }

    public double CalculateMonthlyInterest(){
        double total_interest = getAccountBalance() * getInterest();
        double new_balance = getAccountBalance() + total_interest;

        setAccountBalance(new_balance);

        return new_balance;
    }
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
