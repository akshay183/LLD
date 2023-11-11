public class ForeignBankFactory extends BankFactory{
    @Override
    public BankAccount createAccount(String accountName) {

        return switch (accountName) {
            case "Deluxe" -> new DeluxeAccount();
            default -> null;
        };
    }
}
