package Manager;

public class BusinessAccount extends SavingsAccount {

    final double BUSINESS_ACCOUNT_INCENTIVE = 20.00;

    public BusinessAccount(String accountNumber, double accountBalance, double interest) {
        super(accountNumber, accountBalance, interest);
    }

    @Override
    public double CalculateMonthlyInterest() {
        double new_balance = super.CalculateMonthlyInterest() +
                BUSINESS_ACCOUNT_INCENTIVE;

        setAccountBalance(new_balance);
        return new_balance;
    }
}

