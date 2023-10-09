package CoffeeMorningSandwich;
import java.util.*;
public class ShopToCoffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Создаем заказ кофе
        baseCoffee americano = new Espresso();
        CoffeeOrder order = new CoffeeOrder(americano);

        boolean continueAddingAdditive = true;
        System.out.println("Выберите вид кофе:");
        System.out.println("1. Эспрессо");
        System.out.println("2. Американо");
        System.out.println("3. Капучино");

        int coffeeChoice = sc.nextInt();
        baseCoffee coffee;

        switch (coffeeChoice) {
            case 1 -> coffee = new Espresso();
            case 2 -> coffee = new Americano();
            case 3 -> coffee = new Cappuccino();
            default -> {
                System.out.println("Неправильный выбор. Выбран Американо по умолчанию.");
                coffee = new Americano();
            }
        }
        // Выводим информацию о выбранном кофе
        System.out.println("Выбрано: " + coffee.getDescription());


        while (continueAddingAdditive) {
            System.out.println("Выберите декоратор для кофе:");
            System.out.println("1. Молоко");
            System.out.println("2. Шоколад");
            System.out.println("3. Мороженое");
            System.out.println("4. Завершить заказ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> order.addAdditive(new milkAdditive(order.getCoffee()));
                case 2 -> order.addAdditive(new chocolateAdditive(order.getCoffee()));
                case 3 -> order.addAdditive(new iceCreamAdditive(order.getCoffee()));
                case 4 -> continueAddingAdditive = false;
                default -> System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        }


        // Выводим информацию о заказе
        System.out.println("Заказ: " + order.getDescription() + ", стоимость: $" + order.getTotalPrice());

        // Покупатель выбирает метод оплаты
        order.choosePaymentMethod();
    }
}

