package by.homework.maksim.lesson6.task3;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double initialBalance, String accountNumber) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {

        balance += amount;
        System.out.println(amount + balance);
    }

    public void withdraw(double amount) {

        if (amount > balance) {

            return;
        }
        balance -= amount;
        System.out.println(amount + balance);
    }

    public double getBalance() {
        return balance;
    }
}

