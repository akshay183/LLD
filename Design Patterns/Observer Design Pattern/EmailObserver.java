public class EmailObserver implements Observer {

    private String emailId;
    private Observable observable;

    public EmailObserver(String mail, Observable observable) {
        this.emailId = mail;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(this.emailId + " gets informed about newStock:"+ observable.getData());
    }
}
