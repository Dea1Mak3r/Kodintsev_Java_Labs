package Lab_4;

class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Это родитель");
    }
}

class Child extends Parent {
    
    public Child(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Это ребенок");
    }
}

class GrandChild extends Child {

    public GrandChild(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Это внук");
    }
}

class Family {
    private Parent[] members;
    private int size;

    public Family(int capacity) {
        members = new Parent[capacity];
        size = 0;
    }

    public boolean addMember(Parent member) {
        if (size < members.length) {
            members[size++] = member;
            return true;
        } else {
            System.out.println("Массив заполнен, невозможно добавить нового члена семьи.");
            return false;
        }
    }

    public Parent popMember() {
        if (size > 0) {
            Parent removedMember = members[--size];
            members[size] = null;
            return removedMember;
        } else {
            System.out.println("Массив пуст, нет элементов для удаления.");
            return null;
        }
    }

    public void countMembers() {
        int parentCount = 0;
        int childCount = 0;
        int grandChildCount = 0;

        for (int i = 0; i < size; i++) {
            if (members[i] instanceof GrandChild) {
                grandChildCount++;
            } else if (members[i] instanceof Child) {
                childCount++;
            } else if (members[i] instanceof Parent) {
                parentCount++;
            }
        }

        System.out.println("Количество Parent: " + parentCount);
        System.out.println("Количество Child: " + childCount);
        System.out.println("Количество GrandChild: " + grandChildCount);
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            members[i].display();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Family family = new Family(5);

        family.addMember(new Parent("Parent1"));
        family.addMember(new Child("Child1"));
        family.addMember(new GrandChild("GrandChild1"));
        
        System.out.println("Вывод информации о членах семьи:");
        family.displayAll();

        System.out.println("\nПодсчет количества объектов:");
        family.countMembers();

        System.out.println("\nУдаление последнего элемента:");
        family.popMember();
        
        System.out.println("\nПодсчет после удаления:");
        family.countMembers();
    }
}
