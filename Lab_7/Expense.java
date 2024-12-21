package Lab_7;

import java.util.ArrayList;
import java.util.List;

class Expense {
    private int amount;
    private List<String> categories;

    public Expense(int var1, List<String> var2) {
        setAmount(var1);
        setCategories(var2);
    }

    public void setAmount(int var1) {
        if (var1 < 0) {
            throw new IllegalArgumentException("Значение не может быть меньше нуля!");
        } else {
            this.amount = var1;
        }
    }

    public void setCategories(List<String> var2) {
        if (var2 == null || var2.isEmpty()) {
            throw new IllegalArgumentException("Список категорий не может быть пустым!");
        } else {
            this.categories = new ArrayList<>(var2);
        }
    }

    public void addCategory(String category) {
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Категория не может быть пустой!");
        }
        if (!categories.contains(category)) {
            categories.add(category);
        }
        else
        {
            throw new IllegalArgumentException("Такая категория уже есть в списке!");
        }
    }

    public int getAmount() {
        return amount;
    }

    public List<String> getCategories() {
        return new ArrayList<>(categories);
    }

    @Override
    public String toString() {
        return "Expense{" +
                "amount=" + amount +
                ", categories=" + categories +
                '}';
    }
}