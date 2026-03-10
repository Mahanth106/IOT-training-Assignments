public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance");
    }
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC123", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}