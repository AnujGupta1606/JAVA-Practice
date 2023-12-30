package Inheritace;

public class SBmain {
     

    public static void main(String[] args) {
       
        Bankacc AG45 = new Bankacc("AG45", 500);

       
        AG45.deposit(1000);
        System.out.println(AG45.getBalance());
        
        AG45.withdraw(600);
        System.out.println( AG45.getBalance());

		
        Savingacc SA12 = new Savingacc("SA12",450);

        // Withdraw $300 from SA1234
        SA12.withdraw(300);
        System.out.println(SA12.getBalance());

     
		
        Savingacc SA1000 = new Savingacc("SA1000",300);

       
        SA1000.withdraw(250);
        System.out.println(SA1000.getBalance());      		
    }
}


