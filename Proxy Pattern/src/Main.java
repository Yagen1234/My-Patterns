public class Main {
    public static void main(String[] args) {
        BankAccount account = new SecureBankAccountProxy("secret");

        account.deposit(125.20);
        account.withdraw(50.5);
        double balance = account.getBalance();

        System.out.println("Current Balance: " + balance);
    }
}
