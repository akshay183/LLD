
// this is our client which will integrate our code
public class Branch {

    private final BankFactory bankFactory;


    public Branch(BankFactory bankFactory) {
        this.bankFactory = bankFactory;
    }

    public BankAccount getAccount(String accountName) {

        BankAccount account = null;
        return bankFactory.createAccount(accountName);
    }
}
