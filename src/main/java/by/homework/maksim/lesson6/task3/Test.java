package by.homework.maksim.lesson6.task3;

/**
 * @author ppuchinsky
 */
public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000, "12345");
        bankAccount.deposit(1000);
        bankAccount.withdraw(100);
        System.out.println(bankAccount.getBalance());
    }
}
