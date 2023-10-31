import java.util.HashMap;
import java.util.Map;

public class TableOrdersManager implements OrdersManager {
    private final Order[] orders;

    public TableOrdersManager() {
        orders = new Order[20];
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (Order order : orders) {
            if (order != null) {
                quantity += order.itemsQuantity(itemName);
            }
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (Order order : orders) {
            if (order != null) {
                quantity += order.itemsQuantity(item);
            }
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for (Order order : orders) {
            if (order != null) {
                cost += order.costTotal();
            }
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        int quantity = 0;
        for (Order order : orders) {
            if (order != null) {
                quantity++;
            }
        }
        return quantity;
    }

    public void add(Order order, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < 20) {
            orders[tableNumber] = order;
        }
    }

    public void addItem(MenuItem item, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < 20 && orders[tableNumber] != null) {
            orders[tableNumber].add(item);
        }
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers() {

        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                map.put(i, true);
            }
        }
        return map.keySet().stream().mapToInt(Integer::intValue).toArray();
    }

    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }

    public void remove(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < 20) {
            orders[tableNumber] = null;
        }
    }

    public void remove(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                break;
            }
        }
    }

    public void removeAll(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                System.arraycopy(orders, i + 1, orders, i, orders.length - 1);
            }
        }
    }
}
