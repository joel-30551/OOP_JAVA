package Question_5;

public class CreditCardPayment extends Payment {
    
    @Override
    public void processPayment(double amount){
        System.out.println("Processing an amount of GH$ " + amount + " via Credit Card.");
    }
}
