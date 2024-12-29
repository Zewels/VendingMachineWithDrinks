import java.util.List;

// Класс BottleOfWaterVendingMachine реализует интерфейс VendingMachine
// и представляет торговый автомат, продающий бутылки воды
public class BottleOfWaterVendingMachine implements VendingMachine {

    // Список продуктов, доступных в торговом автомате
    private final List<Product> productList;

    // Поле для хранения суммы денег, полученной торговым автоматом
    private int money;

    // Конструктор для инициализации торгового автомата с заданным списком продуктов
    public BottleOfWaterVendingMachine(List<Product> productList) {
        this.productList = productList; // Сохраняем список продуктов
    }

    /**
     * Реализация метода getProduct из интерфейса VendingMachine.
     * Позволяет получить продукт по имени. Увеличивает баланс автомата на цену продукта.
     *
     * @param name имя продукта, который требуется получить
     */
    @Override
    public void getProduct(String name) {
        for (Product product : productList) { // Перебираем список продуктов
            if (product.getName().equals(name)) { // Проверяем совпадение имени
                money += product.getPrice(); // Увеличиваем баланс на цену продукта
                return; // Завершаем выполнение после нахождения продукта
            }
        }
    }

    /**
     * Метод для получения BottleOfWater по имени и объему.
     * Позволяет найти конкретную бутылку воды с заданными характеристиками.
     *
     * @param name   имя продукта
     * @param volume объем бутылки воды (в мл)
     * @return объект BottleOfWater, если найден, иначе null
     */
    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : productList) { // Перебираем список продуктов
            if (product instanceof BottleOfWater) { // Проверяем, является ли продукт бутылкой воды
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume) {
                    // Проверяем совпадение имени и объема
                    return (BottleOfWater) product; // Возвращаем найденный продукт
                }
            }
        }
        return null; // Возвращаем null, если продукт не найден
    }
}
