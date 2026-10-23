

public class Main{
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposit(0);
        System.out.println("This is how much you have: R"+ account.getBalance());
    }
}

// In main, create an account, deposit money, and print the balance.