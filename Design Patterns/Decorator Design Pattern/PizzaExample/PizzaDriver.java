public class PizzaDriver {

    public static void main(String[] args) {
        BasePizza basePizza = new MarghretaPizza();
        BasePizza extraCheese = new ExtraCheese(basePizza);
        BasePizza topplingExtraCheesePizza = new Toppling(extraCheese);
        BasePizza moreCheesePizza = new ExtraCheese(topplingExtraCheesePizza);
        System.out.println(moreCheesePizza.getCost());
    }
}
