package Question_6;

public class Main {
    public static void main(String[] args) {
        ATMOperations atm = new BankATM();

        atm.deposit(1000.75);
        System.out.println();
        atm.withdraw(200.35);
        System.out.println();
        atm.checkBalance();
    }
}
