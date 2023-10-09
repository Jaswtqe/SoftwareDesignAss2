package CoffeeMorningSandwich;

public class Espresso extends baseCoffee {
    @Override
    public String getDescription() {
        return "Эспрессо";
    }

    @Override
    public double cost() {
        return 2.0; // Стоимость эспрессо
    }
}