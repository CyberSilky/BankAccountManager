package Manager;

public interface IAccount {

    void accountDeposit(double amount);
    void accountWithdrawal(double amount);
    double accountBalance();
    String accountDetails();
}
