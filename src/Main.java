import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список горячих напитков
        List<Product> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(new HotDrinks("Coffee", 100, 250, 80)); // Кофе, 250 мл, 80 °C
        hotDrinksList.add(new HotDrinks("Tea", 80, 200, 70));     // Чай, 200 мл, 70 °C
        hotDrinksList.add(new HotDrinks("Hot Chocolate", 120, 300, 85)); // Горячий шоколад, 300 мл, 85 °C

        // Создаем торговый автомат для горячих напитков
        HotDrinksVendingMachine hotDrinksMachine = new HotDrinksVendingMachine(hotDrinksList);

        // Логика взаимодействия с торговым автоматом
        System.out.println("Получение продукта 'Tea':");
        HotDrinks tea = hotDrinksMachine.getProduct("Tea", 200); // Поиск чая объемом 200 мл
        if (tea != null) {
            System.out.println("Найдено: " + tea);
        } else {
            System.out.println("Продукт не найден!");
        }

        System.out.println("\nПопытка получить 'Hot Chocolate' с объемом 300 мл:");
        HotDrinks hotChocolate = hotDrinksMachine.getProduct("Hot Chocolate", 300); // Поиск горячего шоколада
        if (hotChocolate != null) {
            System.out.println("Найдено: " + hotChocolate);
        } else {
            System.out.println("Продукт не найден!");
        }

        System.out.println("\nПопытка получить 'Latte':");
        HotDrinks latte = hotDrinksMachine.getProduct("Latte", 250); // Продукта нет в списке
        if (latte != null) {
            System.out.println("Найдено: " + latte);
        } else {
            System.out.println("Продукт не найден!");
        }
    }
}