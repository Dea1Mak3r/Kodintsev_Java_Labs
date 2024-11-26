package Lab_3;

import java.util.HashSet;
import java.util.Set;

public class Commodity {
    private static final Set<Integer> uniqueIds = new HashSet<>();
    private int id;
    private String productCode;
    private String name;
    private double wholesalePrice;
    private double retailPrice;
    private String description;

    public Commodity() {}

    public Commodity(int id, String productCode, String name, double wholesalePrice, double retailPrice, String description) {
        setId(id);
        setProductCode(productCode);
        setName(name);
        setWholesalePrice(wholesalePrice);
        setRetailPrice(retailPrice);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("ID должен быть неотрицательным числом.");
        }
        if (uniqueIds.contains(id)) {
            throw new IllegalArgumentException("ID должен быть уникальным. Такой ID уже существует: " + id);
        }
        if (this.id != 0) {
            uniqueIds.remove(this.id);
        }
        this.id = id;
        uniqueIds.add(id);
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        if (productCode == null || productCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Код продукта не может быть пустым.");
        }
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название не может быть пустым.");
        }
        this.name = name;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        if (wholesalePrice < 0) {
            throw new IllegalArgumentException("Оптовая цена не может быть отрицательной.");
        }
        this.wholesalePrice = wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        if (retailPrice < 0) {
            throw new IllegalArgumentException("Розничная цена не может быть отрицательной.");
        }
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Commodity{id=%d, productCode='%s', name='%s', wholesalePrice=%.2f, retailPrice=%.2f, description='%s'}",
                id, productCode, name, wholesalePrice, retailPrice, description);
    }
}
