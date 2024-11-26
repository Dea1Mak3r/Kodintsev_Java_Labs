package Lab_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupCommodity {
    private static final Set<Integer> uniqueGroupIds = new HashSet<>();
    private int uniqueId;
    private Commodity[] commodities;

    public GroupCommodity() {
        this.commodities = new Commodity[0];
    }

    public GroupCommodity(int uniqueId, Commodity[] commodities) {
        setUniqueId(uniqueId);
        setCommodities(commodities);
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        if (uniqueId <= 0) {
            throw new IllegalArgumentException("ID группы должен быть положительным числом.");
        }
        if (uniqueGroupIds.contains(uniqueId)) {
            throw new IllegalArgumentException("ID группы должен быть уникальным. Такой ID уже существует: " + uniqueId);
        }
        if (this.uniqueId != 0) {
            uniqueGroupIds.remove(this.uniqueId);
        }
        this.uniqueId = uniqueId;
        uniqueGroupIds.add(uniqueId);
    }

    public Commodity[] getCommodities() {
        return commodities.clone();
    }

    public void setCommodities(Commodity[] commodities) {
        if (commodities == null) {
            throw new IllegalArgumentException("Массив товаров не может быть null.");
        }
        this.commodities = commodities.clone();
    }

    public Commodity getCommodity(int index) {
        if (index < 0 || index >= commodities.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива.");
        }
        return commodities[index];
    }

    public void setCommodity(int index, Commodity commodity) {
        if (index < 0 || index >= commodities.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива.");
        }
        commodities[index] = commodity;
    }

    public void addCommodity(Commodity commodity) {
        if (commodity == null) {
            throw new IllegalArgumentException("Добавляемый объект не может быть null.");
        }
        commodities = Arrays.copyOf(commodities, commodities.length + 1);
        commodities[commodities.length - 1] = commodity;
    }

    public void removeCommodityById(int id) {
        commodities = Arrays.stream(commodities)
                .filter(c -> c.getId() != id)
                .toArray(Commodity[]::new);
    }

    public void sortByRetailPrice() {
        Arrays.sort(commodities, (c1, c2) -> Double.compare(c1.getRetailPrice(), c2.getRetailPrice()));
    }

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
