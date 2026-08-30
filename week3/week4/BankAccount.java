package week4;

public class BankAccount {
    static class Account{
    private String accountNumber;
    private String ownerName;
    private double balance;
     public Account(String accountNumber,String ownerName)
     {
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=0;
    }
     public Account(String accountNumber,String ownerName,double balance)
    {
        if( balance<0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=balance;
    }

     public boolean deposit(double amount)
     {
        if(amount>0){
            balance=balance+amount;
            return true;
        } return false;
     }
     
     public boolean withdraw(double amount)
     {
        if(amount>0 && amount<=balance){
        balance=balance-amount;
        return true;
        } return false;
        
     }

     public String getaccountNumber()
     {
        return accountNumber;
     }

      public String getownerName()
      {
        return ownerName;
     }

     public double getbalance()
     {
        return balance;
     }

     @Override
     public String toString()
     {
        return "Account number:"+accountNumber+", Owner name:"+ownerName+", Balance available:"+balance;
     }
     public static void main(String[] args) 
     {
         Account a1=new Account("ACC7694085","Aakansha",6000);
         Account a2=new Account("ACC768408","Ananya",6600);
         System.out.println(a1.deposit(0));
           System.out.println(a1.deposit(-100));
         System.out.println(a1.deposit(5000));
           System.out.println(a2.deposit(2000));
         System.out.println(a1.withdraw(500));
           System.out.println(a1.withdraw(7000));
           System.out.println(a2.withdraw(3000));
         System.out.println(a1);
         System.out.println(a2);
     }
    }
}
