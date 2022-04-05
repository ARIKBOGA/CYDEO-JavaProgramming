package day35_Encapsulation.Tasks2;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null)
            this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber > 0)
            this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance > 0)
            this.balance = balance;
        else System.out.println("Balance can not be less than zero ");
    }

    public void deposit(double deposit) {
        if (deposit > 0)
            balance += deposit;
        else System.out.println("Deposit amount must be greater than zero");
    }

    public void withdraw(double withdraw) {
        if (withdraw <= 0) {
            System.out.println("Withdraw amount must be greater than zero");
            return;
        }
        if (balance >= withdraw) balance -= withdraw;
        else System.out.println("Insufficient balance!");
    }

    public void checkBalance() {
        System.out.println(accountHolder + "'s balance is: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Jonas", 1234567890, 325_000);
        BankAccount b2 = new BankAccount("Mikkel", 342134, 221_000);
        BankAccount b3 = new BankAccount("Magnus", 986876, 465_000);
        b1.deposit(100_000);
        b2.withdraw(250_000);
        b3.checkBalance();
        b1.withdraw(-50_000);
        b3.deposit(-200_000);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}