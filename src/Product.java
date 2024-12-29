public class Product
{

    // Поле для хранения имени продукта
    private String name;

    // Поле для хранения цены продукта
    private int price;

    // Конструктор для инициализации объекта Product с именем и ценой
    public Product(String name, int price)
    {
        this.name = name;  // Устанавливаем имя продукта
        this.price = price; // Устанавливаем цену продукта
    }

    // Геттер для получения имени продукта
    public String getName()
    {
        return name;
    }

    // Сеттер для изменения имени продукта
    public void setName(String name)
    {
        this.name = name;
    }

    // Геттер для получения цены продукта
    public int getPrice()
    {
        return price;
    }

    // Сеттер для изменения цены продукта
    public void setPrice(int price)
    {
        this.price = price;
    }

    // Переопределение метода toString для вывода информации о продукте в удобочитаемом виде
    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' + // Вывод имени продукта
                ", price=" + price +     // Вывод цены продукта
                '}';
    }
}
