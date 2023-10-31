package pr23.num3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Апельсиновый сок J7", "Сок из апельсинов", 5.0);
        Dish dish2 = new Dish("Паста карбонара", "Спагетти с томатным соусом", 12.0);
        Dish dish3 = new Dish("Салат Цезарь", "Классический салат с курицей", 8.0);

        OrderManager orderManager = new OrderManager(10);

        Order order1 = new Order();
        order1.add(dish1);
        order1.add(dish2);
        orderManager.add(order1, 1);

        Order order2 = new Order();
        order2.add(dish2);
        order2.add(dish3);
        orderManager.add(order2, 2);

        orderManager.addDish(dish3, 1);

        double totalCost = orderManager.ordersCostSummary();
        System.out.println("Общая стоимость всех заказов: " + totalCost);

        int pizzaQuantity = orderManager.dishQuantity("Паста карбонара");
        System.out.println("Количество блюда \"Паста карбонара\" во всех заказах: " + pizzaQuantity);

        String[] dishNames = orderManager.getOrders()[1].dishesNames();
        System.out.println("Названия блюд в заказе 2: " + String.join(", ", dishNames));

        orderManager.removeOrder(2);

        int freeTable = orderManager.freeTableNumber();
        System.out.println("Номер свободного стола: " + freeTable);

        int[] freeTables = orderManager.freeTableNumbers();
        System.out.println("Свободные столы: " + Arrays.toString(freeTables));
    }
}