package Question_1;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount");
        }else{
            balance += amount;
            System.out.println("A deposit has been made to your account.Your new balance:" + balance);
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount!");
        }
        else if (amount > balance) {
            System.out.println("You Have Insufficient Balance In Your Account");
        }else{
            balance -= amount;
            System.out.println("Withdrawal Succesfull.Your new balance:" + balance);
        }
    }

    

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    
}