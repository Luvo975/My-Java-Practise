public class BankAccount{
    private double balance;

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        else{
            System.out.println("You need amount that is greater than 0 please!");
        }
    }

    public double getBalance(){
        return balance;
    }
}
   