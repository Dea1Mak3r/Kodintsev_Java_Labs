package Lab_5;

public class Task12 {
    public static void main(String[] args)
    {
        Manager Ivan = new Manager(60000);
        Ivan.getSalary();
        Ivan.assignTask();

        Developer Oleg = new Developer(150000);
        Oleg.getSalary();

        Designer Innokentiy = new Designer(80000);
        Innokentiy.getSalary();
    }
}

abstract class Employee
{
    protected int salary;

    protected abstract void getSalary();
}

interface ProjectManager {
    void assignTask();
}

class Manager extends Employee implements ProjectManager
{
    public Manager(int salary)
    {
        this.salary = salary;
    }

    @Override
    public void getSalary()
    {
        System.out.println("Manager's salary is: " + salary + "\n");
    }

    @Override
    public void assignTask()
    {
        System.out.println("Manager assigns tasks to the team.\n");
    }
}

class Developer extends Employee
{
    public Developer(int salary)
    {
        this.salary = salary;
    }

    @Override
    public void getSalary()
    {
        System.out.println("Developer's salary is: " + salary + "\n");
    }
}

class Designer extends Employee
{
    public Designer(int salary)
    {
        this.salary = salary;
    }

    @Override
    public void getSalary()
    {
        System.out.println("Designer's salary is: " + salary + "\n");
    }
}
