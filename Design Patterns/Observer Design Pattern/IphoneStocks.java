import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class IphoneStocks implements Observable {

    private Integer stocks;
    private List<Observer> observers;

    public IphoneStocks() {
        this.stocks = 0;
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {

        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer ob = iterator.next();
            if (Objects.equals(ob, observer)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void setData(Integer newStock) {
        if(this.stocks <= 0 && newStock>0) {
            stocks = newStock;
            observers.forEach(observer -> observer.update());
        }

        stocks = newStock;
    }

    @Override
    public String getData() {
        return this.stocks.toString();
    }
}
