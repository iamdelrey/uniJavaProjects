package pr23.num2;

public class RestaurantOrderTest {
    public static void main(String[] args) {
        Item juice = new Drink(5.99, "J7 Апельсиновый", "Освежающий апельсиновый сок");
        Item pizza = new Dish(19.99, "Четыре сезона", "Увеличенная порция моцареллы, ветчина, пикантная пепперони, кубики брынзы, томаты, шампиньоны, итальянские травы, фирменный томатный соус");
        Item salad = new Dish(13.49, "Салат с киноа, томатами и авокадо", "Киноа с авокадо, помидорами, шпинатом, огурцами юдзу, грецкими орехами и секретной заправкой");

        Order orderTable1 = new Order();
        orderTable1.addItem(juice);
        orderTable1.addItem(juice);
        orderTable1.addItem(pizza);

        Order orderTable2 = new Order();
        orderTable2.addItem(juice);
        orderTable2.addItem(salad);
        orderTable1.addItem(pizza);

        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.addOrder(1, orderTable1);
        orderManager.addOrder(2, orderTable2);

        System.out.println("Table 1 Total Cost: $" + orderManager.getTableTotalCost(1));
        System.out.println("Table 2 Total Cost: $" + orderManager.getTableTotalCost(2));
    }
}