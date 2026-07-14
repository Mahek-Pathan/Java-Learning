
class Bank{
    int accNum;
    String accName;
    private double balance;
    Bank(int a, String n, int b)
    {
        this.accNum=a;
        this.accName=n;
        this.balance=b;

    }
    public void credit(int amount){
        balance+=amount;
        System.out.println("Amount credited successfully..");
       // System.out.println("Total balance: "+balance);
    }
    public void debit(int amount){
        if(amount>balance){
            System.out.println("ammount exceeded balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount debited successfully...");
            //System.out.println("Total balance remaining: "+balance);
        }

    }
    public void displayBalance(){
    System.out.println("Total Balance: "+balance);
    }
    public void displayDetails(){
        System.out.println("Account Number: "+accNum);
        System.out.println("Account Name: "+accName);
        System.out.println("Balance: "+balance);
    }

}

public class BankAcc {
    public static void main(String[] args){
        Bank b1 = new Bank(1011, "Saving Account", 5000);
        b1.credit(5000);
        b1.debit(5500);
        b1.displayBalance();
        b1.displayDetails();
    }
    
}
