package Question_5;

public class BankTransferPayment extends Payment {
    
    @Override
    public void processPayment(double amount){
        System.out.println("Processing an amount of GH$ " + amount + " via Bank Transfer.");
    }
}
