public class Toppling implements PizzaDecorator{

    BasePizza basePizza;

    public Toppling(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 10;
    }
}
