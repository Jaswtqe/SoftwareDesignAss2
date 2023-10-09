package CoffeeMorningSandwich;
import java.util.*;

public class CoffeeOrder {
    private baseCoffee coffee;
    private double totalPrice;

    public CoffeeOrder(baseCoffee coffee) {
        this.coffee = coffee;
        this.totalPrice = coffee.cost();
    }

    public void addAdditive(coffeeAdditive additive) {
        this.coffee = additive;
        this.totalPrice += additive.cost();
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public baseCoffee getCoffee() {
        return coffee;
    }
    //наличкой
    public void paymentProcessInCash(double cashAmount) {
        if (cashAmount >= totalPrice) {
            double change = cashAmount - totalPrice;
            System.out.println("Заказ оплачен наличными. Сдача: $" + change);
        } else {
            System.out.println("Недостаточно наличных для оплаты заказа.");
        }
    }
    //картой
    public void paymentProcessCard(String cardNumber) {
        // Предположим, у нас есть список допустимых карт
        List<String> validCards = Arrays.asList("1234-5678-9012-3456", "5678-1234-9012-3456");

        // Проверяем, является ли карта допустимой
        if (validCards.contains(cardNumber)) {
            // Проверяем, достаточно ли средств на карте
            if (isPaymentSuccessful(cardNumber, totalPrice)) {
                System.out.println("Заказ оплачен картой: " + cardNumber);
            } else {
                System.out.println("Ошибка оплаты: Недостаточно средств на карте.");
            }
        } else {
            System.out.println("Ошибка оплаты: Карта не допустима.");
        }
    }
    // Метод для проверки успешности платежа
    private boolean isPaymentSuccessful(String cardNumber, double amount) {
        // Предположим, что у нас есть фиксированный список допустимых карт
        List<String> validCardNumbers = Arrays.asList("1234-5678-9012-3456", "5678-1234-9012-3456");

        // Проверяем, является ли карта допустимой
        if (!validCardNumbers.contains(cardNumber)) {
            return false;
        }

        // Предположим, что у нас есть достаточно средств на карте
        double cardBalance = getCardBalance(cardNumber); // Получить баланс карты

        if (cardBalance >= amount) {
            System.out.println("Списание средств с карты " + cardNumber + " на сумму $" + amount + " выполнено успешно.");
            return true;
        } else {
            return false;
        }
    }

    // Метод для получения баланса карты (предположим, что у нас есть информация о балансе)
    private double getCardBalance(String cardNumber) {
        // В реальной системе это было бы обращение к банковской базе данных или API
        // Для этого примера просто вернем фиксированный баланс
        if ("1234-5678-9012-3456".equals(cardNumber)) {
            return 100.0; // Предположим, что баланс карты составляет $100
        } else if ("5678-1234-9012-3456".equals(cardNumber)) {
            return 200.0; // Предположим, что баланс карты составляет $200
        } else {
            return 0.0; // Если карта не найдена, баланс равен нулю
        }
    }
    public void choosePaymentMethod() {
        System.out.println("Выберите метод оплаты: ");
        System.out.println("1. Наличные");
        System.out.println("2. Карта");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите сумму наличных: $");
            double cashAmount = scanner.nextDouble();
            paymentProcessInCash(cashAmount);
        } else if (choice == 2) {
            scanner.nextLine(); // Считываем перевод строки после ввода числа
            System.out.print("Введите номер карты: ");
            String cardNumber = scanner.nextLine();
            paymentProcessCard(cardNumber);
        } else {
            System.out.println("Неверный выбор метода оплаты.");
        }
    }
}

