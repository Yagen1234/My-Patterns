class SecureBankAccountProxy implements BankAccount {
    private RealBank realBankAccount;
    private String password;

    public SecureBankAccountProxy(String password) {
        this.password = password;
        authenticate();
    }

    private void authenticate() {
        if (password.equals("secret")) {
            realBankAccount = new RealBank();
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (realBankAccount != null) {
            realBankAccount.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (realBankAccount != null) {
            realBankAccount.withdraw(amount);
        }
    }

    @Override
    public double getBalance() {
        return (realBankAccount != null) ? realBankAccount.getBalance() : 0.0;
    }
}
