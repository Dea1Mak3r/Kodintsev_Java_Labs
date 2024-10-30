package Lab_3;
import java.util.Arrays;

class GroupCommodity {
    private int uniqueId;
    private Commodity[] commodities;

    // Конструктор по умолчанию
    public GroupCommodity() {
        this.commodities = new Commodity[0];
    }

    // Конструктор, принимающий массив объектов
    public GroupCommodity(int uniqueId, Commodity[] commodities) {
        this.uniqueId = uniqueId;
        this.commodities = commodities;
    }

    // Getters и Setters
    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Commodity[] getCommodities() {
        return commodities;
    }

    public void setCommodities(Commodity[] commodities) {
        this.commodities = commodities;
    }

    // Методы для работы с массивом
    public Commodity getCommodity(int index) {
        return commodities[index];
    }

    public void setCommodity(int index, Commodity commodity) {
        commodities[index] = commodity;
    }

    // Добавление объекта в массив
    public void addCommodity(Commodity commodity) {
        commodities = Arrays.copyOf(commodities, commodities.length + 1);
        commodities[commodities.length - 1] = commodity;
    }

    // Удаление объекта из массива по id
    public void removeCommodityById(int id) {
        commodities = Arrays.stream(commodities)
                .filter(c -> c.getId() != id)
                .toArray(Commodity[]::new);
    }

    // Сортировка массива по возрастанию розничной цены
    public void sortByRetailPrice() {
        Arrays.sort(commodities, (c1, c2) -> Double.compare(c1.getRetailPrice(), c2.getRetailPrice()));
    }

    // Переопределение метода toString() для вывода полной информации
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GroupCommodity{uniqueId=" + uniqueId + ", commodities=[\n");
        for (Commodity commodity : commodities) {
            sb.append(commodity.toString()).append("\n");
        }
        sb.append("]}");
        return sb.toString();
    }
}