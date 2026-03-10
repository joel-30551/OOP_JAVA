package Question_6;

public class BankATM implements ATMOperations {
    private double balance;

    @Override
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Your withdrawal of GH$ " + amount + " was successful.");
        }else{
            System.out.println("You have insuficient balance in your account.");
        }
    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Your deposit of GH$ " + amount + " was successful.");
    }

    @Override
    public void checkBalance(){
        System.out.println("Your current balance: GH$ " + balance);
    }

}
