package CoffeeMorningSandwich;

public class milkAdditive extends coffeeAdditive {
    public milkAdditive(baseCoffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", молоко";
    }

    public double cost() {
        return coffee.cost() + 0.5;
    }
}
