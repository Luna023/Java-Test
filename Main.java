package JavaTest1;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Account account1 = new Account("12345", "John Doe", 1000);

        atm.addAccount(account1);

        atm.start();
    }
}
