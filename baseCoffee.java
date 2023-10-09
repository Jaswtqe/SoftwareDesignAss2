package CoffeeMorningSandwich;

public abstract class baseCoffee {
    String description = "Неизвестный кофе";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
