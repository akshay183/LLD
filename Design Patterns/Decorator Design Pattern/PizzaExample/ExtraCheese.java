public class ExtraCheese implements PizzaDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return this.basePizza.getCost() + 25;
    }
}
