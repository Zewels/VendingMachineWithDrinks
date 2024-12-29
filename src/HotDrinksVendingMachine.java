import java.util.List;

// Класс HotDrinksVendingMachine реализует интерфейс VendingMachine
// и представляет торговый автомат, продающий горячие напитки
public class HotDrinksVendingMachine implements VendingMachine
{

    // Список продуктов, доступных в торговом автомате
    private final List<Product> productList;

    // Сумма денег, накопленная торговым автоматом
    private int money;

    // Конструктор для инициализации торгового автомата с заданным списком продуктов
    public HotDrinksVendingMachine(List<Product> productList)
    {
        this.productList = productList; // Сохраняем список продуктов
    }

    /**
     * Метод для получения продукта по имени.
     * Ищет продукт в списке, и если находит — увеличивает деньги в автомате.
     *
     * @param name имя продукта, который требуется получить
     */
    @Override
    public void getProduct(String name)
    {
        // Перебираем все продукты в списке
        for (Product product : productList)
        {
            // Проверяем, совпадает ли имя продукта с заданным
            if (product.getName().equals(name))
            {
                System.out.println("Продукт найден: " + product); // Выводим информацию о продукте
                money += product.getPrice(); // Увеличиваем баланс автомата на цену продукта
                return; // Завершаем выполнение после нахождения продукта
            }
        }
        // Если продукт не найден
        System.out.println("Продукт с именем '" + name + "' не найден.");
    }

    /**
     * Метод для получения горячего напитка по имени и объему.
     *
     * @param name имя продукта
     * @param volume объем напитка
     * @return объект HotDrinks, если найден, иначе null
     */
    public HotDrinks getProduct(String name, int volume)
    {
        // Перебираем все продукты в списке
        for (Product product : productList)
        {
            // Проверяем, является ли продукт горячим напитком
            if (product instanceof HotDrinks)
            {
                HotDrinks hotDrink = (HotDrinks) product;
                // Если имя и объем совпадают — возвращаем найденный напиток
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume)
                {
                    return hotDrink;
                }
            }
        }
        return null; // Если продукт не найден, возвращаем null
    }

    /**
     * Метод для получения горячего напитка по имени, объему и температуре.
     *
     * @param name имя продукта
     * @param volume объем напитка
     * @param temperature температура напитка
     * @return объект HotDrinks, если найден, иначе null
     */
    public HotDrinks getProduct(String name, int volume, int temperature)
    {
        // Перебираем все продукты в списке
        for (Product product : productList)
        {
            // Проверяем, является ли продукт горячим напитком
            if (product instanceof HotDrinks)
            {
                HotDrinks hotDrink = (HotDrinks) product;
                // Если имя, объем и температура совпадают — возвращаем найденный напиток
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature)
                {
                    return hotDrink;
                }
            }
        }
        return null; // Если продукт не найден, возвращаем null
    }

    // Метод для получения накопленной суммы денег в автомате
    public int getMoney()
    {
        return money;
    }
}
