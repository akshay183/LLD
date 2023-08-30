public interface Observable {

    void register(Observer observer);
    void remove(Observer observer);
    void setData(Integer newStock);
    String getData();
}
