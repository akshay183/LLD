public class PhoneObserver implements Observer {

    private int phoneNumber;
    private Observable observable;

    public PhoneObserver(int number, Observable observable) {
        this.phoneNumber = number;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(this.phoneNumber + " gets informed of new stocks:" + observable.getData());
    }
}
