package pr24.num3;

public class Main {
    public static void main(String[] args) {
        InternetOrdersManager ordersManager = new InternetOrdersManager();

        Dish dish1 = new Dish(30, "Спагетти Карбонара", "Итальянская паста в сливочном соусе");
        Dish dish2 = new Dish(12, "Греческий салат", "Свежий салат с фетой и оливками");
        Dish dish3 = new Dish(18, "Бургер Делюкс", "Сочная говяжья котлета");

        Drink drink1 = new Drink(13, "Бренди", "Алкогольный напиток", 0.45, DrinkTypeEnum.BRANDY);
        Drink drink2 = new Drink(4, "Черный чай", "Горячий чай с бергамотом", 0.0, DrinkTypeEnum.BLACK_TEA);
        Drink drink3 = new Drink(9, "Водка", "Белый медведь", 0.5, DrinkTypeEnum.VODKA);


        Order order1 = new TableOrder();
        order1.add(dish1);
        order1.add(drink1);
        order1.setCustomer(new Customer("Антон", "Бебров", 29, new Address("Москва", 115210, "Моховая", 13, 'А', 3)));
        ordersManager.add(order1);

        Order order2 = new TableOrder();
        order2.add(dish2);
        order2.add(dish2);
        order2.add(drink2);
        order2.setCustomer(new Customer("Николай", "Бобрин", 45, new Address("Казань", 136293, "Профсоюзная", 1, 'В', 1)));
        ordersManager.add(order2);

        Order order3 = new TableOrder();
        order3.add(dish1);
        order3.add(dish3);
        order3.add(drink3);
        order3.setCustomer(new Customer("Максим", "Максимов", 36, new Address()));
        ordersManager.add(order3);


        ordersManager.show();
        System.out.println();

        System.out.println("Количество Спагетти Карбонара в заказах: " + ordersManager.itemsQuantity("Спагетти Карбонара"));
        System.out.println("Количество Красного вина в заказах: " + ordersManager.itemsQuantity("Красное вино"));
        System.out.println("Количество Греческого салата в заказах: " + ordersManager.itemsQuantity("Греческий салат"));
        System.out.println();

        System.out.println("Общее количество заказов: " + ordersManager.ordersQuantity());
        System.out.println("Суммарная стоимость заказов: " + ordersManager.ordersCostSummary());
        System.out.println();

        System.out.println("Удаление двух заказов");
        ordersManager.remove();
        ordersManager.remove();

        System.out.println("Общее количество заказов: " + ordersManager.ordersQuantity());
        System.out.println();

        System.out.println("Информация об оставшихся заказах:");
        ordersManager.show();
    }
}