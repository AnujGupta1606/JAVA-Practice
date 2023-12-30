package Inheritace;

public class Bankacc {
   
    private String accountNumber;
    private double balance;

    public Bankacc(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double Balance){
            balance=Balance;
    }
    public String getAccno() {
        return accountNumber;
    }
    public void setBalance(String AccountNumber){
            accountNumber=AccountNumber;
    }
}



