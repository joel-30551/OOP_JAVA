package Question_1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("WB-201234587", "", 1000);
        
        System.out.println("A Valid Deposit (200)");
        myAccount.deposit(200);
        System.out.println();

        System.out.println("An Invalid Deposit (Zero amount)");
        myAccount.deposit(0.00);
        System.out.println();

        System.out.println("An Invalid Deposit (Negative amount)");
        myAccount.deposit(-300);
        System.out.println();

        System.out.println("A Valid withdrawal (120.20)");
        myAccount.withdraw(120.20);
        System.out.println();

        System.out.println("An Invalid withdrawal (A Negative amount)");
        myAccount.withdraw(-150);
        System.out.println();

        System.out.println("An Invalid withdrawal (Amount > Balance)");
        myAccount.withdraw(20000);
        
    }
}
