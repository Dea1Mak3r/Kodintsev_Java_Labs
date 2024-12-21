package Lab_7;

import java.util.Arrays;


public class Lab7_task1 {
    public static void main(String[] args)
    {
        Expense model = new Expense(100, Arrays.asList("Food", "Transport"));

        ExpenseView view = new ExpenseView();

        ExpenseController controller = new ExpenseController(model, view);

        controller.updateView();

        controller.setAmount(150);
        controller.addCategory("Entertainment");
        controller.updateView();
    }
}