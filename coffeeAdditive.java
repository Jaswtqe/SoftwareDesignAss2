package CoffeeMorningSandwich;

public abstract class coffeeAdditive extends baseCoffee{
    protected baseCoffee coffee;

    public coffeeAdditive(baseCoffee coffee){
        this.coffee=coffee;
    }
    public abstract String getDescription();
}
