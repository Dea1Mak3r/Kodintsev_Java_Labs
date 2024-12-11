package Commands;

interface Command {
    void execute();
}

class OpenMenuCommand implements Command {
    private Menu menu;

    public OpenMenuCommand(Menu menu)
    {
        this.menu = menu;
    }

    public void execute()
    {
        menu.openMenu();
    }
}

class CloseMenuCommand implements Command {
    private Menu menu;

    public CloseMenuCommand(Menu menu)
    {
        this.menu = menu;
    }

    public void execute()
    {
        menu.closeMenu();
    }
}

class SelectItemCommand implements Command {
    private Menu menu;

    public SelectItemCommand(Menu menu)
    {
        this.menu = menu;
    }

    public void execute()
    {
        menu.selectItem();
    }
}

class Menu
{
    public void openMenu()
    {
        System.out.println("Menu has been opened.");
    }

    public void closeMenu()
    {
        System.out.println("Menu has been closed.");
    }

    public void selectItem()
    {
        System.out.println("Item has been selected.");
    }
}

class User
{
    private Command command;

    public void applyCommand(Command command)
    {
        this.command = command;
    }

    public void click()
    {
        command.execute();
    }
}