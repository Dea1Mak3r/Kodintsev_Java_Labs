package Lab_3;
public class Main {
    public static void main(String[] args) {
        // Создаем несколько товаров
        Commodity commodity1 = new Commodity(1, "P001", "Laptop", 500.0, 700.0, "High-end laptop");
        Commodity commodity2 = new Commodity(2, "P002", "Smartphone", 300.0, 450.0, "Latest model smartphone");
        Commodity commodity3 = new Commodity(3, "P003", "Tablet", 200.0, 320.0, "Compact tablet");
        
        // Создаем группу товаров и добавляем туда созданные товары
        GroupCommodity group = new GroupCommodity(101, new Commodity[] {commodity1, commodity2});
        
        // Выводим информацию о группе товаров
        System.out.println("Initial group:");
        System.out.println(group);

        // Добавляем новый товар в группу
        group.addCommodity(commodity3);
        System.out.println("After adding a new commodity:");
        System.out.println(group);

        // Удаляем товар по id
        group.removeCommodityById(2);
        System.out.println("After removing commodity with id 2:");
        System.out.println(group);

        // Сортируем массив товаров по розничной цене
        group.sortByRetailPrice();
        System.out.println("After sorting by retail price:");
        System.out.println(group);
    }
}
