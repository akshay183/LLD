public class ObserverDesignManager {

    public static void main(String[] args) {

        Observable iphoneStocks = new IphoneStocks();

        Observer phoneObserver1 = new PhoneObserver(19129938, iphoneStocks);
        Observer phoneObserver2 = new PhoneObserver(78723783, iphoneStocks);
        Observer emailObserver = new EmailObserver("carry@gmail.com", iphoneStocks);

        iphoneStocks.register(phoneObserver1);
        iphoneStocks.register(phoneObserver2);
        iphoneStocks.register(emailObserver);

        iphoneStocks.setData(20);
        System.out.println();
        iphoneStocks.setData(-1);
        System.out.println();
        iphoneStocks.remove(phoneObserver1);
        iphoneStocks.setData(21);
    }
}