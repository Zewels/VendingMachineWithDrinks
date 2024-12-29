// Класс BottleOfWater представляет бутылку воды и наследуется от класса Product
public class BottleOfWater extends Product {

    // Поле для хранения объема воды в бутылке (в мл)
    private int volume;

    // Конструктор с двумя параметрами, вызывает конструктор суперкласса Product
    public BottleOfWater(String name, int price) {
        super(name, price); // Передаем имя и цену в класс Product
    }

    // Конструктор с тремя параметрами, для создания объекта с указанием объема
    public BottleOfWater(String name, int price, int volume) {
        super(name, price); // Передаем имя и цену в класс Product
        this.volume = volume; // Устанавливаем объем воды
    }

    // Геттер для получения объема воды
    public int getVolume() {
        return volume;
    }

    // Сеттер для установки объема воды
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Переопределение метода toString для вывода информации о бутылке воды
    @Override
    public String toString() {
        return "BottleOfWater{" +
                "volume=" + volume + // Вывод объема воды
                ", name:" + getName() + // Вывод имени продукта (получаем через суперкласс)
                '}';
    }
}
