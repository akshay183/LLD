import java.util.Scanner;

public class FactoryMainApp {

    public static void main(String[] args) {

        try{
            Branch client = new Branch(new ForeignBankFactory());
            Scanner scanner = new Scanner(System.in);

            String accountType = scanner.next();
            BankAccount bankAccount = client.getAccount(accountType);

            bankAccount.registerUser();
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
            throw e;
        }

    }
}
