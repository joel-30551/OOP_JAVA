package Question_5;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();

        payments.add(new CreditCardPayment());
        payments.add(new MobileMoneyPayment());
        payments.add(new BankTransferPayment());

        double amounts [] = {2000.50,245.80,1000.00};

        for(int i = 0;i < payments.size();i++){
            payments.get(i).processPayment(amounts[i]);
        }

    }
}
