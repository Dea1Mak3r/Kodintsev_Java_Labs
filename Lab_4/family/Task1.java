package Lab_4.family;

public class Task1 {
    public static void main(String[] args) {
        Family family = new Family(5);

        family.addMember(new Parent("Parent1"));
        family.addMember(new Child("Child1"));
        family.addMember(new GrandChild("GrandChild1"));
        
        System.out.println("\nВывод информации о членах семьи:");
        family.displayAll();

        System.out.println("\nПодсчет количества объектов:");
        family.countMembers();

        System.out.println("\nУдаление последнего элемента:");
        family.popMember();
        
        System.out.println("\nПодсчет после удаления:");
        family.countMembers();
    }
}
