package Lab_3;
public class Main {
    public static void main(String[] args) {

        Commodity commodity1 = new Commodity(1, "P001", "Laptop", 500.0, 700.0, "High-end laptop");
        Commodity commodity2 = new Commodity(2, "P002", "Smartphone", 300.0, 450.0, "Latest model smartphone");
        Commodity commodity3 = new Commodity(3, "P003", "Tablet", 200.0, 320.0, "Compact tablet");

//        Commodity commodity4 = new Commodity(1, "123456", "Abobus", 228, 336, "Description");
//        Commodity commodity5 = new Commodity(4, "", "aBobaFett", 111, 400, "asdasdadwqdaddw");
//        Commodity commodity6 = new Commodity(5, "56789", "LustOfAss the game", -123, 336, "Description");
//        Commodity commodity7 = new Commodity(6, "4EST", "Stalker 2", 10000, -1000, "");


        GroupCommodity group = new GroupCommodity(101, new Commodity[] {commodity1, commodity2});

//        GroupCommodity invalidGroup = new GroupCommodity(1, new Commodity[] {commodity7, commodity5, commodity6});
        
        System.out.println("\nГруппа с нормальными товарами:\n");
        System.out.println(group);

        group.addCommodity(commodity3);
        System.out.println("\n\nДобавили третий товар:\n");
        System.out.println(group);

        group.removeCommodityById(2);
        System.out.println("\n\nУдаляем товар с id = 2:\n");
        System.out.println(group);

        group.sortByRetailPrice();
        System.out.println("\n\nПосле сортировки:\n");
        System.out.println(group);
    }
}
