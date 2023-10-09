package CoffeeMorningSandwich;

public class Americano extends baseCoffee {
    @Override
    public String getDescription() {
        return "Американо";
    }

    @Override
    public double cost() {
        return 2.5; // Стоимость американо
    }
}
