package by.homework.maksim.lesson6.task3;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double initialBalance, String accountNumber) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0){
            System.out.println("amount не положительная");
        }
        balance += amount;

    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
        }
        {

            return;
        }

    }

    public double getBalance() {
        return balance;
    }
}

