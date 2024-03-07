public class BankAccount {
    private int accountNumber;
    private double balance;
    private String owner;

    public BankAccount (int accountNumber, double balance, String owner){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }

    public void display(){
        System.out.println("Account Number :"+ accountNumber);
        System.out.println("Balance:"+ balance);
        System.out.println("Owner Name: "+ owner);
    }

    public static void main (String [] args){

        BankAccount b = new BankAccount(5299,12222,"Zihad");

        b.display();
    }


}
