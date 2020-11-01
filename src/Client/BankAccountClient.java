package Client;

import java.util.Scanner;

import Manager.BusinessAccount;
import Manager.ChackingAccount;
import Manager.IAccount;
import Manager.SavingsAccount;

public class BankAccountClient {

    public static void main (String[] args) {
        String accountNumber;


        ChackingAccount account = null;


        int option;
        double amount;


        Scanner input = new Scanner(System.in);

        System.out.println(" 1 - Withdrawal");
        System.out.println(" 2 - Deposit");
        System.out.println(" 3 - Balance");
        System.out.print(" Please select an ATM option or press -1 to exit >> ");
        option = input.nextInt();
        input.nextLine();

        System.out.print(" What account do you want to access? ");
        accountNumber = input.nextLine();

        if(accountNumber.startsWith("1"))
        {
            account = new ChackingAccount(accountNumber, 100);
            System.out.println(" This is a checking account");


        }

        else if (accountNumber.startsWith("2")){
            account = new SavingsAccount(accountNumber, 200, .03 );
            System.out.println("This is a savings account");

        }
        else if (accountNumber.startsWith("9")){
            account = new BusinessAccount(accountNumber, 300, .01);
            System.out.println("This is a Business account");


        }
        else
        {
            System.out.println("invalid option");

        }

        while (option != -1 )
        {






            switch (option)
            {
                case 1:
                    System.out.print("What is the amount you want to withdraw?");
                    amount = input.nextDouble();
                    account.accountWithdrawal(amount);
                    System.out.println(account.accountDetails());
                    break;

                case 2:
                    System.out.print("What is the deposit amount?");
                    amount = input.nextDouble();
                    account.accountDeposit(amount);
                    System.out.println(account.accountDetails());
                    break;

                case 3:
                    System.out.println("Your balance is: ");
                    System.out.println(account.accountDetails());



                    break;
            }
            System.out.println(" 1 - Withdrawal");
            System.out.println(" 2 - Deposit");
            System.out.println(" 3 - Balance");
            System.out.print(" Please select an ATM option or press -1 to exit >> ");
            option = input.nextInt();
        }




        }

       // userInput.startsWith("2");

       // if(userInput.startsWith("2"))
        {

        }

       // userInput.startsWith("3");

       // if(userInput.startsWith("3"))
        {

        }

       // else
            {
                System.out.print(" That is an invalid entry ");
            }
    }


//}
