package CoffeeMorningSandwich;

public class Cappuccino extends baseCoffee {
    @Override
    public String getDescription() {
        return "Капучино";
    }

    @Override
    public double cost() {
        return 3.0; // Стоимость капучино
    }
}