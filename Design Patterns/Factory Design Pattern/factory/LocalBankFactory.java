public class LocalBankFactory extends BankFactory{
    @Override
    public BankAccount createAccount(String accountName) {

        return switch (accountName) {
            case "Personal" -> new PersonalAccount();
            case "Savings" -> new SavingsAccount();
            default -> null;
        };
    }
}
