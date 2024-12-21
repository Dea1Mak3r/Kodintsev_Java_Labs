package Lab_7;
import java.util.List;

class ExpenseView
{
    public void displayInfo(int amount, List<String> categoryes)
    {
        System.out.println("Category: " + categoryes + "\nAmount: " + amount);
    }
}