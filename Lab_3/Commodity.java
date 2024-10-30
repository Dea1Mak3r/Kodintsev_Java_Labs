package Lab_3;

public class Commodity {
    private int id;
    private String productCode;
    private String name;
    private double wholesalePrice;
    private double retailPrice;
    private String description;

    // Конструктор по умолчанию
    public Commodity() {}

    // Конструктор с параметрами
    public Commodity(int id, String productCode, String name, double wholesalePrice, double retailPrice, String description) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.description = description;
    }

    // Getters и Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Переопределение метода toString() для форматированного вывода
    @Override
    public String toString() {
        return String.format("Commodity{id=%d, productCode='%s', name='%s', wholesalePrice=%.2f, retailPrice=%.2f, description='%s'}",
                id, productCode, name, wholesalePrice, retailPrice, description);
    }
}