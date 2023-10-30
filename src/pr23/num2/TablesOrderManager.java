package pr23.num2;

import java.util.HashMap;
import java.util.Map;

public class TablesOrderManager {
    private Map<Integer, Order> orders = new HashMap<>();

    public void addOrder(int tableNumber, Order order) {
        orders.put(tableNumber, order);
    }

    public void removeOrder(int tableNumber) {
        orders.remove(tableNumber);
    }

    public double getTableTotalCost(int tableNumber) {
        Order order = orders.get(tableNumber);
        if (order != null) {
            return order.getTotalCost();
        } else {
            return 0.0;
        }
    }
}