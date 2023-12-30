package Inheritace;

public class Savingacc extends Bankacc{
    
        public Savingacc(String accountNumber, double balance) {
        super(accountNumber, balance);
        
    }

     @Override
        public void withdraw(double amount) {
            if (getBalance() - amount < 100) {
                System.out.println("Minimum balance of 100 required!");
            } else {
                super.withdraw(amount);
            }
        }
    }

