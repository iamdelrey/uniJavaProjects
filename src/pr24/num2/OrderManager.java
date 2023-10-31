package pr24.num2;

import pr23.num2.Item;
import pr24.num1.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<Integer, Order> tableOrders = new HashMap<>();
    private Map<String, Order> internetOrders = new HashMap<>();

    public void addOrder(int tableNumber, Order order) {
        tableOrders.put(tableNumber, order);
    }

    public void addOrder(String address, Order order) {
        internetOrders.put(address, order);
    }

    public Order getOrder(int tableNumber) {
        return tableOrders.get(tableNumber);
    }

    public Order getOrder(String address) {
        return internetOrders.get(address);
    }

    public void removeOrder(int tableNumber) {
        tableOrders.remove(tableNumber);
    }

    public void removeOrder(String address) {
        internetOrders.remove(address);
    }

    public void addPositionToOrder(int tableNumber, Item item) {
        Order order = tableOrders.get(tableNumber);
        if (order != null) {
            order.addItem(item);
        }
    }

    public void addPositionToOrder(String address, Item item) {
        Order order = internetOrders.get(address);
        if (order != null) {
            order.addItem(item);
        }
    }

    public Order[] getInternetOrders() {
        return internetOrders.values().toArray(new Order[0]);
    }

    public double getTotalInternetOrdersCost() {
        double totalCost = 0.0;
        for (Order order : internetOrders.values()) {
            totalCost += order.getTotalCost();
        }
        return totalCost;
    }

    public int getTotalItemQuantity(String itemName) {
        int totalQuantity = 0;
        for (Order order : internetOrders.values()) {
            totalQuantity += order.getItemCount(itemName);
        }
        return totalQuantity;
    }
}
