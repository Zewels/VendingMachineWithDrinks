// Класс HotDrinks, представляющий горячие напитки, наследуется от класса Product
public class HotDrinks extends Product
{

    // Поле для хранения объема напитка (в мл)
    private int volume;

    // Поле для хранения температуры напитка (в градусах Цельсия)
    private int temperature;

    // Конструктор с двумя параметрами, вызывает конструктор суперкласса Product
    public HotDrinks(String name, int price)
    {
        super(name, price); // Передаем параметры имени и цены в класс Product
    }

    // Конструктор с четырьмя параметрами, для создания объекта с указанием всех характеристик
    public HotDrinks(String name, int price, int volume, int temperature)
    {
        super(name, price); // Передаем имя и цену в класс Product
        this.volume = volume; // Устанавливаем объем напитка
        this.temperature = temperature; // Устанавливаем температуру напитка
    }

    // Геттер для получения объема напитка
    public int getVolume()
    {
        return volume;
    }

    // Сеттер для установки объема напитка
    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    // Геттер для получения температуры напитка
    public int getTemperature()
    {
        return temperature;
    }

    // Сеттер для установки температуры напитка
    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }

    // Переопределение метода toString для вывода информации о горячем напитке
    @Override
    public String toString()
    {
        return "HotDrinks{" +
                "volume=" + volume + // Вывод объема напитка
                ", temperature=" + temperature + // Вывод температуры напитка
                ", name=" + getName() + // Вывод имени напитка (получаем через суперкласс)
                '}';
    }
}
