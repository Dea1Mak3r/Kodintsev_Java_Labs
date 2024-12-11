package Commands;

public class Lab6Task4 {
    public static void main(String[] args)
    {
        Menu menu = new Menu();

        Command closeMenu = new CloseMenuCommand(menu);
        Command openMenu = new OpenMenuCommand(menu);
        Command selectItem = new SelectItemCommand(menu);

        User user = new User();

        user.applyCommand(openMenu);
        user.click();
        user.applyCommand(selectItem);
        user.click();
        user.applyCommand(closeMenu);
        user.click();
    }
}
