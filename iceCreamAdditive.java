package CoffeeMorningSandwich;

public class iceCreamAdditive extends coffeeAdditive {
    public iceCreamAdditive(baseCoffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", мороженое";
    }

    public double cost() {
        return coffee.cost() + 1;
    }
}