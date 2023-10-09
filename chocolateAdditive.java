package CoffeeMorningSandwich;

public class chocolateAdditive extends coffeeAdditive {
    public chocolateAdditive(baseCoffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", шоколад";
    }

    public double cost() {
        return coffee.cost() + 1;
    }
}