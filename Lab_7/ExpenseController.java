package Lab_7;

import java.util.List;

class ExpenseController {
    private Expense model;
    private ExpenseView view;

    public ExpenseController(Expense model, ExpenseView view) {
        this.model = model;
        this.view = view;
    }

    public void setAmount(int amount) {
        model.setAmount(amount);
    }

    public int getAmount() {
        return model.getAmount();
    }

    public void addCategory(String category) {
        model.addCategory(category);
    }

    public void setCategories(List<String> categories) {
        model.setCategories(categories);
    }

    public List<String> getCategories() {
        return model.getCategories();
    }

    public void updateView() {
        view.displayInfo(model.getAmount(), model.getCategories());
    }
}
