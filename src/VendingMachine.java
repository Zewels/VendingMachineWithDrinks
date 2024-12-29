// Интерфейс VendingMachine определяет поведение, характерное для торгового автомата
public interface VendingMachine {

    /**
     * Метод для получения продукта из торгового автомата по имени.
     *
     * @param name имя продукта, который требуется получить
     */
    void getProduct(String name);
}
